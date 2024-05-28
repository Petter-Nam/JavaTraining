package com.application.trainingVer2.dao;

import org.apache.ibatis.annotations.Mapper;

import com.application.trainingVer2.member.dto.MemberDTO;

@Mapper
public interface MemberDAO {
	public void createMember(MemberDTO memberDTO);
	public String checkValidId(String memberId);
	public MemberDTO login(String memberId);
	public MemberDTO getMemberDetail(String memberId);
}
