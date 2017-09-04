package com.big.to.controller;

import java.util.ArrayList;
import java.util.Date;
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

		resultMap.put("selectKrnameList", selectKrnameList);

		return resultMap;
	}

	@RequestMapping(value = "selectGbList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> querySelectGbList(@RequestParam("krname") String krname) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> selectGbList = service.selectGbList(krname);

		resultMap.put("selectGbList", selectGbList);

		return resultMap;
	}
	
	@RequestMapping(value = "selectTerm.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> querySelectTerm(
			@RequestParam("krname") String krname, @RequestParam("gb") String gb) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> selectTerm = service.selectTerm(krname, gb);

		resultMap.put("selectTerm", selectTerm);

		return resultMap;
	}
	
	@RequestMapping(value = "lineA.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryLineA(
			@RequestParam("krname") String krname, @RequestParam("gb") String gb,
			@RequestParam("startDay") String startDay, @RequestParam("endDay") String endDay) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Graph> spList = service.lineA(krname, gb);
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
	
	
	// TODO : 

	// ajax로 그래프 데이터 호출
	@RequestMapping(value = "updateAll.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> updateAll() {
		Map<String, Object> resultMap = new HashMap<String, Object>();

		return resultMap;
	}
	

}
