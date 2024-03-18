package com.education.educationapis.helper;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {
//    public final String UPLOAD_DIR = "C:\\Puneet\\education-apis\\src\\main\\resources\\static\\image\\";
    public final String UPLOAD_DIR = new ClassPathResource("static/image/").getFile().getAbsolutePath();
    public FileUploadHelper()throws IOException{

    }
    public boolean uploadFile(MultipartFile multipartFile) {
        boolean f = false;
        try {
            InputStream inputStream = multipartFile.getInputStream();
            // this is file upload code
//            byte data[] = new byte[inputStream.available()];
//            inputStream.read(data);
////            write
//            FileOutputStream fileOutputStream = new FileOutputStream(UPLOAD_DIR + multipartFile.getOriginalFilename());
//            fileOutputStream.write(data);
//            fileOutputStream.flush();
            // this is another file uplaod code
            Files.copy(inputStream, Paths.get(UPLOAD_DIR + multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING
            );
            f=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    ;
}
