package com.xworkz.user.repository;

import com.xworkz.user.entity.UserEntity;

import java.util.List;

public interface UserRepo {

    boolean save(List<UserEntity> userEntities);

    List<UserEntity> findAll();

    List<UserEntity> getUserEntityByName(String firstname);

    List<UserEntity> getUserEntityByNameAndPlace(String firstname,String place);

    List<UserEntity> getUserEntityByNameAndPhone(String firstname,String phone);

    List<UserEntity> getByAge();

    List<UserEntity> getAgeBetween();

     UserEntity getByEmail(String email);
 UserEntity getByPhone(long phone);

}
