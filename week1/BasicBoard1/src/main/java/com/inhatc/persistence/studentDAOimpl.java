package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.studentVO;

@Repository
public class studentDAOimpl implements studentDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.studentMapper";
	@Override
	public void insert(studentVO vo) {
		sqlSession.insert(namespace + ".insert", vo);
		
	}

	@Override
	public studentVO select(String userId) throws Exception {
		return sqlSession.selectOne(namespace + ".select", userId);
	}

	@Override
	public void update(studentVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(String userId) throws Exception {
		sqlSession.insert(namespace + ".delete", userId);
		
	}
	
	@Override
	public List<studentVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".ListAll");
	}
}
