package com.levelup.spring.view;

import com.levelup.spring.model.User;
import com.levelup.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
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

    @RequestMapping(value = "/wizard1", method = RequestMethod.GET)
    public String page1(Model model) {
        User user = new User();
        user.setName("");
        user.setLastName("");
        user.setPid("");
        if(!model.containsAttribute("user")) {
            model.addAttribute("user", user);
        }
        return "page1.page";
    }

    @RequestMapping(value = "/wizard2", method = RequestMethod.POST)
    public String page2(Model model,@ModelAttribute("user") User user) {
        model.addAttribute("user",user);
        return "page2.page";
    }

    @RequestMapping(value = "/wizard3", method = RequestMethod.POST)
    public String page3(Model model,@ModelAttribute("user") User user) {
        model.addAttribute("user",user);
        return "page3.page";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Model model,@ModelAttribute("user") User user, HttpServletRequest request, SessionStatus status) {
        model.addAttribute("user",user);
        User user2 = (User) request.getSession().getAttribute("user");
        //userService.create(user2);

        HttpSession session = request.getSession();
        session.removeAttribute("user");

//        status.setComplete();

        return "page3.page";
    }




}




