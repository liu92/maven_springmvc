package com.springmvc.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * @author lin
 */
@Entity
@Table(name = "test_user")
@Data
public class User  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * 用户名
	 */
	@Column(name = "user_name", length = 50)
	private String userName;

	/**
	 * 密码
	 */
	@JsonIgnore
	@Column(name = "password", nullable = false, length = 64)
	private String password;

	/**
	 * 盐值
	 */
	@JsonIgnore
	@Column(name = "salt", nullable = false, length = 64)
	private String salt;

	/**
	 * 真实姓名
	 */
	@Column(name = "name", length = 10)
	private String name;



	/**
	 * 是否登录
	 */
	@Column(name = "is_login", nullable = false)
	private Boolean login;


	/**
	 * 删除标志
	 */
	@Column(name = "delete_flag", nullable = false)
	private boolean deleteFlag = false;

	/***
	 * 创建者
	 */
	@Column(name = "userId")
	private Integer userId;

	@Column(name = "creater_name", length = 55)
	private String createrName;

	/**
	 * 电子邮件
	 */
	@Column(length = 50, name = "email")
	private String email;

	/**
	 * 电话
	 */
	@Column(length = 20, name = "phone")
	private String phone;


	@ManyToMany
	@JoinTable(name = "",joinColumns = {})
	private Set<Role> roles;

	
}