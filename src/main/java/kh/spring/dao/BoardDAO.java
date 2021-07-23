package kh.spring.dao;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
=======
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
>>>>>>> bd52b2d73813e1a7fab3208bc250f47f819fbf77
import org.springframework.stereotype.Repository;

import kh.spring.dto.BoardDTO;

<<<<<<< HEAD
=======

>>>>>>> bd52b2d73813e1a7fab3208bc250f47f819fbf77
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

   @Autowired
   private JdbcTemplate jdbc;



   // 새로 작성한 글에 대한 seq ----------------------------------------------------
   public int getSeq() {
      String sql ="select board_seq.nextval from dual";
      return jdbc.queryForObject(sql, Integer.class);
   }

   // 게시판 내용 화면에 뿌리기 -----------------------------------------------------
   public BoardDTO detail(int board_seq) throws Exception {
      String sql ="select * from board where board_seq=?";
      return jdbc.queryForObject(sql, new RowMapper<BoardDTO>() {
         @Override
         public BoardDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
            BoardDTO dto = new BoardDTO();
            dto.setBoard_seq(rs.getInt("board_seq"));
            dto.setId(rs.getNString("id"));
            dto.setTitle(rs.getString("title"));
            dto.setContents(rs.getString("contents"));
            dto.setWrite_date(rs.getDate("write_date"));
            dto.setView_count(rs.getInt("view_count"));
            return dto;
         }
      },board_seq);
         
   }

   // 조회수 출력 ---------------------------------------------------------------
   public int view_count(int board_seq) {
      String sql="update board set view_count = view_count+1 where board_seq=?";
      return jdbc.queryForObject(sql,Integer.class, board_seq);

   }
   
   // xss 공격방어 --------------------------------------------------------------
   public String XSSFilter(String target) {
      if(target!=null){
         target = target.replaceAll("<","&lt;");   
         target = target.replaceAll(">","&gt;");      
         target = target.replaceAll("&","&amp;");      
      }
      return target;
   }
   
   // XSSFilter 역으로 다시 해서 화면에 뿌리기 ---------------------------------------
      public String ReXSSFilter(String target) {
         if(target!=null){
            target = target.replaceAll("&lt;","<");   
            target = target.replaceAll("&gt;",">");      
            target = target.replaceAll("&amp;","&");      
         }
         return target;
      }




}