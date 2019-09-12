package com.roytuts.spring.tx.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.roytuts.spring.tx.model.Item;
import com.roytuts.spring.tx.row.mapper.ItemRowMapper;

@Repository
public class ItemDaoTxTemp {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	TransactionTemplate transactionTemplate;

	public List<Item> getItems() {
		String sql = "SELECT * FROM item";
		List<Item> items = new ArrayList<>();
		items = jdbcTemplate.query(sql, new ItemRowMapper());
		return items;
	}

	public void addItem(final Item item) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				try {
					String sql = "INSERT INTO item(item_id, item_name, item_desc, item_price) VALUES (?, ?, ?, ?);";
					jdbcTemplate.update(sql, new Object[] { item.getItemId(), item.getItemName(), item.getItemDesc(),
							item.getItemPrice() });
				} catch (Exception e) {
					transactionStatus.setRollbackOnly();
				}
			}
		});
	}

	public void updateItem(final Item item) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				try {
					String sql = "UPDATE item SET item_name=?, item_desc=?, item_price=? WHERE item_id=?;";
					jdbcTemplate.update(sql, new Object[] { item.getItemName(), item.getItemDesc(), item.getItemPrice(),
							item.getItemId() });
				} catch (Exception e) {
					transactionStatus.setRollbackOnly();
				}
			}
		});
	}

	public void deleteItem(final Item item) throws Exception {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				try {
					String sql = "DELETE FROM item WHERE item_id=?;";
					jdbcTemplate.update(sql, new Object[] { item.getItemId() });
				} catch (Exception e) {
					transactionStatus.setRollbackOnly();
				}
			}
		});
	}

}
