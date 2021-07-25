package kh.spring.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.BoardDAO;
import kh.spring.dto.BoardDTO;


@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardDAO bdao;
	
	public String list(Model model) throws Exception {
		
		List<BoardDTO> list = bdao.List();
		model.addAttribute("list",list);
		return "board/boardlist";
	}
}
