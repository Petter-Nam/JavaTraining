package practice00_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import practice00_board.dto.BoardDTO0;

public class BoardDAO0 {
	
	
	//싱글톤 디자인 패턴
	private BoardDAO0(){};
	private static BoardDAO0 instance = new BoardDAO0();
	public static BoardDAO0 getInstance () {
		return instance;
	}
	
	// 데이터베이스 연동객체 생성
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	// 데이터베이스 연동 메서드 생성
	private void getConnection() {
		
		try {
			
			Context initctx = new InitialContext();
			Context envctx = (Context) initctx.lookup("java:comp/env");    
			DataSource ds = (DataSource) envctx.lookup("jdbc/board"); 		  
			conn = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}						
	}
	
	// 데이터베이스 연동해지 메서드 생성
	private void getClose() {
		
		if (rs != null) try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		if (pstmt != null) try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
		if (conn != null) try {conn.close();} catch (SQLException e) {e.printStackTrace();}
		
	}
	
	// 게시글 입력 메서드
	public void insertBoard(BoardDTO0 boardDTO0) {
		
		try {
			getConnection();
			String sql = "INSERT INTO BOARD(WRITER, SUBJECT, EMAIL, PASSWORD, CONTENT, READ_CNT, ENROLL_DT) ";
				   sql += " VALUES(?, ?, ?, ?, ?, 0, NOW())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDTO0.getWriter());
			pstmt.setString(2, boardDTO0.getSubject());
			pstmt.setString(3, boardDTO0.getEmail());
			pstmt.setString(4, boardDTO0.getPassword());
			pstmt.setString(5, boardDTO0.getContent());
			pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
	}
	
	//게시글 전체조회 메서드
	public ArrayList<BoardDTO0> getBoardList() {
		ArrayList<BoardDTO0> boardList = new ArrayList<BoardDTO0>();
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT BOARD_ID, WRITER, SUBJECT, READ_CNT, ENROLL_DT FROM BOARD");
			rs = pstmt.executeQuery();
			
			//조회된 데이터를 ArrayList<BoardDTO0>타입에 저장
			while (rs.next()) {
				BoardDTO0 temp = new BoardDTO0();
				temp.setBoardId(rs.getLong("BOARD_ID"));
				temp.setWriter(rs.getString("WRITER"));
				temp.setSubject(rs.getString("SUBJECT"));
				temp.setReadCnt(rs.getLong("READ_CNT"));
				temp.setEnrollDt(rs.getDate("ENROLL_DT"));
				boardList.add(temp);
			}
		} 
		catch (Exception e) {
		e.printStackTrace();
		}
		finally {
			getClose();
		}
		
		//단위(Unit) 테스트
		System.out.println("getBoardList : " + boardList);
		
		return boardList;
	}
	
	public BoardDTO0 getBoardDetail(long boardId) {
		BoardDTO0 boardDTO = new BoardDTO0();
		
		try {
			getConnection();
			String sql = """
					UPDATE BOARD
					SET    READ_CNT = READ_CNT + 1
					WHERE  BOARD_ID = ?
					""";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, boardId);
			pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement("SELECT * FROM BOARD WHERE BOARD_ID = ?");
			pstmt.setLong(1, boardId);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				boardDTO.setBoardId(rs.getLong("BOARD_ID"));
				boardDTO.setWriter(rs.getString("WRITER"));
				boardDTO.setEmail(rs.getString("EMAIL"));
				boardDTO.setSubject(rs.getString("SUBJECT"));
				boardDTO.setContent(rs.getString("CONTENT"));
				boardDTO.setReadCnt(rs.getLong("READ_CNT"));
				boardDTO.setEnrollDt(rs.getDate("ENROLL_DT"));
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
		
		//단위 테스트
		System.out.println("detail : " + boardDTO);
		return boardDTO;
	}
	
}
