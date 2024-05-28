package com.application.training.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.training.board.dto.BoardDTO;
@Service
public class BoardServiceImple implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public void createBoard(BoardDTO boardDTO) {
		boardDTO.setPasswd(passwordEncoder.encode(boardDTO.getPasswd()));
	}

}
