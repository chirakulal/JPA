package com.xworkz.user.component;

import com.xworkz.user.dto.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserComponent {

    public UserComponent(){
        System.out.println("user Controller....");
    }

    @RequestMapping("/send")
    public String userMethod(UserDTO userDTO){

        System.out.println("usermethod is called.....");
        System.out.println("name "+userDTO.getName());
        System.out.println("email "+userDTO.getEmail());
        System.out.println("mobile "+userDTO.getMobileNumber());
        System.out.println("age "+userDTO.getAge());
        System.out.println("gender "+userDTO.getGender());

        return "UserForm";
    }
}
