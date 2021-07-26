package kh.spring.main;

import java.io.File;
import java.io.FileOutputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/file")
public class FileController {
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("download")
	public void download(String oriName, String sysName,HttpServletResponse resp) throws Exception{
		String filesPath = session.getServletContext().getRealPath("files");
		File targetFile = new File(filesPath + "/" + sysName);
		
		resp.setContentType("application/octet-stream; charset=utf8");
		resp.setHeader("content-Disposition", "attachment;filename=\"" + oriName + "\"");
		
		try(FileOutputStream sos = new FileOutputStream(targetFile);){
			FileUtils.copyFile(targetFile, sos);
			sos.flush();
		}
	}
	
}
