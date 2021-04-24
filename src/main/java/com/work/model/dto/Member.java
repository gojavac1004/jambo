package com.work.model.dto;

import java.io.Serializable;

public class Member implements Serializable {
	private String memberId;
	private String memberPw;
	private String name;
	
	public Member() {}

	public Member(String memberId, String memberPw, String name) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.name = name;
	}
	
	
	
}
