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

public class testStudentSelect {
	@Inject
	private studentDAO dao;
	
	@Test
	public void readMembers() throws Exception {
		System.out.println("-------Test--------");
		studentVO vo = dao.select("201944096");
		System.out.println("studentId: " + vo.getStudentId());
		System.out.println("studentName: " + vo.getStudentName());
		System.out.println("deptCode: " + vo.getDeptCode());
		System.out.println("address: " + vo.getAddress());
		System.out.println("phone: " + vo.getPhone());
		System.out.println("email: " + vo.getEmail());
	}
}
