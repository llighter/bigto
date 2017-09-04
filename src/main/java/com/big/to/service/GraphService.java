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
	public List<String> selectTermMulti(String krnameGb) {
		return dao.selectTermMulti(krnameGb);
	}
	
	public List<Graph> lineSingle(String krname, String gb) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.lineSingle(map);
	}
	
	public List<Graph> lineMulti(String krname, String gb) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.lineMulti(map);
	}
	
	public List<Graph> barSingle(String krGb) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krnamegb", krGb);
/*		map.put("krname", krname);
		map.put("gb", gb);*/
		return dao.barSingle(map);
	}
	
	public String renameKrnameGb(String krname, String gb) {
		String krnameGb = (krname +": "+ gb);
		return krnameGb;
	}

	


}
