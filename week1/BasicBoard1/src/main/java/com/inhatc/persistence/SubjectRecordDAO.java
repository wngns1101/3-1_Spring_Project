package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;

public interface SubjectRecordDAO {
	public SubjectRecordVO roadData(String id) throws Exception;
	public void insertData(SubjectRecordVO vo) throws Exception;
	public void updateData(SubjectRecordVO vo) throws Exception;
	public void deleteData(String id) throws Exception;
	public List<SubjectRecordVO> listAll() throws Exception;
}
