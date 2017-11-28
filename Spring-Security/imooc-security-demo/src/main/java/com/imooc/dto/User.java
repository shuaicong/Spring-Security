/**
 * 
 */
package com.imooc.dto;

import java.util.Date;

import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.validator.MyConstraint;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月23日 下午6:41:38
 */
public class User {
	
	public interface UserSimpleView {};
	public interface UserDetaiview extends UserSimpleView{};
	private String id;
	
	@MyConstraint(message = "这是一个测试")
	private String username;
	@NotBlank(message = "密码不能为空")
	private String password;
	@Past(message = "生日必须是过去的时间")
	private Date birthday;
	
	@JsonView(UserSimpleView.class)
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@JsonView(UserDetaiview.class)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@JsonView(UserSimpleView.class)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
