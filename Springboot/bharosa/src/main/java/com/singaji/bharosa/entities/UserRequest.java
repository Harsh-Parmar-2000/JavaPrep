package com.singaji.bharosa.entities;

import lombok.Data;

@Data
public class UserRequest {
    private String userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private String userAddress;
    private String userPhone;
    private String userGender;
    private String userDob;

}
