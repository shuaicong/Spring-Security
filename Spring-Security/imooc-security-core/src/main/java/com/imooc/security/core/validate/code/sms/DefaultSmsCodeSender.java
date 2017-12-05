/**
 * 
 */
package com.imooc.security.core.validate.code.sms;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年12月4日 上午11:54:02
 */
public class DefaultSmsCodeSender implements SmsCodeSender {

	/**
	 * @描述：@see com.imooc.security.core.validate.code.sms.SmsCodeSender#send(java.lang.String, java.lang.String)
	 * @作者：alter
	 * @时间：2017年12月4日 上午11:54:02
	 * @param mobile
	 * @param code
	 */
	@Override
	public void send(String mobile, String code) {
		System.out.println("向手机"+mobile+"发送短信验证码"+code);
	}

}
