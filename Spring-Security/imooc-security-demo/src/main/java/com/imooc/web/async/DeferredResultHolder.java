/**
 * 
 */
package com.imooc.web.async;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午5:51:43
 */
@Component
public class DeferredResultHolder {
	
	private Map<String, DeferredResult<String>> map = new HashMap<String, DeferredResult<String>>();

	public Map<String, DeferredResult<String>> getMap() {
		return map;
	}

	public void setMap(Map<String, DeferredResult<String>> map) {
		this.map = map;
	}
	
	

}
