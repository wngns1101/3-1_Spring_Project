package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.Menu201944096VO;
import com.inhatc.domain.studentVO;
import com.inhatc.persistence.Menu201944096DAO;
import com.inhatc.persistence.studentDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class Menu201944096ListCount {
	@Inject
	private Menu201944096DAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		System.out.println("-------TEST-------");
		int count = dao.count();
		System.out.println(count);
	}
	
}
