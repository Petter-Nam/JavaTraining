package com.application.trainingVer2.member.service;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.application.trainingVer2.dao.MemberDAO;
import com.application.trainingVer2.member.dto.MemberDTO;

@Service
public class MemberServiceImple implements MemberService {

	@Value("${file.repo.path}")
	private String fileRepositoryPath;
	
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private static Logger logger = LoggerFactory.getLogger(MemberService.class);
	
	@Override
	public void createMember(MultipartFile uploadProFile, MemberDTO memberDTO)
			throws IllegalStateException, IOException {
		if (!uploadProFile.isEmpty()) {
			String originalFileName = uploadProFile.getOriginalFilename();
			memberDTO.setProfileOriginalName(originalFileName);
			
			String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
			
			String uploadFile = UUID.randomUUID() + extension;
			memberDTO.setProfileUUID(uploadFile);
			
			uploadProFile.transferTo(new File(fileRepositoryPath + uploadFile));
		}
		if (memberDTO.getSmsstsYn() == null) memberDTO.setSmsstsYn("n");
		if (memberDTO.getEmailstsYn() == null) memberDTO.setEmail("n");
		
		memberDTO.setPasswd(passwordEncoder.encode(memberDTO.getPasswd()));
		memberDAO.createMember(memberDTO);
		
	}

	@Override
	public String checkValidId(String memberId) {
		String isValidId = "n";
		
		if (memberDAO.checkValidId(memberId) == null) {
			isValidId = "y";
		}
		return isValidId;
	}

	@Override
	public boolean login(MemberDTO memberDTO) {
		MemberDTO validateData = memberDAO.login(memberDTO.getMemberId());
		if (validateData != null) {
			if (passwordEncoder.matches(memberDTO.getPasswd(), validateData.getPasswd()) && validateData.getActiveYn().equals("y")) {
				
			}
		}
		return false;
	}

	@Override
	public MemberDTO getMemberDetail(String memberId) {
		return memberDAO.getMemberDetail(memberId);
	}

}
