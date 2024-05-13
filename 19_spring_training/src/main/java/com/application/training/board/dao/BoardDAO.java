package com.application.training.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.application.training.board.dto.BoardDTO;

@Mapper
public interface BoardDAO {
	
	// Service에서 전달받은 객체를 <id="createBoard"> 매퍼로 전달한다
	public void createBoard(BoardDTO boardDTO);
	
	// <id="getBoardList"> 매퍼에서 게시글전체리스트를 검색하여 DAO객체로 전달한다.
	public List<BoardDTO> getBoardList();
	
	public BoardDTO getBoardDetail(long boardId);
	
	public void updateReadCnt(long boardId);
}
