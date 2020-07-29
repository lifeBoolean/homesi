package com.homesi.member.service;

import org.springframework.ui.Model;

import com.homesi.member.vo.MemberVo;

public interface MemberService {
	
	void memberInput(MemberVo memberVo, Model model);
	void memberList(Model model);

}
