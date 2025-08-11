package com.xworkz.user.runner;

import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.service.UserService;
import com.xworkz.user.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class UserRunner {

    public static void main(String[] args) {

        List<UserEntity> list = new ArrayList<>();
        list.add(new UserEntity("Arjun", "Rao", "Bangalore", 25, "arjun.rao@gmail.com", 9876543210L, "Male"));
        list.add(new UserEntity("Divya", "Sharma", "Delhi", 23, "divya.sharma@gmail.com", 9765432109L, "Female"));
        list.add(new UserEntity("Karan", "Mehta", "Mumbai", 30, "karan.mehta@gmail.com", 9123456780L, "Male"));
        list.add(new UserEntity("Sneha", "Patil", "Pune", 28, "sneha.patil@gmail.com", 9012345678L, "Female"));
        list.add(new UserEntity("Ravi", "Kumar", "Chennai", 35, "ravi.kumar@gmail.com", 9988776655L, "Male"));
        list.add(new UserEntity("Asha", "Reddy", "Hyderabad", 27, "asha.reddy@gmail.com", 9876567890L, "Female"));
        list.add(new UserEntity("Vikram", "Joshi", "Ahmedabad", 32, "vikram.joshi@gmail.com", 9123456701L, "Male"));
        list.add(new UserEntity("Neha", "Verma", "Kolkata", 26, "neha.verma@gmail.com", 9765412345L, "Female"));
        list.add(new UserEntity("Ajay", "Mishra", "Lucknow", 29, "ajay.mishra@gmail.com", 9998887776L, "Male"));
        list.add(new UserEntity("Pooja", "Singh", "Patna", 24, "pooja.singh@gmail.com", 9012345698L, "Female"));
//        list.add(new UserEntity("Suraj", "Bhat", "Srinagar", 33, "suraj.bhat@gmail.com", 9876123450L, "Male"));
//        list.add(new UserEntity("Anjali", "Desai", "Surat", 22, "anjali.desai@gmail.com", 9876109876L, "Female"));
//        list.add(new UserEntity("Manish", "Dube", "Bhopal", 31, "manish.dube@gmail.com", 9876501234L, "Male"));
//        list.add(new UserEntity("Ritu", "Kapoor", "Amritsar", 29, "ritu.kapoor@gmail.com", 9012678910L, "Female"));
//        list.add(new UserEntity("Nikhil", "Naik", "Goa", 27, "nikhil.naik@gmail.com", 9876987654L, "Male"));
//        list.add(new UserEntity("Kavya", "Menon", "Kochi", 23, "kavya.menon@gmail.com", 9012340000L, "Female"));
//        list.add(new UserEntity("Rahul", "Das", "Guwahati", 34, "rahul.das@gmail.com", 9988665544L, "Male"));
//        list.add(new UserEntity("Shruti", "Roy", "Agartala", 26, "shruti.roy@gmail.com", 9876000011L, "Female"));
//        list.add(new UserEntity("Yash", "Thakur", "Jaipur", 28, "yash.thakur@gmail.com", 9011002200L, "Male"));
//        list.add(new UserEntity("Meera", "Nair", "Trivandrum", 25, "meera.nair@gmail.com", 9766001122L, "Female"));

       // System.out.println(list);
        UserService userService = new UserServiceImpl();
       // userService.save(list);
//    List<UserEntity> userEntities =  userService.findAll();
//       for(UserEntity user:userEntities){
//           System.out.println(user);
//       }
//List<UserEntity> userEntities =userService.getUserEntityByName("Sneha");
//       System.out.println(userEntities);
//

//

//        List<UserEntity> userEntities =userService.getUserEntityByNameAndPhone("Meera","9766001122L");
//        System.out.println(userEntities);
//           List<UserEntity> list1 = userService.getByAge();
//           System.out.println(list1);

//        List<UserEntity> list1 = userService.getAgeBetween();
//        System.out.println(list1);

//        UserEntity list1 = userService.getByEmail("nikhil.naik@gmail.com");
//        System.out.println(list1);

//        UserEntity list1 = userService.getByEmail("9766001122L");
//        System.out.println(list1);
//


  }
}
