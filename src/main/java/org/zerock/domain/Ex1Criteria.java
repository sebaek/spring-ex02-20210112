package org.zerock.domain;

import java.util.List;

import lombok.Data;

@Data
public class Ex1Criteria {
	
	private int bno;
	private String type;
	private String keyword;
	
	private List<String> mylist;
}
