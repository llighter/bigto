package com.big.to.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.to.repository.GraphDAO;

@Service
public class GraphService {
	@Autowired(required = false)
	private GraphDAO dao;

}
