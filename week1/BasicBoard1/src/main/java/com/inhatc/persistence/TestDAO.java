package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.TestVO;

public interface TestDAO {
	public void create(TestVO vo) throws Exception;
	public List<BoardVO> listAll() throws Exception;
}
