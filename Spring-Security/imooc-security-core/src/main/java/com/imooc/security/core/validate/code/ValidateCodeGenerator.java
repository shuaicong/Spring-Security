/**
 * 
 */
package com.imooc.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月29日 下午7:04:35
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
}
