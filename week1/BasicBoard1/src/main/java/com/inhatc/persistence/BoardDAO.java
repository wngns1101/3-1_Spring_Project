package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;

public interface BoardDAO {
	public void create(BoardVO vo) throws Exception;
	
	public BoardVO read(int bno)  throws Exception;
	
	public void update(BoardVO vo) throws Exception;
	
	public void delete(int bno) throws Exception;
	
	public List<BoardVO> listAll() throws Exception;
	
	public List<BoardVO> listPage(int page) throws Exception;
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;

}
