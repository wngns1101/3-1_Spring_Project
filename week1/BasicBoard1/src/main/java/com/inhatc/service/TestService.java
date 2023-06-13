package com.inhatc.service;

import java.util.List;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.TestVO;

public interface TestService {
	public void regist(TestVO vo) throws Exception;
	public List<BoardVO> listAll() throws Exception;
}
