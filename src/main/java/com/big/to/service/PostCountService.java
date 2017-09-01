package com.big.to.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.to.repository.PostCountDAO;
import com.big.to.vo.TotalIphone;

@Service
public class PostCountService {
	@Autowired(required=false)
	private PostCountDAO dao;
	
	public ArrayList<TotalIphone> countList(String krname, String gb, String conditions, 
			String changes, String contract, String guarantee){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		map.put("changes", changes);
		map.put("contract", contract);
		map.put("gurantee", guarantee);
		return dao.countList(map);		
	}
	// 한글 모델
	public ArrayList<String> krnameList(){
		return dao.krnameList();
	}
	
	// GB
	public ArrayList<String> gbList(String krname){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		return dao.gbList(krname);
	}
	
	// conditions
	public ArrayList<String> conditionsList(String krname, String gb) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		return dao.conditionsList(map);
	}
	
	// changes
	public ArrayList<String> changesgbList(String krname, String gb, String conditions) {
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		return dao.changesList(map);
	}
	
	// contract
	public ArrayList<String> contractList(String krname, String gb, 
			String conditions, String contract){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		map.put("contract", contract);
		return dao.contractList(map);
	}
	
	// guarantee
	public ArrayList<String> guaranteeList(String krname, String gb, String conditions,
			String contract, String guarantee){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		map.put("contract", contract);
		map.put("guarantee", guarantee);
		return dao.guaranteeList(map);
	}
	
	// sold
	public ArrayList<String> soldList(String krname, String gb, String conditions,
			String contract, String guarantee, String sold){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("krname", krname);
		map.put("gb", gb);
		map.put("conditions", conditions);
		map.put("contract", contract);
		map.put("guarantee", guarantee);
		map.put("sold", sold);
		return dao.soldList(map);
	}	
	
}
