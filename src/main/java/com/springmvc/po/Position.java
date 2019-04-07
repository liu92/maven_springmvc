package com.springmvc.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * @author lin
 */
@Entity
@Table(name = "test_position")
@Data
public class Position  implements Serializable {

	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	/**
	 * 名称
	 */
	@Column(name = "name",  length = 64)
	private String name;

	/**
	 * 列序号
	 */
	@Column(name = "order_no", length = 64)
	private Integer orderNo;


}
