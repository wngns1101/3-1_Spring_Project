package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.Menu201944096VO;
import com.inhatc.persistence.Menu201944096DAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class Menu201944096Insert {
	@Inject
	private Menu201944096DAO dao;
	
	@Test
	public void testInsertMember() throws Exception {
		Menu201944096VO vo1 = new Menu201944096VO();
		vo1.setId(1);
		vo1.setType("중식");
		vo1.setName("짜장면");
		vo1.setPrice(7000);
		vo1.setTotal(400);
		dao.insert(vo1);
		
		Menu201944096VO vo2 = new Menu201944096VO();
		vo2.setId(2);
		vo2.setType("일식");
		vo2.setName("초밥");
		vo2.setPrice(10000);
		vo2.setTotal(500);
		dao.insert(vo2);
		
		Menu201944096VO vo3 = new Menu201944096VO();
		vo3.setId(3);
		vo3.setType("한식");
		vo3.setName("갈비");
		vo3.setPrice(15000);
		vo3.setTotal(800);
		dao.insert(vo3);
	}
}
