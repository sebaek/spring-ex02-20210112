package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.CommentVO;
import org.zerock.mapper.CommentMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {
	
	private CommentMapper mapper;
	

	@Override
	public void register(CommentVO comment) {
		mapper.insertSelectKey(comment);
	}
	
	@Override
	public List<CommentVO> getList() {
		return mapper.getList();
	}

}
