package com.springmvc.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author lin
 */
@Entity
@Table(name = "test_institution")
@Data
public class Institution  implements Serializable {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 机构号
	 */
	@Column(name = "institution_number", nullable = false, length = 64)
	private String institutionNumber;

	/**
	 * 机构名称
	 */
	@Column(name = "name", nullable = false, length = 64)
	private String name;

	/**
	 * 详细街道
	 */
	@Column(name = "street")
	private String street;
	

	@Column(name = "prent_id")
	private Integer prentId;

	/**
	 * 电话
	 */
	@Column(name = "mobile", length = 24)
	private String mobile;

	

}
