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

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
