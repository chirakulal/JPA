package com.xworkz.user.service;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    public UserServiceImpl(){
        System.out.println("Service is called...");
    }

    @Override
    public boolean validateAndSave(UserDTO userDTO) {
        System.out.println(userDTO.toString());
        UserEntity user = new UserEntity();

        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setMobileNumber(userDTO.getMobileNumber());
        user.setAge(userDTO.getAge());
        user.setGender(userDTO.getGender());

        System.out.println(user);
        userRepo.validateAndSave(user);


        return false;
    }

    @Override
    public List<UserEntity> getAllData() {
        return userRepo.getAllData();
    }

    @Override
    public UserEntity getById(int id) {
        return userRepo.getById(id);
    }

    @Override
    public String UpdateById(int id, String name) {
           boolean b=  userRepo.UpdateById(id,name);
           if(b){
               return "Update is SuccessFull";
           }else return "Not SuccessFull";


    }

    @Override
    public String DeletedById(int id) {
       Boolean b = userRepo.DeletedById(id);
       if(b){
           return "Delete is SuccessFull";
       }else return "Delete is Unsuccessfully";

    }

    @Override
    public List<String> getEmailWithPattern() {


        return userRepo.getEmailWithPattern();
    }

    @Override
    public UserEntity getNameAndEmailByPhone(long mobileNumber) {

        return userRepo.getNameAndEmailByPhone(mobileNumber);
    }

    @Override
    public List<UserEntity> getNameEmailPhoneByAgeAbove() {

        return userRepo.getNameEmailPhoneByAgeAbove();
    }
}
