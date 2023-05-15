package com.board.servImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.daoImpl.MemberLoginDao;
import com.board.dto.MemberLoginDto;
import com.board.serv.MemberLoginService;

@Service
public class MemberLoginServImpl implements MemberLoginService {
	
	@Autowired
	MemberLoginDao mld;
	
	@Override
	public MemberLoginDto loginCheck(HashMap<String, Object> reqMap) {
		return mld.loginCheck(reqMap);
	}

}
