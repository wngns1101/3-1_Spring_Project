package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.Menu201944096VO;

public interface Menu201944096DAO {
	// data select 조건 id
	public Menu201944096VO select(int id) throws Exception;
	
	// data insert
	public void insert(Menu201944096VO vo) throws Exception;
	
	// data update
	public void update(Menu201944096VO vo) throws Exception;
	
	// data delete
	public void delete(int id) throws Exception;
	
	// data listAll 
	public List<Menu201944096VO> listAll() throws Exception;
}
