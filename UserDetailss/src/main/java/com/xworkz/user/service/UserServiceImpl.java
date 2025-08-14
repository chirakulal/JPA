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
}
