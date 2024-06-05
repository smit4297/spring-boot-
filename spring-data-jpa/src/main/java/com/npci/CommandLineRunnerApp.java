package com.npci;

import java.time.LocalDate;
import java.time.LocalDateTime;


import com.npci.entities.User;
import com.npci.repositiory.UserJDBCRepository;
import com.npci.repositiory.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
 
//@Component
public class CommandLineRunnerApp implements CommandLineRunner {
 
	@Autowired
	private UserJDBCRepository userJDBCRepository;

	@Autowired
	private UserJPARepository respository;


	@Override
	public void run(String... args) throws Exception {
//		userJDBCRepository.save(new User(1L, "Ram", LocalDate.now().minusYears(25), "9867676", "ram@gmail.com",
//				"abc@123", LocalDateTime.now(), null));
//
//		respository.save(new User(1L, "Naveen Pn", LocalDate.now().minusYears(25), "95355", "ram@gmail.com",
//				"abc@123", LocalDateTime.now(), null));
	}
 
}