package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.studentVO;
import com.inhatc.persistence.studentDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class testStudentUpdate {
	@Inject
	private studentDAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		studentVO vo = new studentVO();
		vo.setStudentId("201944096");
		vo.setStudentName("수정 테스트");
		vo.setDeptCode(40);
		vo.setAddress("인천광역시");
		vo.setPhone("010-8888-8888");
		vo.setEmail("test.inhatc.ac.kr");
		dao.update(vo);
	}
}
	