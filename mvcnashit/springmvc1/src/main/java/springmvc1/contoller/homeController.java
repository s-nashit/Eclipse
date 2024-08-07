package springmvc1.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
//	@RequestMapping("/register")
//	public String reg(Model m) {
//		m.addAttribute("reg", "Registration Form");
//		return "register";
//	}
	
	@RequestMapping("/success")
	public String success() {
		return "success";
	}

}
