package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.SubjectRecordDAO;



@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		)

public class selectSubjectListAll {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	
	public void readWithPW() throws Exception {
		System.out.println("-------TEST-------");
		List<SubjectRecordVO> listStudent = dao.listAll();
		int nDataCount = listStudent.size();
		System.out.println("Data Count:" + nDataCount);
		for(int i=0; i<nDataCount; i++) {
		System.out.println("##################");
		System.out.println("User Index: " + i );
		System.out.println("User id : " + listStudent.get(i).getId());
		System.out.println("User korean : " + listStudent.get(i).getKorean());
		System.out.println("User english : " + listStudent.get(i).getEnglish());
		System.out.println("User math : " + listStudent.get(i).getMath());
		System.out.println("------------------");
		}
	}
}
