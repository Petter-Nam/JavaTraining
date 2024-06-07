package com.application.modudeal.dao;



import org.apache.ibatis.annotations.Mapper;

import com.application.modudeal.dto.MemberDTO;

@Mapper
public interface MemberDAO {

	public void createMember(MemberDTO memberDTO);
	public String checkValidId(String memberId);
	public MemberDTO login(String memberId);
	public MemberDTO getMemberDetail(String memberId);
}
