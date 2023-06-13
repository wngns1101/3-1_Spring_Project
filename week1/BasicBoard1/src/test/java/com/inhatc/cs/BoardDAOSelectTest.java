package com.inhatc.cs;

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

public class BoardDAOSelectTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void readMembers() throws Exception {
		System.out.println("-------Test--------");
		BoardVO vo = dao.read(1);
		System.out.println("id: " + vo.getContent());
		System.out.println("type: " + vo.getTitle());
		System.out.println("name: " + vo.getViewcnt());
		System.out.println("price: " + vo.getWriter());
		System.out.println("total: " + vo.getRegdate());
	}
}
