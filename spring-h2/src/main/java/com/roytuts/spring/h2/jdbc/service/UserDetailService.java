package com.roytuts.spring.h2.jdbc.service;

import java.util.List;

import com.roytuts.spring.h2.jdbc.model.UserDetail;

public interface UserDetailService {

	public UserDetail getUserDetail(int id);

	public List<UserDetail> getAllUserDetail();

	public int addUserDetail(UserDetail userDetail);

	public int updateUserDetail(UserDetail userDetail);

	public int deleteUserDetail(int id);
}
