package com.roytuts.spring.h2.jdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.roytuts.spring.h2.jdbc.dao.UserDetailDao;
import com.roytuts.spring.h2.jdbc.model.UserDetail;
import com.roytuts.spring.h2.jdbc.service.UserDetailService;

public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserDetailDao userDetailDao;

	@Override
	public UserDetail getUserDetail(int id) {
		return userDetailDao.getUserDetail(id);
	}

	@Override
	public List<UserDetail> getAllUserDetail() {
		return userDetailDao.getAllUserDetail();
	}

	public UserDetailDao getUserDetailDao() {
		return userDetailDao;
	}

	@Override
	public int addUserDetail(UserDetail userDetail) {
		return userDetailDao.addUserDetail(userDetail);
	}

	@Override
	public int updateUserDetail(UserDetail userDetail) {
		return userDetailDao.updateUserDetail(userDetail);
	}

	@Override
	public int deleteUserDetail(int id) {
		return userDetailDao.deleteUserDetail(id);
	}
}
