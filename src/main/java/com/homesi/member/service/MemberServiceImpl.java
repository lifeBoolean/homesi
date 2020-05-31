package com.homesi.member.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.homesi.member.dao.MemberDaoImpl;
import com.homesi.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	MemberDaoImpl memberDao;

	@Override
	public void memberInput(MemberVo memberVo, Model model) {
		
		memberDao.memberInput(memberVo);
		
	}

}
