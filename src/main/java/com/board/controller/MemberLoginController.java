package com.board.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.dto.MemberLoginDto;
import com.board.serv.MemberLoginService;

@Controller
public class MemberLoginController {
	
	@Autowired
	MemberLoginService msl;
	
	@RequestMapping(value="/login")
	public String login() {
		return "member/setMemberLogin";
	}

	
	private static final Logger log = LoggerFactory.getLogger(MemberLoginController.class);
	
	@ResponseBody
	@RequestMapping(value="/loginCheck")
	public String loginCheck(HttpServletRequest request, MemberLoginDto member, Model model) {
		
		
		HttpSession session = request.getSession();
		HashMap<String, Object> reqMap = new HashMap<String,Object>();
		reqMap.put("id", member.getId());
		reqMap.put("password", member.getPassword());
		
		MemberLoginDto memberInfo = msl.loginCheck(reqMap);
		String result = "";
		
		try {
			if(memberInfo == null) {
				result = "N";
			}else{
				session.setAttribute("member", memberInfo);
				session.setAttribute("sesMemId", memberInfo.getId());
				session.setAttribute("seqMember", memberInfo.getSeqMember());
				result = "Y";
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			log.info("SERVICE==========로그인 Exception=========");
		}
		
		
//		System.out.println("------------------------------MemberController.java || /loginCheck  || 컨트롤러 완료~~~~~ result:" +  result );
//		System.out.println("------------------------------MemberController.java || /loginCheck  || 컨트롤러 완료~~~~~ sesMemId(아이디):" + memberInfo.getMemId() );
//		System.out.println("------------------------------MemberController.java || /loginCheck  || 컨트롤러 완료~~~~~ sesMemName(이름):" + memberInfo.getMemName() );
//		System.out.println("------------------------------MemberController.java || /loginCheck  || 컨트롤러 완료~~~~~ sesMemAuth(권한):" + memberInfo.getMemAuth()  );
		return result;
		
	}
	@RequestMapping(value="logout")
	public String logout(HttpServletRequest request) {
		System.out.println("******************Logout********************");
		HttpSession session = request.getSession();
		session.invalidate();
		return "redirect:/getBoardList";
	}
	
}
