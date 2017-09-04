package com.big.to.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.big.to.vo.TotalIphone;


@Repository
public interface GraphDAO {
	
	public List<String> krnameList();
	public List<String> gbList(String krname);
	public List<String> conditionsList(Map<String, Object> map);
	public List<String> changesList(Map<String, Object> map);
	
	public List<String> selectTerm(String krname, String gb);
	
	/*public List<String> selectTermMulti(String krnameGb);*/
	
	public List<TotalIphone> lineSingle(Map<String, Object> map);
	public List<TotalIphone> lineMulti(Map<String, Object> map);
	
	public List<TotalIphone> barSingleSoldCount(Map<String, Object> map);
	public List<TotalIphone> barSingleRegCount(Map<String, Object> map);
	
	public List<Date> termRepository(Map<String, Object> map);
	public List<TotalIphone> renameKrnameGb(Map<String, Object> map);

	
}
