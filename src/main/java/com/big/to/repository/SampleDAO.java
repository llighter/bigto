package com.big.to.repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.big.to.vo.DateRange;
import com.big.to.vo.SamplePhoneWithCordinate;
import org.springframework.stereotype.Repository;

import com.big.to.vo.Sample;
import com.big.to.vo.SamplePhone;

@Repository
public interface SampleDAO {
	public List<Sample> sample(Sample mem);
	
	public List<SamplePhone> samplePhone();
	
	public List<SamplePhone> phoneLine(Map<String, Object> map);

	public List<SamplePhoneWithCordinate> phoneLineWithRange(Map<String, Object> map);
	
	public List<String> krnameList();
	
	public List<String> gbList(String krname);
	
	public List<String> conditionsList(Map<String, Object> map);
	
	public List<String> changesList(Map<String, Object> map);

	public DateRange dateRange(Map<String, Object> map);

	public List<String> dateLabels(Map<String, Object> map);
}
