package com.board.daoImpl;

import java.util.HashMap;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.dto.MemberLoginDto;

@Repository
public class MemberLoginDao {
	
	
	
	@Autowired
	SqlSessionTemplate tpl;
	
	public MemberLoginDto loginCheck(HashMap<String, Object> reqMap) {
		
		return tpl.selectOne("memberLoginDao.loginCheck", reqMap);
	}

}
