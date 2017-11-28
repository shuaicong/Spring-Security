/**
 * 
 */
package com.imooc.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月28日 下午4:01:28
 */
@ConfigurationProperties(prefix = "imooc.security")
public class SecurityProperties {
	private BrowserProperties browser = new BrowserProperties();

	public BrowserProperties getBrowser() {
		return browser;
	}

	public void setBrowser(BrowserProperties browser) {
		this.browser = browser;
	}
	
}
