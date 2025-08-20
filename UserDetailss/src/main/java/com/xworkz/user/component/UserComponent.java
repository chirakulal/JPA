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

      UserEntity user =  userService.getById(id);

        System.out.println(user);
      modelAndView.addObject("dto",user);
      modelAndView.setViewName("GetById");

      return modelAndView;
    }


    @RequestMapping("/updateUser")
    public ModelAndView UpdateById(ModelAndView modelAndView,int id,String name){
           String result = userService.UpdateById(id,name);

           modelAndView.addObject("result",result);

           modelAndView.setViewName("UpdateById");

             return  modelAndView;
    }

    @RequestMapping("deleteUser")
    public ModelAndView DeletedById(ModelAndView modelAndView,int id){
        String result = userService.DeletedById(id);

        modelAndView.addObject("result",result);

        modelAndView.setViewName("DeleteById");
        return modelAndView;
    }


@RequestMapping("getEmailWithPattern")
    public ModelAndView getEmailWithPattern(ModelAndView modelAndView){
      List<String> userEntities=  userService.getEmailWithPattern();

    System.out.println(userEntities);

      modelAndView.addObject("dto",userEntities);

      modelAndView.setViewName("GetEmailWithPattern");
      return modelAndView;
    }


    @RequestMapping("getByphone")
    public ModelAndView getNameAndEmailByPhone(ModelAndView modelAndView,long mobileNumber){


        System.out.println(mobileNumber);
       UserEntity user = userService.getNameAndEmailByPhone(mobileNumber);

        System.out.println(user.getName());
        System.out.println(user.getEmail());

       modelAndView.addObject("dto",user);

       modelAndView.setViewName("GetNameAndEmailByPhone");

        return modelAndView;
    }
    @RequestMapping("getNameEmailPhoneByAgeAbove")
    public ModelAndView getNameEmailPhoneByAgeAbove(ModelAndView modelAndView){

        List<UserEntity> user = userService.getNameEmailPhoneByAgeAbove();


        modelAndView.addObject("dtoList",user);

        modelAndView.setViewName("GetEmailNAmePhoneByAgeAbove");
        return modelAndView;
    }
}
