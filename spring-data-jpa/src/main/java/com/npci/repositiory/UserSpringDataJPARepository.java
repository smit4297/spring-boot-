package com.npci.repositiory;

import com.npci.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface UserSpringDataJPARepository extends JpaRepository<User, Long> {

}