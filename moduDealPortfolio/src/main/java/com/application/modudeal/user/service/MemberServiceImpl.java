package com.application.modudeal.user.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.modudeal.user.dao.MemberDAO;
import com.application.modudeal.user.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private static Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class); 
	
	@Override
	public void createMember(MemberDTO memberDTO) {
		memberDTO.setPassword(passwordEncoder.encode(memberDTO.getPassword()));
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
	public MemberDTO login(MemberDTO memberDTO) {
		MemberDTO resultDTO = memberDAO.login(memberDTO.getMemberId());
		
		if (resultDTO != null) {
			if (passwordEncoder.matches(memberDTO.getPassword(), resultDTO.getPassword())) {
				return resultDTO;
			};
		}
		return null;
	}

	@Override
	public MemberDTO getMemberDetail(String memberId) {
		return memberDAO.getMemberDetail(memberId);
	}

	public boolean changePassword(String memberId, String newPassword) {
		
		// memberId를 사용하여 사용자 정보를 조회합니다.
	    MemberDTO memberDTO = memberDAO.getMemberDetail(memberId);
	    
	    if (memberDTO != null) {
	        // 새로운 비밀번호를 암호화합니다.
	        String encryptedNewPassword = passwordEncoder.encode(newPassword);
	        
	        // 암호화된 새로운 비밀번호를 사용자 정보에 설정합니다.
	        memberDTO.setPassword(encryptedNewPassword);
	        
	        // 변경된 비밀번호로 사용자 정보를 업데이트합니다.
	        memberDAO.changePassword(memberDTO);
	        
	        return true; // 비밀번호 변경 성공
	    } else {
	        return false; // 사용자 정보를 찾을 수 없는 경우
	    }
	    
	}

//	@Override
//	public boolean updateHp(MemberDTO memberDTO) {
//		
//		if (memberDTO == memberDAO.getMemberDetail(memberDTO.getMemberId())) {
//			memberDAO.updateHp(memberDTO);
//			return true;
//		}
//		else {
//			return false;
//		}
//	}

	@Override
    public boolean updateAddress(MemberDTO memberDTO) {
		 if (memberDTO.getAddressZipcode() != null && memberDTO.getAddressRoad() != null &&
		            memberDTO.getAddressJibun() != null && memberDTO.getAddressNamuji() != null) {
			 memberDAO.updateAddress(memberDTO);
			 return true;
		 }
		 else {
			 return false;
		 }
    }

}
