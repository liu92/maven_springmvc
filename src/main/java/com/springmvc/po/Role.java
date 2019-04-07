package com.springmvc.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author lin
 */
@Entity
@Table(name = "test_role")
@Data
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * 角色名
	 */
	@Column(name = "name", nullable = false, length = 36)
	private String name;

	/**
	 * 角色描述
	 */
	@Column(name = "description", length = 512)
	private String description;


	/***
	 * 创建者
	 */
	@Column(name = "creater")
	private Integer creater;

	@Column(name = "creater_name", length = 55)
	private String createrName;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}