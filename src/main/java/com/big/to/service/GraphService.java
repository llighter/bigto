package com.big.to.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.to.repository.GraphDAO;
import com.big.to.vo.TotalIphone;

@Service
public class GraphService {
	@Autowired(required = false)
	private GraphDAO dao;
	
	public List<String> krnameList() {
		return dao.krnameList();
	}
	public List<String> gbList(String krname) {
		return dao.gbList(krname);
	}
	public List<String> conditionsList(String krname, String gb) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.conditionsList(map);
	}
	public List<String> changesgbList(String krname, String gb, String conditions) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		return dao.changesList(map);
	}
	
	public List<String> selectTerm(String krname, String gb) {
		return dao.selectTerm(krname, gb);
	}

/*	public List<String> selectTermMulti(String krnameGb) {
		return dao.selectTermMulti(krnameGb);
	}*/
	
	public List<TotalIphone> lineSingle(
			String krname, String gb, String conditions, String changes, String start_date, String end_date) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.lineSingle(map);
	}
	
/*	public List<TotalIphone> lineMulti(String krname, String gb, String conditions, String changes) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.lineMulti(map);
	}*/
	
	public List<TotalIphone> barSingleSoldCount(
			String krname, String gb, String conditions, String changes, String start_date, String end_date) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.barSingleSoldCount(map);
	}
	
	public List<TotalIphone> barSingleRegCount(
			String krname, String gb, String conditions, String changes, String start_date, String end_date) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.barSingleRegCount(map);
	}
	
	public List<Date> termRepository(Map<String, Object> map) {
		List<Date> trmRep = new ArrayList<Date>();
		trmRep.add((Date) dao.termRepository(map));
		return trmRep;
	}
	public String renameKrnameGb(String krname, String gb) {
		String krnameGb = (krname +": "+ gb);
		return krnameGb;
	}

	


}
