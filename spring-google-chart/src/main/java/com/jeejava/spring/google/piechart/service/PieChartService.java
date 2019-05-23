package com.jeejava.spring.google.piechart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jeejava.spring.google.piechart.dao.PieChartDao;
import com.jeejava.spring.google.piechart.dao.PieChartDao.KeyValue;

@Service
public class PieChartService {

	public List<KeyValue> getPieChartData() {
		return PieChartDao.getPieDataList();
	}

}
