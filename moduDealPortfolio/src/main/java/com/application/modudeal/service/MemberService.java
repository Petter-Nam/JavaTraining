package com.application.modudeal.service;

import com.application.modudeal.dto.MemberDTO;

public interface MemberService {
	
	public void createMember(MemberDTO memberDTO);
	public String checkValidId(String memberId);
	
}
