package com.big.to.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.big.to.service.SampleService;
import com.big.to.vo.Sample;

@Controller
@RequestMapping("/*")
public class SampleController {
	@Autowired(required = false)
	SampleService service;
	
	@RequestMapping("sample.do")
	public ModelAndView sample(Sample sam, ModelAndView mav){
		mav.addObject("sample", service.sample(sam));
		mav.setViewName("sample");
		return mav;
	}
	
	// 샘플 메인화
	@RequestMapping("sample_home.do")
	public ModelAndView sample_home(Sample sam, ModelAndView mav){
//		mav.addObject("sample", service.sample(sam));
		mav.setViewName("sample_home");
		return mav;
	}
	
	// 샘플 그래프 조회 화면
	@RequestMapping("sample_graph.do")
	public ModelAndView sample_graph(Sample sam, ModelAndView mav){
//		mav.addObject("sample", service.sample(sam));
		mav.setViewName("sample_graph");
		return mav;
	}
}
