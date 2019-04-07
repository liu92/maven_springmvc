package com.springmvc.po;

import org.springframework.jdbc.core.RowMapper;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * @author lin
 */

@Entity
@Table(name = "user_info")
public class UserInfo implements RowMapper<UserInfo>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7354906658382219246L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "u_name")
	private String uname;

	@Column(name = "u_number")
	private Integer unumber;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "u_register_time")
	private Date uRegisterTime;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname == null ? null : uname.trim();
	}

	public Integer getUnumber() {
		return unumber;
	}

	public void setUnumber(Integer unumber) {
		this.unumber = unumber;
	}

	public Date getuRegisterTime() {
		return uRegisterTime;
	}

	public void setuRegisterTime(Date uRegisterTime) {
		this.uRegisterTime = uRegisterTime;
	}

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserInfo userInfo = new UserInfo();
		userInfo.setId(rs.getInt("id"));
		userInfo.setUname(rs.getString("uname"));
		userInfo.setUnumber(rs.getInt("unumber"));
		userInfo.setuRegisterTime(rs.getDate("uregister_time"));
		return userInfo;
	}

}
