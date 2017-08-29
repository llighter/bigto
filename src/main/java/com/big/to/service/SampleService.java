package com.big.to.service;

import java.util.List;

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
	
}
