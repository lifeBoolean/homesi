package com.homesi.member.dao;

import java.util.List;

import com.homesi.member.vo.MemberVo;

public interface MemberDao {
	int memberInput(MemberVo memberVo);
	List<MemberVo> memberList();
}