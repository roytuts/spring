package com.roytuts.spring.mvc.jdbc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.roytuts.spring.mvc.jdbc.dao.UserDetailDao;
import com.roytuts.spring.mvc.jdbc.model.UserDetail;
import com.roytuts.spring.mvc.jdbc.service.UserDetailService;

public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserDetailDao userDetailDao;

	public UserDetail getUserDetail(int id) {
		return userDetailDao.getUserDetail(id);
	}

	public List<UserDetail> getAllUserDetail() {
		return userDetailDao.getAllUserDetail();
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

	public UserDetailDao getUserDetailDao() {
		return userDetailDao;
	}
}
