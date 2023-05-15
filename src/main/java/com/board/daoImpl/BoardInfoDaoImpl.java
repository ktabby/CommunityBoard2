package com.board.daoImpl;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.dao.BoardInfoDao;
import com.board.dto.BoardInsertDto;
import com.board.dto.BoardUpdateDto;
import com.board.vo.BoardInfoVo;


@Repository
public class BoardInfoDaoImpl implements BoardInfoDao {
	
	@Autowired
	SqlSessionTemplate tpl;
	
	@Override
	public int pagingCount() {
		System.out.println("*************pagingCount********************");
		return tpl.selectOne("BoardInfoDao.pagingCount");
	}

	@Override
	public List<BoardInfoVo> getReadBoardInfo(HashMap<String, Object> reqMap) {
		System.out.println("*************boardInfoDaoImpl********************");
		
		
		return tpl.selectList("BoardInfoDao.getReadBoardInfo", reqMap);
	}
	
	@Override
	public int getBoardListCnt(HashMap<String, Object> reqMap) {
		int totalCnt = tpl.selectOne("BoardInfoDao.getBoardListCnt", reqMap);
		return totalCnt;
	}

	@Override
	
	
	public int insertBoardInfo(BoardInsertDto req) {
		System.out.println("값 확인" + req);
		return tpl.insert("BoardInfoDao.boardInsert", req);
	}

	
	@Override 
	public BoardInfoVo getBoardDetail(int bno) {
		System.out.println("*************boardDetailDaoImpl********************");
		return tpl.selectOne("BoardInfoDao.getBoardDetail", bno); 
	}

	@Override
	public int updateBoardInfo(BoardUpdateDto req) {
		System.out.println("값 확인" + req);
		return tpl.update("BoardInfoDao.boardUpdate", req);
	}

	@Override
	public int deleteBoardInfo(int bno) {
		System.out.println("*************boardDeleteDaoImpl********************");
		return tpl.delete("BoardInfoDao.boardDelete", bno);
	}

}
