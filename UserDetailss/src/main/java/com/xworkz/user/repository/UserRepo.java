package com.xworkz.user.repository;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.entity.UserEntity;

import java.util.List;

public interface UserRepo {

    boolean validateAndSave(UserEntity user);

    List<UserEntity> getAllData();

    UserEntity getById(int id);

    boolean UpdateById(int id, String name);

    boolean DeletedById(int id);

    List<String>  getEmailWithPattern();

    UserEntity getNameAndEmailByPhone(long mobileNumber);

    List<UserEntity> getNameEmailPhoneByAgeAbove();
}


