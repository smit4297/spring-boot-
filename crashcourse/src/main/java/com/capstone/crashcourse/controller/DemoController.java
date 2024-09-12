package com.capstone.crashcourse.controller;


import com.capstone.crashcourse.entity.Photo;
import com.capstone.crashcourse.service.PhotoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.*;

@RestController
public class DemoController {


    @Autowired
    private PhotoService photoService;




    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }


    @GetMapping("/photos")
    public Iterable<Photo> getPhotos(){
        return photoService.getAllPhotos();
    }

    @GetMapping("/photos/{id}")
    public ResponseEntity<Photo> getPhotosById(@PathVariable String id){
        Photo photo = photoService.getPhotoByID(Integer.parseInt(id));
        if(photo != null)
            return new ResponseEntity<>(photo,HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("/photos/{id}")
    public ResponseEntity< Void > deletePhotoById(@PathVariable String id){
        photoService.remove(Integer.parseInt(id));
        return new ResponseEntity<>(HttpStatus.OK);
    }

//    @PostMapping("/photo")
//    public ResponseEntity<Void> addPhoto(@RequestBody @Valid Photo photo){
//        photo.setId(UUID.randomUUID().toString());
//        photoService.getPhotos().put(photo.getId(), photo);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//    }


    @PostMapping("/actualPhoto")
    public ResponseEntity<Void> addActualPhoto(@RequestPart("data") MultipartFile file) throws IOException {
        photoService.save(file.getOriginalFilename(),file.getContentType(), file.getBytes());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
