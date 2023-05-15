package com.board.daoImpl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.dao.MemberInfoDao;
import com.board.dto.CreateMemberInfoDto;
import com.board.vo.MemberInfoVo;

@Repository
public class MemberInfoDaoImpl implements MemberInfoDao {
	
	@Autowired
	SqlSessionTemplate tpl;
	

	@Override
	public int setCreateMemberInfo(CreateMemberInfoDto req) {
		
		
		
		return tpl.insert("MemberInfoDao.memberInsertInfo", req);
	}


	@Override
	public MemberInfoVo memberInfoDetail(int mno) {
		
		return tpl.selectOne("MemberInfoDao.memberInfoDetail", mno);
	}


	@Override
	public void memberUpdateInfo(MemberInfoVo mvo) {
		tpl.update("MemberInfoDao.memberUpdateInfo", mvo);
		
	}


	@Override
	public void memberInfoDelete(int mno) {
		tpl.delete("MemberInfoDao.memberInfoDelete", mno);
		
	}
	
	

}
