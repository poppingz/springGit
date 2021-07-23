package kh.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public int memberOut(String id) {
		String sql="delete from person where id = ?";
		return jdbc.update(sql,id);
	}
}
