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

public class testMembers4update {
	@Inject
	private MembersDAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		MembersVO vo = new MembersVO();
		vo.setUserid("userID 1");
		vo.setUsername("대답없는 학생들...");
		dao.modify(vo);
	}
	
}
