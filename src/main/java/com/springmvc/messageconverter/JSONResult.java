package com.springmvc.messageconverter;

import java.io.Serializable;

/**
 * 接口返回值
 * 
 * @date 2015年12月1日 上午11:25:19
 * @author maliang
 */
public class JSONResult implements Serializable {

	/**
	 * @date 2015年12月1日 上午11:27:07
	 * @author maliang
	 */
	private static final long serialVersionUID = 6509025356081503535L;

	/**
	 * 返回编码
	 */
	private int code = 0;

	/**
	 * 返回提示信息
	 */
	private String msg;

	/**
	 * 接口返回时间
	 */
	private long ts;

	/**
	 * 返回数据
	 */
	private Object data;

	/**
	 * 信息返回构造器
	 * 
	 * @date:2015年12月1日 上午11:28:28
	 * @author maliang
	 */
	public JSONResult(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.ts = System.currentTimeMillis();
	}

	/**
	 * 返回信息构造器
	 * <p>
	 * 默认code为0
	 * </p>
	 * 
	 * @date:2015年12月1日 上午11:30:07
	 * @author maliang
	 */
	public JSONResult(String msg, Object data) {
		this.msg = msg;
		this.data = data;
	}

	/**
	 * 返回信息构造器
	 * 
	 * @date:2015年12月1日 上午11:34:45
	 * @author maliang
	 */
	public JSONResult(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	/**
	 * 默认返回信息构造器
	 * 
	 * @date:2015年12月1日 上午11:31:10
	 * @author maliang
	 */
	public JSONResult() {
		this.ts = System.currentTimeMillis();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public long getTs() {
		return ts;
	}

	public void setTs(long ts) {
		this.ts = ts;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
