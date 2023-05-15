package com.board.serv;

import java.util.HashMap;

import com.board.dto.MemberLoginDto;

public interface MemberLoginService {

	public  MemberLoginDto loginCheck(HashMap<String, Object> reqMap);
	
	
	
}
