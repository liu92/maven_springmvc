package com.springmvc.dao.impl;

import com.springmvc.dao.UserInfoDao;
import com.springmvc.po.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;


	/**
	 * @Description //TODO 
	 * @param id
	 * @return com.springmvc.po.UserInfo
	 * @Author lin
	 * @Date 13:59 2019/3/9
	 **/
	@Override
	public UserInfo getById(Integer id) {

		String sql = "SELECT * FROM user_info WHERE id = ?";

		UserInfo userInfo = jdbcTemplate.queryForObject(sql, new UserInfo(),
				new Object[] { id });

		return userInfo;
	}

	@Override
	public List<UserInfo> findAll() {
		String sql = "SELECT * FROM user_info";
		List<UserInfo> map = jdbcTemplate.query(sql, new UserInfo());
		return map;
	}

	@Override
	public void save(UserInfo entity) {
		String sql = "insert into user_info (uname, unumber,uregister_time) values (?, ?, ?)";
		jdbcTemplate.update(sql, entity.getUname(), entity.getUnumber(),
				entity.getuRegisterTime());
	}

	@Override
	public void update(UserInfo eInfo) {
		String sql = "update user_info set uname=? where id=?";
		jdbcTemplate.update(sql, eInfo.getUname(), eInfo.getId());
	}
}
