package com.big.to.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.big.to.vo.Graph;

@Repository
public interface GraphDAO {
	
	public List<String> selectKrnameList();
	public List<String> selectGbList(String krname);
	public List<String> selectTerm(String krname, String gb);
	public List<String> selectTermMulti(String krnameGb);
	
	public List<Graph> renameKrnameGb(Map<String, Object> map);
	
	public List<Graph> lineSingle(Map<String, Object> map);
	public List<Graph> lineMulti(Map<String, Object> map);
	
	public List<Graph> barSingle(Map<String, Object> map);
	


	
}
