package org.zerock.mapper;

import java.sql.PreparedStatement;
import java.util.List;

import org.zerock.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void insert(BoardVO board);
	/*
	{
		String sql = "INSERT INTO tbl_board"
				+ " (bno, title, content, writer, regdate, updatedate) "
				+ " VALUES (seq_board.nextval, ?, ?, ?, SYSDATE, SYSDATE)";
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		pstmt.setString(1, board.getTitle());
		pstmt.setString(2, board.getContent());
		pstmt.setString(3, board.getWriter());
		
		pstmt.updateQuery();
		
		close();
	}
	*/
}
