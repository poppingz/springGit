package kh.spring.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.MemberDAO;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberDAO dao;

	@Autowired
	private HttpSession session;
	
	
	
	
	//로그아웃
	@RequestMapping("logout")
	public String logout() {
		session.invalidate();
		return "redirect:/";
	}
	
	
	//회원탈퇴
	@RequestMapping("memberOut")
	public String memberOut() {
		String id = (String)session.getAttribute("loginID");
		dao.memberOut(id);
		session.invalidate();
		return "redirect:/";
		
	}
	
}
