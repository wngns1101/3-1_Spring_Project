package com.inhatc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.TestVO;
import com.inhatc.persistence.TestDAO;

@Service
public class TestServiceImpl implements TestService{
	
	@Inject
	private TestDAO dao;
	
	@Override
	public void regist(TestVO vo) throws Exception {
		dao.create(vo);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		// TODO Auto-generated method stub
		return dao.listAll();
	}

}
