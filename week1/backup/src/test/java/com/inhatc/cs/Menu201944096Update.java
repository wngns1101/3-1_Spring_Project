package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class Menu201944096Update {
	@Inject
	private Menu201944096DAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		Menu201944096VO vo = new Menu201944096VO();
		vo.setId(1);
		vo.setType("양식");
		vo.setName("스테이크");
		vo.setPrice(30000);
		dao.update(vo);
	}
	
}

