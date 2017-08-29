package com.big.to.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.big.to.vo.Sample;
import com.big.to.vo.SamplePhone;

@Repository
public interface SampleDAO {
	public List<Sample> sample(Sample mem);
	
	public List<SamplePhone> samplePhone();
}
