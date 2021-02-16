package org.zerock.service;

import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class FileUpService {
	public void write(MultipartFile file) {
		String path = "/temp/" + file.getOriginalFilename();
		
		try {
			InputStream is = file.getInputStream();
			FileOutputStream os = new FileOutputStream(path);
			
			int b = 0;
			while ((b = is.read()) != -1) {
				os.write(b);
			}
			
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}







