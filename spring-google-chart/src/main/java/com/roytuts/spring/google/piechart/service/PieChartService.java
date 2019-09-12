package com.roytuts.spring.google.piechart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.roytuts.spring.google.piechart.dao.PieChartDao;
import com.roytuts.spring.google.piechart.dao.PieChartDao.KeyValue;

@Service
public class PieChartService {

	public List<KeyValue> getPieChartData() {
		return PieChartDao.getPieDataList();
	}

}
