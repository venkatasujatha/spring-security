package com.tectoro.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tectoro.Model.Users;
import com.tectoro.Service.IUserService;
import com.tectoro.Service.IUserServiceImpl;

@Controller
public class UserController {
	@Autowired
	private IUserService iUserService;
	//1.show register page
	@GetMapping("/reg")
	public String Register() {
		return "UserRegister";
	}
	
	//2.read form data for save operation
	@PostMapping("/save")
	public String save(@ModelAttribute Users user,Model model)
	{
		Integer id=iUserService.save(user);
		String msg="user '" +id+"' saved";
		model.addAttribute("message", msg);
		return "UserRegister";
	}

}
