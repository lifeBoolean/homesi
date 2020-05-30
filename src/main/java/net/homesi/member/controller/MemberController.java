package net.homesi.member.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class MemberController {
	@Inject
	MemberServiceImpl memberService;
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String joinForm() {
		
		return "/user/registerForm";
	}
	
	@RequestMapping(value = "/joinUp", method = RequestMethod.POST)
	public String joinUp() {
		
		return "/user/result";
	}
	
}
