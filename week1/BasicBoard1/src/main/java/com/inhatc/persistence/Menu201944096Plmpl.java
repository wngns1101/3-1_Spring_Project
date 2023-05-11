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
	// select * from tbl_201944096_menu where id = id
	public Menu201944096VO select(int id) throws Exception {
		return sqlSession.selectOne(namespace+".select", id);
	}

	@Override
	// insert into tbl_201944096_menu (id, type, name, price, total) values (#{id}, #{type}, #{name}, #{price}, #{total})
	public void insert(Menu201944096VO vo) throws Exception {
		sqlSession.insert(namespace+".insert", vo);
		
	}

	@Override
	// update tbl_201944096_menu set type = #{type}, name = #{name}, price = #{price}, total = #{total} where id = #{id}
	public void update(Menu201944096VO vo) throws Exception {
		sqlSession.update(namespace+".update", vo);	
		
	}

	@Override
	// delete from tbl_201944096_menu where id = #{id}
	public void delete(int id) throws Exception {
		sqlSession.delete(namespace+".delete", id);
		
	}

	@Override
	// select * from tbl_201944096_menu order by id asc
	public List<Menu201944096VO> listAll() throws Exception {
		return sqlSession.selectList(namespace + ".ListAll");
	}
	
	@Override
	// 콘솔에 결과내용 띄우는 메서드
	public String toString() {
		return "Menu201944096Plmpl [sqlSession=" + sqlSession + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
