package com.big.to.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.big.to.vo.Graph;

@Repository
public interface GraphDAO {
	
	public List<String> selectKrnameList();
	public List<String> selectGbList(String krname);
	public List<String> selectTerm(String krnameGb);
	
	public List<Graph> lineA(Map<String, Object> map);
	
	


	
}
