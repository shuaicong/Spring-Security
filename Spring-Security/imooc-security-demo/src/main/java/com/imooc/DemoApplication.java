/**
 * 
 */
package com.imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月23日 上午10:43:02
 */
@SpringBootApplication
@RestController
@EnableSwagger2
public class DemoApplication {

	/**
	 * @描述：
	 * @作者：alter
	 * @时间：2017年11月23日 上午10:43:02
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hell() {
		return "hello spring security";
	}
	
	

}
