package com.board.dao;

import java.util.HashMap;
import java.util.List;

import com.board.dto.BoardInsertDto;
import com.board.dto.BoardUpdateDto;
import com.board.vo.BoardInfoVo;

public interface BoardInfoDao {
	
	public List<BoardInfoVo> getReadBoardInfo(HashMap<String, Object> reqMap);
	
	public int getBoardListCnt(HashMap<String, Object> reqMap);
	
	public int insertBoardInfo(BoardInsertDto req);
	
	public BoardInfoVo getBoardDetail(int bno);
	
	public int updateBoardInfo(BoardUpdateDto req);
	
	public int deleteBoardInfo(int bno);
	
	public int pagingCount();
}
