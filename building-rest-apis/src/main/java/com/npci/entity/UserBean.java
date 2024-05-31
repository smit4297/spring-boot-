package com.npci.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserBean {


    private Long userId;
    @NotBlank(message = "fullname should not be empty")
    @Size(min = 3,max = 10, message = "full name min length is 3")
    private String fullName;

    @Past(message = "DOB should be past date")
    @JsonFormat(pattern ="dd-MM-yyyy")
    private LocalDate dob;
    @NotNull
    @Pattern(regexp = "[6789]{1}[0-9]{9}", message="Enter a valid 10 digit no")
    private String mobile;
    private String email;
    private String password;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;


    public UserBean() {

    }
    public UserBean(Long userId, String fullName, LocalDate dob, String mobile, String email, String password,
                    LocalDateTime createDate, LocalDateTime updateDate) {
        super();
        this.userId = userId;
        this.fullName = fullName;
        this.dob = dob;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }


    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }


}
