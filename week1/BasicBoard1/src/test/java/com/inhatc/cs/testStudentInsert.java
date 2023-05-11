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

public class testStudentInsert {
	@Inject
	private studentDAO dao;
	
	@Test
	public void testInsertMember() throws Exception {
		studentVO vo1 = new studentVO();
		vo1.setStudentId("1234");
		vo1.setStudentName("시험");
		vo1.setDeptCode(23);
		vo1.setAddress("경기도 광명시");
		vo1.setPhone("010-6554-6447");
		vo1.setEmail("wngns1101@naver.com");
		dao.insert(vo1);
		
		studentVO vo2 = new studentVO();
		vo2.setStudentId("1234567");
		vo2.setStudentName("test");
		vo2.setDeptCode(40);
		vo2.setAddress("부천시 원미구");
		vo2.setPhone("010-7777-6447");
		vo2.setEmail("wngns1101@gmail.com");
		dao.insert(vo2);
		
		studentVO vo3 = new studentVO();
		vo3.setStudentId("201944096");
		vo3.setStudentName("이주훈");
		vo3.setDeptCode(44);
		vo3.setAddress("부천시 원미구");
		vo3.setPhone("010-2819-6447");
		vo3.setEmail("wngns0812@gmail.com");
		dao.insert(vo3);
	}
}
