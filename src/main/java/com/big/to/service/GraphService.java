package com.big.to.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.to.repository.GraphDAO;
import com.big.to.vo.Graph;

@Service
public class GraphService {
	@Autowired(required = false)
	private GraphDAO dao;
	
	public List<String> selectKrnameList() {
		return dao.selectKrnameList();
	}
	
	public List<String> selectGbList(String krname) {
		return dao.selectGbList(krname);
	}
	
	public List<String> selectTerm(String krname, String gb) {
		return dao.selectTerm(krname, gb);
	}
	
	public List<Graph> lineA(String krname, String gb) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.lineA(map);
	}
	

	


}
