package Jobportal.jobportal.controller;

import Jobportal.jobportal.entity.user;
import Jobportal.jobportal.entity.userType;
import jakarta.validation.Valid;
import Jobportal.jobportal.service.userTypeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class userController {

        private final userTypeservice userTypeservice;

        @Autowired
        public userController(userTypeservice userTypeservice){

            this.userTypeservice = userTypeservice;
        }

        @GetMapping("/register")
        public String register(Model model){
            List<userType> userTypes =  userTypeservice.getAll();
            model.addAttribute("getAllTypes",userTypes);
            model.addAttribute("user", new user());
            return "register";
        }
//        @PostMapping("/register/new")
//        public String userRegistration(@Valid user user){
//            System.out.println("user::"+user);
//            return dashboard;
//
//        }
}
