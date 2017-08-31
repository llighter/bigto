package com.big.to.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.to.repository.SampleDAO;
import com.big.to.vo.Sample;
import com.big.to.vo.SamplePhone;

@Service
public class SampleService {
	@Autowired(required = false)
	private SampleDAO dao;

	public List<Sample> sample(Sample sam) {
		return dao.sample(sam);
	}
	
	public List<SamplePhone> samplePhone() {
		return dao.samplePhone();
	}
	
	public List<SamplePhone> phoneLine(String krname, String gb, String conditions, String changes) {
		// Map 선언
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		map.put("changes", changes);
		return dao.phoneLine(map);
	}
	
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
	
}
