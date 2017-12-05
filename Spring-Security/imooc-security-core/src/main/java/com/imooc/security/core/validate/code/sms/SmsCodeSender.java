package com.imooc.security.core.validate.code.sms;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年12月4日 上午11:49:59
 */
public interface SmsCodeSender {

	void send(String mobile, String code);
}
