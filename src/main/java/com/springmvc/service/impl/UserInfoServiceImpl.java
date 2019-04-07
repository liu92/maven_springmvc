package com.springmvc.service.impl;

import com.springmvc.dao.UserInfoDao;
import com.springmvc.po.UserInfo;
import com.springmvc.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lin
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {


	@Autowired
	private UserInfoDao userInfoDao;

	public UserInfoServiceImpl() {
		System.out.println("UserInfoServiceImpl init");
	}

	@Override
	public UserInfo getById(Integer id) {

		return userInfoDao.getById(id);
	}



	@Override
	public List<UserInfo> findAll() {

		return userInfoDao.findAll();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {
	 RuntimeException.class })
	public void save(UserInfo info) {

		if (null != info.getId()) {
			userInfoDao.update(info);
		} else {
			userInfoDao.save(info);
		}

	}

}
