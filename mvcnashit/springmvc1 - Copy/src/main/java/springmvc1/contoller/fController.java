package springmvc1.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class fController {
	
	@RequestMapping("/register")
	public String form() {
		return "register";
	}
	@RequestMapping(path="/success", method= RequestMethod.GET)
	public String hForm(HttpServletRequest req, Model m1) {
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		String phone = req.getParameter("phone");
		String age = req.getParameter("age");
		System.out.println(name);
		System.out.println(mail);
		System.out.println(phone);
		System.out.println(age);
		m1.addAttribute("n", name);
		return "success";
	}

}
