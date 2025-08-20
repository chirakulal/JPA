package com.xworkz.user.service;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.entity.UserEntity;

import java.util.List;

public interface UserService {

    boolean validateAndSave(UserDTO userDTO);

    List<UserEntity> getAllData();

    UserEntity getById(int id);

    String UpdateById(int id, String name);

    String DeletedById(int id);

   List<String> getEmailWithPattern();

   UserEntity getNameAndEmailByPhone(long mobileNumber);

    List<UserEntity>getNameEmailPhoneByAgeAbove();
}
