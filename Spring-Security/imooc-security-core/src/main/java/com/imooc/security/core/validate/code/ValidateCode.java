package com.imooc.security.core.validate.code;

import java.time.LocalDateTime;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年12月5日 上午9:34:02
 */
public class ValidateCode {
	
	private String code;
	
	private LocalDateTime expireTime;
	
	public ValidateCode(String code, int expiretIn) {
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(expiretIn);
	}

	public ValidateCode(String code, LocalDateTime expireTime) {
		this.code = code;
		this.expireTime = expireTime;
	}
	
	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}
	

}
