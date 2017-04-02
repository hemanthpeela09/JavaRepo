package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HelloController {
	
	@RequestMapping("/welcome")
	public String printWelcome(@RequestParam("username") String username, ModelMap model) {
		System.out.println("username: " + username);
		model.addAttribute("message", "Hi " + username + ", Please click contacts to enter your contact details.");
		return "hello";
 
	}
	
	@RequestMapping("/")
	public String printDispatch(ModelMap model) {
 		return "index";
 
	}
	
}