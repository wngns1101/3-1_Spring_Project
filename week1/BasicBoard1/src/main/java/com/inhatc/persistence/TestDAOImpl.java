package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.TestVO;

@Repository
public class TestDAOImpl implements TestDAO{
	@Inject
	private SqlSession session;
	
	private static final String namespace = "com.inhatc.mapper.BoardMapper"; 

	@Override
	public void create(TestVO vo) throws Exception {
		session.insert(namespace + ".create", vo);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

}
