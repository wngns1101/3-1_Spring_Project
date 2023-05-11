package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class testMembers6ReadAllMembers {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		System.out.println("-------TEST-------");
		List<MembersVO> listMember = dao.listAll();
		int nDataCount = listMember.size();
		System.out.println("Data Count:" + nDataCount);
		for(int i=0; i<nDataCount; i++) {
		System.out.println("##################");
		System.out.println("User Index: " + i );
		System.out.println("User User id : " + listMember.get(i).getUserid());
		System.out.println("User User Name : " + listMember.get(i).getUsername());
		System.out.println("User User Email : " + listMember.get(i).getEmail());
		System.out.println("------------------");
		}
	}
	
}
