package com.big.to.repository;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.big.to.vo.TotalIphone;

@Repository
public interface FallPriceRateDAO {
	// total_iphone
	public ArrayList<TotalIphone> fallRateList(Map<String, Object> map);
	public ArrayList<String> krnameList();
	public ArrayList<String> gbList(String krname);
	public ArrayList<String> conditionsList(Map<String, Object> map);
	public ArrayList<String> changesList(Map<String, Object> map);
	public ArrayList<String> contractList(Map<String, Object> map);
	public ArrayList<String> guaranteeList(Map<String, Object> map);
	public ArrayList<String> soldList(Map<String, Object> map);
}
