package com.big.to.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.big.to.service.GraphService;
import com.big.to.vo.SamplePhone;

@Controller
@RequestMapping("/graph")
public class GraphController {
	@Autowired(required = false)
	GraphService service;
	
	// TODO : 

	// ajax로 그래프 데이터 호출
	@RequestMapping(value = "update_graph.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> updateGraph() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		testDomain td = new testDomain();
		Random random = new Random();

		// td 인스턴스의 arr변수에 랜덤 값을 넣는다.
		// 0~30 까지의 정수.
		td.arr = new ArrayList<Integer>();
		td.arr.add(random.nextInt(30));
		td.arr.add(random.nextInt(30));
		td.arr.add(random.nextInt(30));
		td.arr.add(random.nextInt(30));
		td.arr.add(random.nextInt(30));
		td.arr.add(random.nextInt(30));

		resultMap.put("test", td);

		return resultMap;
	}

	@RequestMapping(value = "query_line_phone.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryLinePhone(@RequestParam("krname") String krname,
			@RequestParam("gb") String gb, @RequestParam("conditions") String conditions,
			@RequestParam("changes") String changes) {

		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<SamplePhone> spList = service.phoneLine(krname, gb, conditions, changes);
		List<String> labels = new ArrayList<String>();
		List<Integer> data = new ArrayList<Integer>();

		for (SamplePhone sp : spList) {
			labels.add(sp.getDate());
			data.add(sp.getPrice());
		}

		resultMap.put("type", "line");
		resultMap.put("labels", labels);
		resultMap.put("data", data);
		resultMap.put("label", krname);

		return resultMap;
	}

	@RequestMapping(value = "krnameList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryKrnameList() {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> krnameList = service.krnameList();

		resultMap.put("krnameList", krnameList);

		return resultMap;
	}

	@RequestMapping(value = "gbList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryGbList(@RequestParam("krname") String krname) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> gbList = service.gbList(krname);

		resultMap.put("gbList", gbList);

		return resultMap;
	}

	@RequestMapping(value = "conditionsList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryConditionsList(@RequestParam("krname") String krname,
			@RequestParam("gb") String gb) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> conditionsList = service.conditionsList(krname, gb);

		resultMap.put("conditionsList", conditionsList);

		return resultMap;
	}

	@RequestMapping(value = "changesList.do", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> queryChangesList(@RequestParam("krname") String krname,
			@RequestParam("gb") String gb, @RequestParam("conditions") String conditions) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<String> changesList = service.changesgbList(krname, gb, conditions);

		resultMap.put("changesList", changesList);

		return resultMap;
	}
}

class testDomain {
	ArrayList<Integer> arr;

	// public testDomain(ArrayList<Integer> arr) {
	// super();
	// this.arr = arr;
	// }

	public ArrayList<Integer> getArr() {
		return arr;
	}

	public void setArr(ArrayList<Integer> arr) {
		this.arr = arr;
	}

}
