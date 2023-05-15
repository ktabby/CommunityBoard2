package com.board.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MemberInfoVo {
	@JsonProperty("SEQ_MEMBER")
	private int seqMember;
	
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("NAME")
	private String name;
	
	@JsonProperty("PASSWORD")
	private String password;
	
	@JsonProperty("REG_DATE")
	private String regDate;
	
	@JsonProperty("MOD_DATE")
	private String modDate;
	
	@JsonProperty("EMAIL")
	private String email;
	
	@JsonProperty("ADDRESS")
	private String address;
	
	public int getSeqMember() {
		return seqMember;
	}
	public void setSeqMember(int seqMember) {
		this.seqMember = seqMember;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public String getModDate() {
		return modDate;
	}
	public void setModDate(String modDate) {
		this.modDate = modDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}
