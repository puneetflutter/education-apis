package com.education.educationapis.controllers;

import com.education.educationapis.helper.FileUploadHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class FileUploadController {
    @Autowired
    private FileUploadHelper fileUploadHelper;
    @PostMapping("/upload_file")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
       try {
           System.out.println(file.getOriginalFilename());
           System.out.println(file.getSize());
           System.out.println(file.getContentType());
           System.out.println(file.getName());
           if (file.isEmpty()) {

               return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("File is Required");
           } else {
               if (file.getContentType().equals("image/png")) {
                   fileUploadHelper.uploadFile(file);
                   return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
               }

           }
       }catch (Exception e){
           return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());

       }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only png file is requeue");
    }
}
