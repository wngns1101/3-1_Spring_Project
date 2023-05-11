package com.inhatc.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.SubjectRecordVO;

@Repository
public class subjectRecordDAOImpl implements SubjectRecordDAO {
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.sbjrecordMapper";
	
	@Override
	public SubjectRecordVO roadData(String id) throws Exception {
		return sqlSession.selectOne(namespace+".selectSubject", id);
	}

	@Override
	public void insertData(SubjectRecordVO vo) throws Exception {
		sqlSession.insert(namespace+".insertSubject", vo);		
	}

	@Override
	public void updateData(SubjectRecordVO vo) throws Exception {
		sqlSession.update(namespace+".updateSubject", vo);		
	}

	@Override
	public void deleteData(String id) throws Exception {
		sqlSession.delete(namespace+".deleteSubject", id);
	}

	@Override
	public List<SubjectRecordVO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".ListAll");
	}

}
