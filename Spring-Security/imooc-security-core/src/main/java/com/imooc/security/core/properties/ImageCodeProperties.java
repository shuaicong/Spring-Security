/**
 * 
 */
package com.imooc.security.core.properties;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月29日 下午6:21:53
 */
public class ImageCodeProperties extends SmsCodeProperties{
	
	public ImageCodeProperties() {
		setLength(4);
	}

	private int width = 67;
	private int height = 23;
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
