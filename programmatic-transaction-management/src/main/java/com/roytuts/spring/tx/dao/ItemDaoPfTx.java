package com.roytuts.spring.tx.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.roytuts.spring.tx.model.Item;
import com.roytuts.spring.tx.row.mapper.ItemRowMapper;

@Repository
public class ItemDaoPfTx {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	PlatformTransactionManager transactionManager;

	public List<Item> getItems() {
		String sql = "SELECT * FROM item";
		List<Item> items = new ArrayList<>();
		items = jdbcTemplate.query(sql, new ItemRowMapper());
		return items;
	}

	public void addItem(Item item) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		try {
			String sql = "INSERT INTO item(item_id, item_name, item_desc, item_price) VALUES (?, ?, ?, ?);";
			jdbcTemplate.update(sql,
					new Object[] { item.getItemId(), item.getItemName(), item.getItemDesc(), item.getItemPrice() });
			transactionManager.commit(transactionStatus);
		} catch (Exception ex) {
			transactionManager.rollback(transactionStatus);
		}
	}

	public void updateItem(Item item) {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition();
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		try {
			String sql = "UPDATE item SET item_name=?, item_desc=?, item_price=? WHERE item_id=?;";
			jdbcTemplate.update(sql,
					new Object[] { item.getItemName(), item.getItemDesc(), item.getItemPrice(), item.getItemId() });
			transactionManager.commit(transactionStatus);
		} catch (Exception ex) {
			transactionManager.rollback(transactionStatus);
		}
	}

	public void deleteItem(Item item) throws Exception {
		TransactionDefinition transactionDefinition = new DefaultTransactionDefinition(
				TransactionDefinition.PROPAGATION_REQUIRED);
		TransactionStatus transactionStatus = transactionManager.getTransaction(transactionDefinition);
		try {
			String sql = "DELETE FROM item WHERE item_id=?;";
			jdbcTemplate.update(sql, new Object[] { item.getItemId() });
			transactionManager.commit(transactionStatus);
		} catch (Exception ex) {
			ex.printStackTrace();
			transactionManager.rollback(transactionStatus);
		}
	}

}
