package com.board.serv;

import com.board.dto.CreateMemberInfoDto;
import com.board.vo.MemberInfoVo;


public interface MemberInfoServ {
	
	public String setCreateMemberInfo(CreateMemberInfoDto req);
	
	public MemberInfoVo memberInfoDetail(int mno);
	
	public void memberUpdateInfo(MemberInfoVo mvo);
	
	public void memberInfoDelete(int mno);

}
