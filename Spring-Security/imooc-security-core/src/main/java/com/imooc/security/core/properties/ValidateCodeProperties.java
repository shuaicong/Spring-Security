/**
 * 
 */
package com.imooc.security.core.properties;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月29日 下午6:25:41
 */
public class ValidateCodeProperties {

	private ImageCodeProperties image = new ImageCodeProperties();
	private SmsCodeProperties sms = new SmsCodeProperties();

	public ImageCodeProperties getImage() {
		return image;
	}

	public void setImage(ImageCodeProperties image) {
		this.image = image;
	}

	public SmsCodeProperties getSms() {
		return sms;
	}

	public void setSms(SmsCodeProperties sms) {
		this.sms = sms;
	}
}
