/**
 * 
 */
package com.imooc.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月29日 下午4:55:16
 */
public class ValidateCodeException extends AuthenticationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7285211528095468156L;

	public ValidateCodeException(String msg) {
		super(msg);
	}

}
