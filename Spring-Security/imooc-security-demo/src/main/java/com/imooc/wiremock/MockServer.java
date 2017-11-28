/**
 * 
 */
package com.imooc.wiremock;

import com.github.tomakehurst.wiremock.client.WireMock;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.configureFor;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.removeAllMappings;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.io.ClassPathResource;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午7:05:50
 */
public class MockServer {
	
	public static void main(String[] args) throws IOException {
		//WireMock.configureFor(8062);
		configureFor("localhost", 8062);
		removeAllMappings();
		mock("/order/1", "01");
		mock("/order/2", "02");
	}
	
	private static void mock(String url, String file) throws IOException  {
		ClassPathResource resource= new ClassPathResource("mock/response/"+file+".txt");
		String content = StringUtils.join(FileUtils.readLines(resource.getFile(), "UTF-8").toArray(), "\n");
		stubFor(get(WireMock.urlPathEqualTo(url)).willReturn(aResponse().withBody(content).withStatus(200)));
	}

}
