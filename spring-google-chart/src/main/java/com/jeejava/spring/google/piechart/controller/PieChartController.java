package com.jeejava.spring.google.piechart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jeejava.spring.google.piechart.dao.PieChartDao.KeyValue;
import com.jeejava.spring.google.piechart.service.PieChartService;

@Controller
public class PieChartController {

	@Autowired
	private PieChartService pieChartService;

	@RequestMapping(value = "/piechart", method = RequestMethod.GET)
	public String springMVC(ModelMap modelMap) {
		List<KeyValue> pieDataList = pieChartService.getPieChartData();
		modelMap.addAttribute("pieDataList", pieDataList);
		return "index";
	}
}
