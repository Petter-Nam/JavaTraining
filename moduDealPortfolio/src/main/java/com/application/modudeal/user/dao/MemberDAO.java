package com.application.modudeal.user.dao;



import org.apache.ibatis.annotations.Mapper;

import com.application.modudeal.user.dto.MemberDTO;

@Mapper
public interface MemberDAO {

	public void createMember(MemberDTO memberDTO);
	public String checkValidId(String memberId);
	public MemberDTO login(String memberId);
	public MemberDTO getMemberDetail(String memberId);
	public void changePassword(MemberDTO memberDTO);
	//public void updateHp(MemberDTO memberDTO);
	public void updateAddress(MemberDTO memberDTO);
}
