package com.board.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
public class BoardInsertDto {
	
	@JsonProperty("ID")
	private String id;
	
	@JsonProperty("TITLE")
	private String title;
	
	@JsonProperty("CONTENTS")
	private String contents;

//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getTitle() {
//		return title;
//	}
//
//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//	public String getContents() {
//		return contents;
//	}
//
//	public void setContents(String contents) {
//		this.contents = contents;
//	}
	
	
}
