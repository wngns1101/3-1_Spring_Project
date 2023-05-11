package com.inhatc.cs;

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

public class Menu201944096Select {
	@Inject
	private Menu201944096DAO dao;
	
	@Test
	public void readMembers() throws Exception {
		System.out.println("-------Test--------");
		Menu201944096VO vo = dao.select("1");
		System.out.println("id: " + vo.getId());
		System.out.println("type: " + vo.getType());
		System.out.println("name: " + vo.getName());
		System.out.println("price: " + vo.getPrice());
	}
}
