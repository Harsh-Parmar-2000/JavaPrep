package com.singaji.bharosa.entities;

import lombok.Data;

@Data
public class UserResponse {
    private String userId;
    private String userName;
    private String userEmail;
    private String userAddress;
    private String userPhone;
    private String userGender;
    private String userDob;
    private String message;
}
