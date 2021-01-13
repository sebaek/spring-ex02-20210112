package org.zerock.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class CommentMapperTests {
	
	private CommentMapper mapper;

	@Test
	public void testExist() {
		assertNotNull(mapper);
	}
	
	@Test
	public void testGetList() {
		List<CommentVO> list = mapper.getList();
		assertNotEquals(list.size(), 0);
	}

}
