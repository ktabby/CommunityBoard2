package com.board.vo;

import java.sql.Date;


public class BoardInfoVo {
	
	private int seqBoard;
	
	private String id;
	
	private String title;
	
	private String contents;
	
	private Date regDate;
	
	private Date modDate;
	
	private String searchCondition;
	
	private String boardSearchWord;
	
	private int RowNum;
	
	

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getBoardSearchWord() {
		return boardSearchWord;
	}

	public void setBoardSearchWord(String boardSearchWord) {
		this.boardSearchWord = boardSearchWord;
	}

	public int getRowNum() {
		return RowNum;
	}

	public void setRowNum(int rowNum) {
		RowNum = rowNum;
	}

	public int getSeqBoard() {
		return seqBoard;
	}
	
	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContents() {
		return contents;
	}

	public Date getRegDate() {
		return regDate;
	}

	public Date getModDate() {
		return modDate;
	}

	
}
