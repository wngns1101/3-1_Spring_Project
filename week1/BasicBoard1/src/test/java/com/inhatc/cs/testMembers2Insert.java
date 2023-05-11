package com.inhatc.cs;

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

public class testMembers2Insert {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void testInsertMember() throws Exception {
		MembersVO vo1 = new MembersVO();
		vo1.setUserid("userID 1");
		vo1.setUserpw("pw 1");
		vo1.setUsername("Name 1");
		vo1.setEmail("SFSF1@itc.ac.kr");
		dao.insertMembers(vo1);
		
		MembersVO vo2 = new MembersVO();
		vo2.setUserid("userID 2");
		vo2.setUserpw("pw 2");
		vo2.setUsername("Name 2");
		vo2.setEmail("SFSF2@itc.ac.kr");
		dao.insertMembers(vo2);
		
		MembersVO vo3 = new MembersVO();
		vo3.setUserid("userID 3");
		vo3.setUserpw("pw 3");
		vo3.setUsername("Name 3");
		vo3.setEmail("SFSF3@itc.ac.kr");
		dao.insertMembers(vo3);
	}
}
