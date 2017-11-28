/**
 * 
 */
package com.imooc.web.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.mockito.internal.util.io.IOUtil;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.imooc.dto.FileInfo;

/**
 * @描述: 
 * @作者: alter
 * @时间：2017年11月26日 下午4:51:25
 */
@RestController
@RequestMapping("/file")
public class FileController {
	private String folder = "D:\\develop\\workspace\\imooc-security-demo\\src\\main\\java\\com\\imooc\\web\\controller";
	
	@PostMapping
	public FileInfo upload(MultipartFile file) throws Exception {
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		File localfile = new File(folder, new Date().getTime()+".txt");
		file.transferTo(localfile);
		return new FileInfo(localfile.getAbsolutePath());
	}
	
	@GetMapping("/{id}")
	public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) {
		
		try (
				InputStream inputStream = new FileInputStream(new File(folder, id+".txt"));
				OutputStream outputStream = response.getOutputStream();
				){
			
			response.setContentType("application/x-download");
			response.setHeader("Content-Disposition", "attachment;filename=text.txt");
			IOUtils.copy(inputStream, outputStream);
			outputStream.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
