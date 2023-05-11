package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.studentVO;

public interface studentDAO {
	public void insert(studentVO vo);
	public studentVO select(String userId) throws Exception;
	public void update(studentVO vo) throws Exception;
	public void delete(String userid) throws Exception;
	public List<studentVO> listAll() throws Exception;
}
