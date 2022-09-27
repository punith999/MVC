package com.SopraController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Sopra {
	@RequestMapping("/name")
	public String name(){
		return "index";
	}

}
