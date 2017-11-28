/**
 * 
 */
package com.imooc.dto;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午4:53:45
 */
public class FileInfo {
	
	public FileInfo(String path) {
		this.path = path;
	}
	private String path;
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	

}
