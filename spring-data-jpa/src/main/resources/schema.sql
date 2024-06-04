CREATE TABLE users(
                      user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      full_name VARCHAR(255) NOT NULL,
                      dob DATE NOT NULL,
                      mobile VARCHAR(255) NOT NULL,
                      email VARCHAR(255) NOT NULL,
                      password VARCHAR(255) NOT NULL,
                      create_date TIMESTAMP,
                      update_date TIMESTAMP
);