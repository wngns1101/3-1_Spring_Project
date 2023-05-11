package com.inhatc.cs;

import java.util.List;

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

public class Menu201944096ListAll {
	@Inject
	private Menu201944096DAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		System.out.println("-------TEST-------");
		List<Menu201944096VO> listStudent = dao.listAll();
		int nDataCount = listStudent.size();
		System.out.println("Data Count:" + nDataCount);
		for(int i=0; i<nDataCount; i++) {
		System.out.println("##################");
		System.out.println("User Index: " + i );
		System.out.println("User id : " + listStudent.get(i).getId());
		System.out.println("User type : " + listStudent.get(i).getType());
		System.out.println("User name : " + listStudent.get(i).getName());
		System.out.println("User price : " + listStudent.get(i).getPrice());
		System.out.println("User total : " + listStudent.get(i).getTotal());
		System.out.println("------------------");
		}
	}
	
}
