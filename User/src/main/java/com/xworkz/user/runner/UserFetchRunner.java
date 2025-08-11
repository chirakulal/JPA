package com.xworkz.user.runner;

import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.service.UserService;
import com.xworkz.user.service.UserServiceImpl;

import java.util.List;

public class UserFetchRunner {

    public static void main(String[] args) {
        UserEntity user = new UserEntity();

        UserService userService = new UserServiceImpl();
//       List<String> name = userService.getNameByAge(28);
//       for(String list:name)
//           System.out.println(list);

//        String name = userService.getNameByAge(28);
//        System.out.println(name);

     //  userService.getByNameAndPlaceByAge(25);

    // userService.getByNameAndPhoneByPlace("Bangalore");

//      List<String> list=  userService.getLastNameAgeAbove25();
//      for (String lastName:list)
//        System.out.println("Last_name :"+lastName);

//        List<Long> list=  userService.getPhoneByAgeBetween20And30();
//           for (Long number:list)
//            System.out.println("PhoneNumber :"+ number);

        //userService.getNameAndPlaceByEmail("arjun.rao@gmail.com");

        String email = userService.getEmailByPhone(9012345678L);
        System.out.println("Email :"+email);


    }
}
