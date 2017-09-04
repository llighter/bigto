package com.big.to.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.big.to.service.GraphService;
import com.big.to.vo.Graph;

@Controller
@RequestMapping("/graph")
public class GraphController {
	@Autowired(required = false)
	GraphService service;
	
	@RequestMapping(value = "selectKrnameList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> querySelectKrnameList() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> selectKrnameList = service.selectKrnameList();
		resultMap.put("krnameList", selectKrnameList);
		return resultMap;
	}

	@RequestMapping(value = "selectGbList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> querySelectGbList(
			@RequestParam("krname") String krname) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> selectGbList = service.selectGbList(krname);
		resultMap.put("gbList", selectGbList);
		return resultMap;
	}
	
	@RequestMapping(value = "selectTerm.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> querySelectTerm(
		@RequestParam("krname") String krname, @RequestParam("gb") String gb) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> selectTerm = service.selectTerm(krname, gb);
		
		resultMap.put("term", selectTerm);

		return resultMap;
	}
	

/*	@RequestMapping(value = "selectTermMulti.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> querySelectTermMulti(
			@RequestParam("krnameGb") String krnameGb) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> selectTermMulti = service.selectTermMulti(krnameGb);
		
		resultMap.put("termMulti", selectTermMulti);
		
		return resultMap;
	}*/
	
	@RequestMapping(value = "lineSingle.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryLineSingle(
			@RequestParam("krname") String krname, @RequestParam("gb") String gb,
			@RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Graph> spList = service.lineSingle(krname, gb);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();

		for (Graph sp : spList) {
			labels.add(Dogu.strForm(sp.getPostdate()));
			data.add(sp.getSoldprice());
		}

		resultMap.put("type", "line");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);

		return resultMap;
	}
	
	@RequestMapping(value = "lineMulti.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryMulti(
			@RequestParam("krname") String krname, @RequestParam("gb") String gb,
			@RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Graph> spList = service.lineMulti(krname, gb);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();
		
		for (Graph sp : spList) {
			labels.add(Dogu.strForm(sp.getPostdate()));
			data.add(sp.getSoldprice());
		}
		
		resultMap.put("type", "multiline");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);
		
		return resultMap;
	}
	
	@RequestMapping(value = "barSingle.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryBarSingle(
			@RequestParam("krname") String krname, @RequestParam("gb") String gb,
			@RequestParam("start_date") String start_date, @RequestParam("end_date") String end_date) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		String krGb = service.renameKrnameGb(krname, gb);
		List<Graph> spList = service.barSingle(krGb);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();

		for (Graph sp : spList) {
			labels.add(Dogu.strForm(sp.getPostdate()));
			data.add(sp.getSoldcount());
		}

		resultMap.put("type", "bar");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);

		return resultMap;
	}
	
	
	// radar
	// barstack
}
