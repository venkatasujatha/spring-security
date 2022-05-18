package com.tectoro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String Home() {
		return "HomePage";
	}
	@GetMapping("/welcome")
	public String Welcome() {
		return "WelcomePage";
	}
	@GetMapping("/admin")
	public String Admin() {
		return "adminPage";
	}
	@GetMapping("/employee")
	public String Employee() {
		return "employeePage";
	}
	@GetMapping("/student")
	public String Student() {
		return "studentPage";
	}
	@GetMapping("/denied")
	public String ShowDenied() {
		return "deniedPage";
	}

}
