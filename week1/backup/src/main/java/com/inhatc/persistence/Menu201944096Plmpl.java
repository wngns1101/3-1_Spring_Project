package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.Menu201944096VO;

@Repository
public class Menu201944096Plmpl implements Menu201944096DAO {
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mappers.Menu201944096Mapper";
	
	@Override
	public Menu201944096VO select(String id) throws Exception {
		return sqlSession.selectOne(namespace+".select", id);
	}

	@Override
	public void insert(Menu201944096VO vo) throws Exception {
		sqlSession.insert(namespace+".insert", vo);
		
	}

	@Override
	public void update(Menu201944096VO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);	
		
	}

	@Override
	public void delete(String id) throws Exception {
		sqlSession.delete(namespace+".delete", id);
		
	}

	@Override
	public List<Menu201944096VO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".ListAll");
	}

	@Override
	public int count() throws Exception {
		return sqlSession.selectOne(namespace + ".ListCount");
	}

}
