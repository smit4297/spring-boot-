package com.capstone.crashcourse.controller;


import com.capstone.crashcourse.entity.Photo;
import com.capstone.crashcourse.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {

    @Autowired
    private PhotoService photoService;

    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadPhoto(@PathVariable String id){
        Photo photo = photoService.getPhotoByID(Integer.parseInt(id));
        byte[] data = photo.getData();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.valueOf(photo.getContentType()));
        ContentDisposition build = ContentDisposition
                                    .builder("attachment")
                                    .filename(photo.getFileName())
                                    .build();
        headers.setContentDisposition(build);
        if (data == null){
            return new ResponseEntity<>( HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(data, headers, HttpStatus.OK);
    }
}
