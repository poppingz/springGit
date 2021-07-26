package kh.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dto.BoardDTO;
import kh.spring.dto.MemberDTO;

@Repository
public class BoardDAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public int insert(BoardDTO dto) {
		String sql = "insert into board values(?,?,?,?,sysdate,?)";
		return jdbc.update(
				sql,
				dto.getBoard_seq(),
				dto.getId(),
				dto.getTitle(),
				dto.getContents(),
				dto.getView_count());
	}
	
}
