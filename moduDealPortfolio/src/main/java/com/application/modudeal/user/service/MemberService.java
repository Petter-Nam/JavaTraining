package com.application.modudeal.user.service;

import com.application.modudeal.user.dto.MemberDTO;

public interface MemberService {
	
	public void createMember(MemberDTO memberDTO);
	public String checkValidId(String memberId);
	public MemberDTO login(MemberDTO memberDTO);
	public MemberDTO getMemberDetail(String memberId);
	public boolean changePassword(String memberId, String newPassword);
//	public boolean updateHp(MemberDTO memberDTO);
//  public boolean updateEmail(MemberDTO memberDTO);
	public boolean updateAddress(MemberDTO memberDTO);
	
}
