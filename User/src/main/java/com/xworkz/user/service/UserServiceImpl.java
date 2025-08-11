package com.xworkz.user.service;

import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.repository.UserRepo;
import com.xworkz.user.repository.UserRepoImpl;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public boolean save(List<UserEntity> userEntities) {

        System.out.println("Service...........");
        UserRepo userRepo = new UserRepoImpl();
        userRepo.save(userEntities);

        return false;
    }

    @Override
    public List<UserEntity> findAll() {

        return new UserRepoImpl().findAll();
    }

    @Override
    public List<UserEntity> getUserEntityByName(String firstname) {

        return new UserRepoImpl().getUserEntityByName(firstname);
    }

    @Override
    public List<UserEntity> getUserEntityByNameAndPlace(String firstname, String place) {
        return new UserRepoImpl().getUserEntityByNameAndPlace(firstname,place);
    }

    @Override
    public List<UserEntity> getUserEntityByNameAndPhone(String firstname, String phone) {
        return new UserRepoImpl().getUserEntityByNameAndPhone(firstname,phone) ;
    }

    @Override
    public List<UserEntity> getByAge() {
        return new UserRepoImpl().getByAge();
    }

    @Override
    public List<UserEntity> getAgeBetween() {
        return new UserRepoImpl().getAgeBetween();
    }

    @Override
    public UserEntity getByEmail(String email) {
        return new UserRepoImpl().getByEmail(email);
    }

    @Override
    public UserEntity getByPhone(long phone) {
        return new UserRepoImpl().getByPhone(phone);
    }

    @Override
    public String getNameByAge(int age) {
        return new UserRepoImpl().getNameByAge(age);
    }

    @Override
    public UserEntity getByNameAndPlaceByAge(int age) {
        return new UserRepoImpl().getByNameAndPlaceByAge(age);
    }

    @Override
    public UserEntity getByNameAndPhoneByPlace(String place) {
        return new UserRepoImpl().getByNameAndPhoneByPlace(place);
    }

    @Override
    public List<String> getLastNameAgeAbove25() {
        return new UserRepoImpl().getLastNameAgeAbove25();
    }

    @Override
    public List<Long> getPhoneByAgeBetween20And30() {
        return new UserRepoImpl().getPhoneByAgeBetween20And30();
    }

    @Override
    public UserEntity getNameAndPlaceByEmail(String email) {
        return new UserRepoImpl().getNameAndPlaceByEmail(email);
    }

    @Override
    public String getEmailByPhone(Long phoneNo) {
        return new UserRepoImpl().getEmailByPhone(phoneNo);
    }
}
