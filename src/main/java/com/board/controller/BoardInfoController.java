package com.board.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.board.dto.BoardInsertDto;
import com.board.dto.BoardUpdateDto;
import com.board.dto.Criteria;
import com.board.dto.Paging;
import com.board.serv.BoardInfoServ;

@Controller
public class BoardInfoController {

	@Autowired
	private BoardInfoServ bsi;

	@RequestMapping(value = "/")
	public String HomePage(Model model) {
		return "main";
	}
	
	//게시글 목록 이동
	@RequestMapping(value = "/getBoardList")
	public String home(Model model, HttpServletRequest request, Criteria cri) {
		
		
		
		  String searchCondition = request.getParameter("searchCondition");
		  String boardSearchWord = request.getParameter("boardSearchWord");
		 
		  
		  HashMap<String, Object> reqMap = new HashMap<String, Object>();
		
		  reqMap.put("searchCondition", searchCondition); 
		  reqMap.put("boardSearchWord", boardSearchWord);
		 
		 
		
		int boardListCnt = bsi.getBoardListCnt(reqMap);
		
		Paging paging = new Paging();
		paging.setCri(cri);
		paging.setTotalCount(boardListCnt);
		
		reqMap.put("cri", cri);
		
		model.addAttribute("list", bsi.getReadBoardInfo(reqMap));
		model.addAttribute("search", reqMap); 
		model.addAttribute("paging", paging);
		model.addAttribute("cri", cri);
		

		return "board/getBoardList";
	}
	
	//게시글 등록 이동
	@RequestMapping(value = "/setBoardInsert")
	public String insertBoard() {
		return "board/setBoardInsert";
	}
	
	//게시글 등록 메서드
	@RequestMapping(value = "/insertOk")
	public String insertBoardOk(BoardInsertDto req) {
		System.out.println("insertBoardOk start");
		bsi.insertBoardInfo(req);

		return "redirect:/getBoardList";
	}
	
	//게시물 업데이트 이동
	@RequestMapping(value = "/setBoardUpdate")
	public String updateBoard(@RequestParam(value = "seqBoard", required = false) int bno, Model model) {
		
		model.addAttribute("boardDto", bsi.getBoardDetail(bno));
		
		return "board/setBoardUpdate";
	}
	
	//게시물 업데이트 실행메서드
	@RequestMapping(value = "/updateOk")
	public String updateBoardOk(BoardUpdateDto req, Model model) {
		System.out.println("updateBoardOk start");
		System.out.println("updateBoardOk getSeqBoard ==>> " + req.getSeqBoard());
		System.out.println("updateBoardOk getContents ==>> " + req.getContents());

		model.addAttribute("boardDto", bsi.updateBoardInfo(req));
//		bsi.updateBoardInfo(req);

//		return "redirect:/getBoardDetail";
		return "redirect:/getBoardList";

	}
	
	//게시글 상세보기이동
	@RequestMapping(value = "/getBoardDetail")
	public String getBoardDetail(@RequestParam(value = "seqBoard", required = false) int bno, Model model) {
		System.out.println("getBoardDetail start");
		System.out.println("================bno" + bno);

		model.addAttribute("boardDto", bsi.getBoardDetail(bno));
		System.out.println("================ bsi.getBoardDetail(bno)" +  bsi.getBoardDetail(bno));

		return "board/getBoardDetail";
	}

	// (상세페이지)delete문을 실행하는 메서드
	@RequestMapping(value = "/deleteOk")
	public String deleteBoardOk(@RequestParam(value = "seqBoard", required = false) Integer bno, Model model) {
		System.out.println("deleteOk start");
		model.addAttribute("boardDto", bsi.deleteBoardInfo(bno));
//		bsi.deleteBoardInfo(bno);		
		return "redirect:/getBoardList";
	}
	
}
