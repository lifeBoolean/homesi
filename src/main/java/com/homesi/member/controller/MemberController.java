package com.homesi.member.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.homesi.member.service.MemberServiceImpl;
import com.homesi.member.vo.MemberVo;

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
	public String joinUp(MemberVo memberVo, Model model) {
		
		memberService.memberInput(memberVo, model);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/list", method=RequestMethod.GET)
	public String list(Model model) {
		memberService.memberList(model);
		
		return "/user/list";
	}
	
}
