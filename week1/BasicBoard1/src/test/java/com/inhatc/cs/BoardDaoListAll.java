package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class BoardDaoListAll {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		System.out.println("-------TEST-------");
		List<BoardVO> listStudent = dao.listAll();
		int nDataCount = listStudent.size();
		System.out.println("Data Count:" + nDataCount);
		for(int i=0; i<nDataCount; i++) {
		System.out.println("##################");
		System.out.println("User Index: " + i );
		System.out.println("User id : " + listStudent.get(i).getBno());
		System.out.println("User type : " + listStudent.get(i).getTitle());
		System.out.println("User name : " + listStudent.get(i).getWriter());
		System.out.println("User price : " + listStudent.get(i).getRegDate());
		System.out.println("User total : " + listStudent.get(i).getViewcnt());
		System.out.println("------------------");
		}
	}
	
}