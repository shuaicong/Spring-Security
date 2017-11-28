/**
 * 
 */
package com.imooc.security.core.properties;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月28日 下午4:02:34
 */
public class BrowserProperties {
	
	private String loginPage = "/imooc-signIn.html";
	
	private LoginType loginType = LoginType.JSON;

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public LoginType getLoginType() {
		return loginType;
	}

	public void setLoginType(LoginType loginType) {
		this.loginType = loginType;
	}

}
