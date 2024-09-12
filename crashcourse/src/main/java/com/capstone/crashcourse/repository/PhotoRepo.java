package com.capstone.crashcourse.repository;

import com.capstone.crashcourse.entity.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotoRepo extends CrudRepository<Photo, Integer> {
}
