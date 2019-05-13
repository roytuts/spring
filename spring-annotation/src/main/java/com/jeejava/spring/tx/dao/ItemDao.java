package com.jeejava.spring.tx.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jeejava.spring.tx.model.Item;
import com.jeejava.spring.tx.row.mapper.ItemRowMapper;

@Repository
public class ItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Item> getItems() {
		String sql = "SELECT * FROM item";
		List<Item> items = new ArrayList<>();
		items = jdbcTemplate.query(sql, new ItemRowMapper());
		return items;
	}

}
