package com.homesi.member.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.homesi.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao {
	@Inject
	private SqlSession session;

	@Override
	public int memberInput(MemberVo memberVo) {
		
		int n = session.insert("com.homesi.memberMapper.memberInsert", memberVo);
		
		System.out.println("n : "+n);
		
		return n;
	}

}
