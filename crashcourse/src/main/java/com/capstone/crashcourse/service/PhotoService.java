package com.capstone.crashcourse.service;


import com.capstone.crashcourse.entity.Photo;
import com.capstone.crashcourse.repository.PhotoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PhotoService {

    @Autowired
   private PhotoRepo photorepo;

    public Iterable<Photo> getAllPhotos() {
        return photorepo.findAll();
    }

    public Photo getPhotoByID(Integer id){
        return photorepo.findById(id).orElse(null);
    }

    public void remove(Integer id){
         photorepo.deleteById(id);
    }

    public void save(String filename, String contentType, byte[ ] data){
        Photo photo = new Photo();
        photo.setData(data);
        photo.setContentType(contentType);
        photo.setFileName(filename);
        photorepo.save(photo);
    }
}
