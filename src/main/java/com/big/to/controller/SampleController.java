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
}
