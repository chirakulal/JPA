package com.xworkz.user.service;

import com.xworkz.user.entity.UserEntity;

import java.util.List;

public interface UserService {

    boolean save(List<UserEntity> userEntities);

    List<UserEntity> findAll();

    List<UserEntity> getUserEntityByName(String firstname);

    List<UserEntity> getUserEntityByNameAndPlace(String firstname,String place);

    List<UserEntity> getUserEntityByNameAndPhone(String firstname,String phone);

    List<UserEntity> getByAge();

   List<UserEntity> getAgeBetween();

    UserEntity getByEmail(String email);

   UserEntity getByPhone(long phone);

   String getNameByAge(int age);

   UserEntity getByNameAndPlaceByAge(int age);

   UserEntity getByNameAndPhoneByPlace(String place);

   List<String> getLastNameAgeAbove25();

   List<Long> getPhoneByAgeBetween20And30();

  UserEntity  getNameAndPlaceByEmail(String email);

  String getEmailByPhone(Long phoneNo);
}
