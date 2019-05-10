package com.jeejava.spring.h2.jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jeejava.spring.h2.jdbc.model.UserDetail;

public class UserDetailRowMapper implements RowMapper<UserDetail> {

	public UserDetail mapRow(ResultSet rs, int row) throws SQLException {
		UserDetail userDetail = new UserDetail();
		userDetail.setId(rs.getInt("id"));
		userDetail.setFirstName(rs.getString("first_name"));
		userDetail.setLastName(rs.getString("last_name"));
		userDetail.setEmail(rs.getString("email"));
		userDetail.setDob(rs.getString("dob"));
		return userDetail;
	}

}
