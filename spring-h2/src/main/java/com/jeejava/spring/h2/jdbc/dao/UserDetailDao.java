package com.jeejava.spring.h2.jdbc.dao;

import java.util.List;

import com.jeejava.spring.h2.jdbc.model.UserDetail;

public interface UserDetailDao {

	public UserDetail getUserDetail(int id);

	public List<UserDetail> getAllUserDetail();

	public int addUserDetail(UserDetail userDetail);

	public int updateUserDetail(UserDetail userDetail);

	public int deleteUserDetail(int id);

}
