package com.springmvc.po;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author lin
 */
@Entity
@Table(name = "test_user_ins_position")
@Data
public class UserInsPosition  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 用户ID
	 */
	@Column(name = "user_id", nullable = false)
	private Integer userId;
	/**
	 * 机构ID
	 */
	@Column(name = "ins_id", nullable = false)
	private Integer insId;
	/**
	 * 职位ID
	 */
	@Column(name = "postion_id", nullable = false)
	private Integer postionId;

}
