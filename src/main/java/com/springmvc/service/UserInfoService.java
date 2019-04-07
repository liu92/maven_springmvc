package com.springmvc.service;

import java.util.List;

import com.springmvc.po.UserInfo;

public interface UserInfoService {

	public UserInfo getById(Integer id);

	public List<UserInfo> findAll();

	public void save(UserInfo info);
}
