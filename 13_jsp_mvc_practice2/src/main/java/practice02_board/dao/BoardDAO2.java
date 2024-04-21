package practice02_board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import practice02_dto.BoardDTO2;

public class BoardDAO2 {

	private BoardDAO2() {
	};

	private static BoardDAO2 instance = new BoardDAO2();

	public static BoardDAO2 getInstance() {
		return instance;
	}

	// 데이터베이스 연동객체 생성
	private Connection 		  conn  = null;
	private PreparedStatement pstmt = null;
	private ResultSet 		  rs    = null;

	// 데이터베이스 연동 메서드 생성
	private void getConnection() {
		try {
			Context initctx = new InitialContext();
			Context envctx = (Context) initctx.lookup("java:comp/env");
			DataSource ds = (DataSource) envctx.lookup("jdbc/board");
			conn = ds.getConnection();
		} 
		catch (Exception e) {
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
	public void insertBoard(BoardDTO2 boardDTO2) {
		
		try {
			getConnection();
			
			String sql = "INSERT INTO BOARD(WRITER, SUBJECT, EMAIL, PASSWORD, CONTENT, READ_CNT, ENROLL_DT) ";
					sql += " VALUES(?, ?, ?, ?, ?, 0, NOW())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDTO2.getWriter());
			pstmt.setString(2, boardDTO2.getSubject());
			pstmt.setString(3, boardDTO2.getEmail());
			pstmt.setString(4, boardDTO2.getPassword());
			pstmt.setString(5, boardDTO2.getContent());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
	}
	
	// 게시글 전체조회 메서드
	public ArrayList<BoardDTO2> getBoardList() {
	
		ArrayList<BoardDTO2> boardList = new ArrayList<BoardDTO2>();
		
		try {
			
			getConnection();
			pstmt = conn.prepareStatement("SELECT BOARD_ID, WTER, SUBJECT, READ_CNT, ENROLL_DT FROM BOARD");
			rs = pstmt.executeQuery();
			
			//조회된 데이터를 ArrayList<BoardDTO2>타입에 저장
			BoardDTO2 temp = new BoardDTO2();
			
			temp.setBoardId(rs.getLong("BOARD_ID"));
			temp.setWriter(rs.getString("WRITER"));
			temp.setSubject(rs.getString("SUBJECT"));
			temp.setReadCnt(rs.getLong("READ_CNT"));
			temp.setEnrollDt(rs.getDate("ENROLL_DT"));
			boardList.add(temp);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
		
		//단위 (Unit) 테스트
		System.out.println("getBoardList : " + boardList);
		
		return boardList;
	}
	

}
