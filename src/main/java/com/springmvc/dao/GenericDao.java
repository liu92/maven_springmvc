package com.springmvc.dao;

import java.io.Serializable;
import java.util.List;

import com.springmvc.po.UserInfo;

public interface GenericDao<T, PK extends Serializable> {
	public T getById(PK id);

	public List<UserInfo> findAll();

	public void save(T entity);

	public void update(T eT);
}
