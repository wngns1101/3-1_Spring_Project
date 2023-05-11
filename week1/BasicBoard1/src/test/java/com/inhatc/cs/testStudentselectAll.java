package com.inhatc.cs;

import java.util.List;

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

public class testStudentselectAll {
	@Inject
	private studentDAO dao;
	
	@Test
	public void testUpdateMembers() throws Exception {
		System.out.println("-------TEST-------");
		List<studentVO> listStudent = dao.listAll();
		int nDataCount = listStudent.size();
		System.out.println("Data Count:" + nDataCount);
		for(int i=0; i<nDataCount; i++) {
		System.out.println("##################");
		System.out.println("User Index: " + i );
		System.out.println("User User id : " + listStudent.get(i).getStudentId());
		System.out.println("User User name : " + listStudent.get(i).getEmail());
		System.out.println("User User deptcode : " + listStudent.get(i).getStudentId());
		System.out.println("User User phone : " + listStudent.get(i).getEmail());
		System.out.println("User User email : " + listStudent.get(i).getStudentId());
		System.out.println("------------------");
		}
	}
	
}
