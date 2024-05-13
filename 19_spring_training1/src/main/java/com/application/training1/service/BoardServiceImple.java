package com.application.training1.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.application.training1.dao.BoardDAO;
import com.application.training1.dto.BoardDTO;
@Service
public class BoardServiceImple implements BoardService {
	
	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired 
	private PasswordEncoder passwordEncoder;
	@Override
	public void createBoard(BoardDTO boardDTO) {
	
		boardDTO.setPasswd(passwordEncoder.encode(boardDTO.getPasswd()));
		
		boardDAO.createBoard(boardDTO);
	}
	@Override
	public List<BoardDTO> getBoardList() {
		
		return boardDAO.getBoardList();
	}
	@Override
	public BoardDTO getBoardDetail(long boardId, boolean isUpdateReadCnt) {
		
		if (isUpdateReadCnt) {
			boardDAO.updateReadCnt(boardId);
		}
		return boardDAO.getBoardDetail(boardId);
	}

}
