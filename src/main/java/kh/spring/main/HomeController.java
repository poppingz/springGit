package kh.spring.main;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.BoardDAO;
import kh.spring.dto.BoardDTO;

=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
>>>>>>> 191e8b4a532046a7d2a75e8d39dbae3ad7c76ee4

@Controller
public class HomeController {
	
<<<<<<< HEAD
	@Autowired
	private BoardDAO dao;
	
=======
>>>>>>> 191e8b4a532046a7d2a75e8d39dbae3ad7c76ee4
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	//수정화면 이동
	@RequestMapping("modifyForm")
	public String modifyForm() {
		System.out.println("수정 화면 전환");
		return "writeModify";
	}
	
	//수정
	@RequestMapping("modifyProc")
	public String modify(BoardDTO dto) throws Exception {
		System.out.println("수정 요청 확인");
		int result = dao.modify(dto);
		return "home";
	}
	
	@RequestMapping("delete")
	public String delete(int board_seq) throws Exception {
		System.out.println("삭제 요청 확인");
		return "home";
	}
	
}
