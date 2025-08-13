package com.xworkz.user.service;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public boolean validateAndSave(UserDTO userDTO) {
        System.out.println(userDTO.toString());
        UserEntity user = new UserEntity();

        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setMobileNumber(userDTO.getMobileNumber());
        user.setAge(userDTO.getAge());
        user.setGender(userDTO.getGender());

        System.out.println(user.toString());
        userRepo.validateAndSave(user);


        return false;
    }
}
