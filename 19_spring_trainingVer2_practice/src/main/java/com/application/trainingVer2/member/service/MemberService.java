package com.application.trainingVer2.member.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.application.trainingVer2.member.dto.MemberDTO;

public interface MemberService {

	public void createMember(MultipartFile uploadProFile, MemberDTO memberDTO) throws IllegalStateException, IOException;
	public String checkValidId(String memberId);
	public boolean login(MemberDTO memberDTO);
	public MemberDTO getMemberDetail(String memberId);
}
