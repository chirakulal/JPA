package com.xworkz.user.service;

import com.xworkz.user.dto.UserDTO;

public interface UserService {

    boolean validateAndSave(UserDTO userDTO);
}
