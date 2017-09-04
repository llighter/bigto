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
import com.big.to.vo.TotalIphone;

@Controller
@RequestMapping("/graph/")
public class GraphController {
	@Autowired(required = false)
	GraphService service;
	
	@RequestMapping(value = "krnameList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryKrnameList() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> krnameList = service.krnameList();
		resultMap.put("krnameList", krnameList);
		return resultMap;
	}

	@RequestMapping(value = "gbList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryGbList(
			@RequestParam("krname") String krname) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> gbList = service.gbList(krname);
		resultMap.put("gbList", gbList);
		return resultMap;
	}
	@RequestMapping(value="conditionsList.do", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryConditionsList(
			@RequestParam("krname") String krname,
			@RequestParam("gb") String gb) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> conditionsList = service.conditionsList(krname, gb);
		resultMap.put("conditionsList", conditionsList);
		return resultMap;
	}
	@RequestMapping(value="changesList.do", method=RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryChangesList(
			@RequestParam("krname") String krname,
			@RequestParam("gb") String gb,
			@RequestParam("conditions") String conditions) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> changesList = service.changesgbList(krname, gb, conditions);
		resultMap.put("changesList", changesList);
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
			@RequestParam("krname") String krname,
			@RequestParam("gb") String gb,
			@RequestParam("conditions") String conditions,
			@RequestParam("changes") String changes,
			@RequestParam("start_date") String start_date,
			@RequestParam("end_date") String end_date) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<TotalIphone> spList = service.lineSingle(
				krname, gb, conditions, changes, start_date, end_date);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();

		for (TotalIphone sp : spList) {
			labels.add(Dogu.strForm(sp.getPostdate()));
			data.add(sp.getSoldprice());
		}

		resultMap.put("type", "line");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);

		return resultMap;
	}
	
/*	@RequestMapping(value = "lineMulti.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryMulti(
			@RequestParam("krname") String krname,
			@RequestParam("gb") String gb,
			@RequestParam("conditions") String conditions,
			@RequestParam("changes") String changes,
			@RequestParam("start_date") String start_date,
			@RequestParam("end_date") String end_date) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<TotalIphone> spList = service.lineMulti(krname, gb);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();
		
		for (TotalIphone sp : spList) {
			labels.add(Dogu.strForm(sp.getPostdate()));
			data.add(sp.getSoldprice());
		}
		
		resultMap.put("type", "multiline");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);
		
		return resultMap;
	}*/
	
	@RequestMapping(value = "barSingleSoldCount.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryBarSingleSoldCount(
			@RequestParam("krname") String krname,
			@RequestParam("gb") String gb,
			@RequestParam("conditions") String conditions,
			@RequestParam("changes") String changes,
			@RequestParam("start_date") String start_date,
			@RequestParam("end_date") String end_date) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<TotalIphone> spList = service.barSingleSoldCount(
				krname, gb, conditions, changes, start_date, end_date);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();

		for (TotalIphone sp : spList) {
			labels.add(Dogu.strForm(sp.getPostdate()));
			data.add(sp.getSoldcount());
		}

		resultMap.put("type", "bar");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);

		return resultMap;
	}
	
	@RequestMapping(value = "barSingleRegCount.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryBarSingleRegCount(
			@RequestParam("krname") String krname,
			@RequestParam("gb") String gb,
			@RequestParam("conditions") String conditions,
			@RequestParam("changes") String changes,
			@RequestParam("start_date") String start_date,
			@RequestParam("end_date") String end_date) {
		
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<TotalIphone> spList = service.barSingleRegCount(
				krname, gb, conditions, changes, start_date, end_date);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();
		
		for (TotalIphone sp : spList) {
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
