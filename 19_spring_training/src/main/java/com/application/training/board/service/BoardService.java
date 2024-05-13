package com.application.training.board.service;

import java.util.List;

import com.application.training.board.dto.BoardDTO;

public interface BoardService {

	public void createBoard(BoardDTO boardDTO);
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardDetail(long boardId, boolean isUpdateReadCnt);
	
	
}