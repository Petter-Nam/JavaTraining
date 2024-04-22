package board.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.DTO.BoardDTO3;


public class BoardDAO3 {
	
	
	private BoardDAO3() {}
	private static BoardDAO3 instance = new BoardDAO3();
	public static BoardDAO3 getInstance () {
		return instance;
	}
	
	private Connection 		  conn  = null;
	private PreparedStatement pstmt = null;
	private ResultSet         rs    = null;
	
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
	
	private void getClose() {
		if (rs != null) 	try {rs.close();} catch (SQLException e) {e.printStackTrace();}
		if (pstmt != null) 	try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}
		if (conn != null)  	try {conn.close();} catch (SQLException e) {e.printStackTrace();}
	}
	
	// 게시글 입력메서
	
	public void insertBoard(BoardDTO3 boardDTO) {
		try {
		
			getConnection();
			String sql = "INSERT INTO BOARD(WRITER , SUBJECT , EMAIL , PASSWORD , CONTENT , READ_CNT , ENROLL_DT) ";
				   sql += " VALUES(? , ? , ? , ? , ? , 0 , NOW())";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getWriter());
			pstmt.setString(2, boardDTO.getSubject());
			pstmt.setString(3, boardDTO.getEmail());
			pstmt.setString(4, boardDTO.getPassword());
			pstmt.setString(5, boardDTO.getContent());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
	}
	
	public ArrayList<BoardDTO3> getBoardList () {
		
		ArrayList<BoardDTO3> boardList = new ArrayList<BoardDTO3>();
		
		try {
			getConnection();
			pstmt = conn.prepareStatement("SELECT BOARD_ID, WRITER , SUBJECT, READ_CNT, ENROLL_DT FROM BOARD");
			rs = pstmt.executeQuery();
			
			// 조회된 데이터를 ArrayList<BoardDTO>타입에 저장
			while (rs.next()) {
				BoardDTO3 temp = new BoardDTO3();
				temp.setBoardId(rs.getLong("BOARD_ID"));
				temp.setWriter(rs.getString("WRITER"));
				temp.setSubject(rs.getString("SUBJECT"));
				temp.setReadCnt(rs.getLong("READ_CNT"));
				temp.setEnrollDt(rs.getDate("ENROLL_DT"));
				boardList.add(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		//단위(Unit) 테스트
		System.out.println("getBoardList : " + boardList);
		
		return boardList;
	}
	
	public BoardDTO3 getBoardDetail(long boardId) {
		
		BoardDTO3 boardDTO = new BoardDTO3();
		
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
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		
		// 단위 테스트
		System.out.println("detail : " + boardDTO);
		
		return boardDTO;
		
	}
	
	public boolean checkAuthenticationUser(BoardDTO3 boardDTO) {
		
		System.out.println("boardDTO param : " + boardDTO);
		
		boolean isAuthenticationUser = false;
		
		try {
			getConnection();
			String sql = """
						 SELECT *
						 FROM   BOARD
						 WHERE  BOARD_ID = ?
						 AND    PASSWORD = ?
						 """;
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, boardDTO.getBoardId());
			pstmt.setString(2, boardDTO.getPassword());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				isAuthenticationUser = true;
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
		System.out.println("checkAuthenticationUser : " + isAuthenticationUser);
		return isAuthenticationUser; 
	}
	
	public void updateBoard(BoardDTO3 boardDTO) {
		
		System.out.println("updateBoard param : " + boardDTO);
		
		try {
			getConnection();
			String sql = """
						UPDATE BOARD
						SET	   SUBJECT = ?,
								CONTENT = ?
						WHERE  BOARD_ID = ?
					
					""";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getSubject());
			pstmt.setString(2, boardDTO.getContent());
			pstmt.setLong(3, boardDTO.getBoardId());
			pstmt.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
		
		
	}
	
	public void deleteBoard(long boardId) {
		
		try {
			getConnection();
			pstmt = conn.prepareStatement("DELETE FROM BOARD WHERE BOARD_ID = ?");
			pstmt.setLong(1, boardId);
			pstmt.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			getClose();
		}
		
	}
	
}
