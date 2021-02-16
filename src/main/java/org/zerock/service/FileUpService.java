package org.zerock.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
		
		try (
			InputStream is = file.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
			FileOutputStream os = new FileOutputStream(path);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			) {
			
			byte[] buffer = new byte[1024];
			int b = 0;
			while ((b = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, b);
			}
			
//			bis.close();
//			bos.close();
//			is.close();
//			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}







