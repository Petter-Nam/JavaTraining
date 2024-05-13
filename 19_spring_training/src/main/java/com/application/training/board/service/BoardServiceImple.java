package com.application.training.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.training.board.dao.BoardDAO;
import com.application.training.board.dto.BoardDTO;

@Service
public class BoardServiceImple implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void createBoard(BoardDTO boardDTO) {
		
		// 전달받은 객체의 비밀번호 데이터를 꺼내고 암호화하여 다시 저장한다.
		boardDTO.setPasswd(passwordEncoder.encode(boardDTO.getPasswd())); 
		
		// 암호화된 비밀번호가 저장된 DTO 객체를 DAO 객체로 전달한다.
		boardDAO.createBoard(boardDTO);
	}

	@Override
	public List<BoardDTO> getBoardList() {
		
		return boardDAO.getBoardList();
		
	}

	@Override
	public BoardDTO getBoardDetail(long boardId, boolean isUpdateReadCnt) {
		
		if(isUpdateReadCnt) {
			boardDAO.updateReadCnt(boardId);
		}
		return boardDAO.getBoardDetail(boardId);
	}
	
	

}
