package com.xworkz.user.component;

import com.xworkz.user.dto.UserDTO;
import com.xworkz.user.entity.UserEntity;
import com.xworkz.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserComponent {

    @Autowired
    private UserService userService;

    public UserComponent(){
        System.out.println("user Controller....");
    }

    @RequestMapping("/send")
    public String userMethod(UserDTO userDTO){
        System.out.println(userDTO);

        userService.validateAndSave(userDTO);


        return "UserForm";
    }

    @RequestMapping("/getAll")
    public ModelAndView getAll(ModelAndView modelAndView){

       List<UserEntity> userEntities = userService.getAllData();

        System.out.println(userEntities);

       modelAndView.addObject("dtoList",userEntities);

       modelAndView.setViewName("GetAll");

        return modelAndView;
    }



    @RequestMapping("/getId")
    public ModelAndView getById(ModelAndView modelAndView,int id){

        System.out.println(id);
      UserEntity user =  userService.getById(id);

      modelAndView.addObject("dto",user);
      modelAndView.setViewName("GetById");

      return modelAndView;
    }
}
