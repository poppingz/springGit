package kh.spring.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.BoardDAO;
import kh.spring.dto.BoardDTO;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardDAO dao;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("detailProc")
	public String detail(int board_seq) throws Exception{
		BoardDTO dto = dao.detail(board_seq);
		return "detail";
	}
	
	@ExceptionHandler // 예외가 발생했을 때만,
	public String execeptionHandler(Exception e) {
		e.printStackTrace();
		return "error";
	}

}
