package com.big.to.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.big.to.vo.Sample;

@Repository
public interface SampleDAO {
	public List<Sample> sample(Sample mem);
}
