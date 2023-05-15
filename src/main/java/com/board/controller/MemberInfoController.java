package com.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.dto.CreateMemberInfoDto;
import com.board.serv.MemberInfoServ;
import com.board.vo.MemberInfoVo;

@Controller
public class MemberInfoController {
	
	
	
	
	@Autowired
	MemberInfoServ msi;
	
	@RequestMapping("/member")
	public String home() {
		return "member/setMemberInsert";
	}
	
	@ResponseBody
    @PostMapping("/setCreateMemberInfo")
	public String setCreateMemberInfo(CreateMemberInfoDto req) {

		
		return msi.setCreateMemberInfo(req);
	}
	
	@RequestMapping(value="getMemberDetail", method=RequestMethod.GET)
	public String getMmeberDetail(@RequestParam("seqMember") int mno, Model model) {
		
		
		model.addAttribute("memberVo", msi.memberInfoDetail(mno));
		
			
		return "member/getMemberDetail";
	}
	
	@RequestMapping(value="setMemberUpdate")
	public String memberUpdateInfo(@RequestParam(value = "seqMember", required= false) int mno, Model model) {
			model.addAttribute("memberVo",msi.memberInfoDetail(mno));
		return "member/setMemberUpdate";
	}
	
	@RequestMapping(value="setMemberUpdateOk", method=RequestMethod.POST)
	public String memberUpdateInfoOk(MemberInfoVo mvo) {
		
		msi.memberUpdateInfo(mvo);
			
		return "redirect:/getBoardList";
	}
	
	@RequestMapping(value ="setMemberDelete")
	public String memberInfoDelete(@RequestParam("seqMember") int mno, HttpServletRequest request) {
		HttpSession session = request.getSession();
		
		
		
		msi.memberInfoDelete(mno);
		session.invalidate();
		
		return "redirect:/getBoardList";
	}

}
