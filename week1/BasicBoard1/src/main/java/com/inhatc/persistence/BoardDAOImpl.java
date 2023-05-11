package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;


// DAO라는 의미
@Repository
public class BoardDAOImpl implements BoardDAO{
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.BoardMapper";

	@Override
	public void create(BoardVO vo) throws Exception {
		sqlSession.insert(namespace + ".create", vo);
	}

	@Override
	public BoardVO read(int bno) throws Exception {
		return sqlSession.selectOne(namespace + ".read", bno);
	} 
	
	@Override
	public void update(BoardVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
		
	}

	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete(namespace + ".delete", bno);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".ListAll");
	}
}
