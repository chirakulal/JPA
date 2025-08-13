package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;

public interface UserRepo {

    boolean validateAndSave(UserEntity user);
}
