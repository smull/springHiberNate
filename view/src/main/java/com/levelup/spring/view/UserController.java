package com.levelup.spring.view;

import com.levelup.spring.model.User;
import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


/**
 * Created by java on 21.04.2015.
 */
@Controller
@RequestMapping("/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    UserService userService;

//    @RequestMapping(value = "/wizard1", method = RequestMethod.GET)
//    public String page1(Model model) {
//        User user = new User();
//        user.setName("");
//        user.setLastName("");
//        user.setPid("");
//        if(!model.containsAttribute("user")) {
//            model.addAttribute("user", user);
//        }
//        return "page1.page";
//    }
//
//    @RequestMapping(value = "/wizard2", method = RequestMethod.POST)
//    public String page2(Model model,@ModelAttribute("user") User user) {
//        model.addAttribute("user",user);
//        return "page2.page";
//    }
//
//    @RequestMapping(value = "/wizard3", method = RequestMethod.POST)
//    public String page3(Model model,@ModelAttribute("user") User user) {
//        model.addAttribute("user",user);
//        return "page3.page";
//    }


//    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
//    public @ResponseBody ResponseEntity<User> save(@RequestBody User user
//                                     ) {
//        User user1 = new User();
//        user1 = user;
////        user1.setName(name);
////        user1.setLastName(lastName);
////        user1.setPid(pid);
//
//
//        //model.addAttribute("user",user1);
//        //model.addAttribute("user",user);
//        //User user2 = (User) request.getSession().getAttribute("user");
//        //userService.create(user2);
//
////        HttpSession session = request.getSession();
////        session.removeAttribute("user");
//
////        status.setComplete();
//
////        return "page3.page";
////        return "tableUI.page";
//        return new ResponseEntity<User>(user, HttpStatus.OK);
//    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public  ResponseEntity<User> save(@ModelAttribute User user ) {
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPage() {
        return "tableUI.page";
    }

    @ModelAttribute("user")
    public User getUser(){
        return new User();
    }








}




