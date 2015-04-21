package com.levelup.spring.view;

import com.levelup.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by java on 21.04.2015.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    private User user;


    @RequestMapping("/create")
    public String createUser(Model model, @ModelAttribute("user") User user){
        User user1 = new User();
//        user1 = user;
        model.addAttribute("user",user1);


        return "user.page";
    }






}
