package com.dxctraining.inventorymgt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/helo")
	public ModelAndView helloworld() {
		System.out.println("hello frds");
		String msg="hello printing";
		ModelAndView mv=new ModelAndView("hello","message",msg);
		return mv;
	}

}
