package com.application.training1.service;

import java.util.List;

import com.application.training1.dto.BoardDTO;

public interface BoardService {
	
	public void createBoard(BoardDTO boardDTO);
	public List<BoardDTO> getBoardList();
	public BoardDTO getBoardDetail(long boardId, boolean isUpdateReadCnt);
}
