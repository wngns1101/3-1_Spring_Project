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

public class BoardDAOUpdateTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setBno(4);
		vo.setTitle("바꾼 제목");
		vo.setContent("바꾼 내용");
		vo.setWriter("바꾼 사람");
		System.out.println(vo.toString());
		dao.update(vo);
	}
	
}

