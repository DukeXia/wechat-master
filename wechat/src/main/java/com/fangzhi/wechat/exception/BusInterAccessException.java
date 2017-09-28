package com.fangzhi.wechat.exception;

import org.springframework.dao.DataAccessException;

/**
 * 第三方接口异常
 * @author Leo
 *
 */
public class BusInterAccessException extends DataAccessException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public BusInterAccessException(String msg) {
		super(msg);
	}
	public BusInterAccessException(String msg, Exception ex) {
		super(msg,ex);
	}
}
