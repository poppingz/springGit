package kh.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kh.spring.dto.BoardDTO;

@Repository
public class BoardDAO {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	// 수정
	public int modify(BoardDTO dto) {
		String sql = "update board set title=?, contents=? where board_seq=?";
		return jdbc.update(sql, dto.getTitle(), dto.getContents(), dto.getBoard_seq());
	}
	// 삭제
	public int delete(int board_seq) {
		String sql = "delete from board where board_seq = ?";
		return jdbc.update(sql, board_seq);
	}

}
