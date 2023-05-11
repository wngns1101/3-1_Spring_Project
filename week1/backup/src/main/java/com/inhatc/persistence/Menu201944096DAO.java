package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.Menu201944096VO;

public interface Menu201944096DAO {
	
	public Menu201944096VO select(String id) throws Exception;
	public void insert(Menu201944096VO vo) throws Exception;
	public void update(Menu201944096VO vo) throws Exception;
	public void delete(String id) throws Exception;
	public List<Menu201944096VO> listAll() throws Exception;
	public int count() throws Exception;
	
}
