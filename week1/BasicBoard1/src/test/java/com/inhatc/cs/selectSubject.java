package com.inhatc.cs;

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

public class selectSubject {
	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void readMembers() throws Exception {
		System.out.println("-------Test--------");
		SubjectRecordVO vo = dao.roadData("201944096");
		System.out.println("studentId: " + vo.getId());
		System.out.println("studentName: " + vo.getKorean());
		System.out.println("deptCode: " + vo.getEnglish());
		System.out.println("address: " + vo.getMath());
	}
}
