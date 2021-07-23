package kh.spring.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("boardWrite")
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping("writeProc")
	public String writeProc(BoardDTO dto) {
		
		dao.insert(dto);
		return "redirect:/";
	}
	
}
