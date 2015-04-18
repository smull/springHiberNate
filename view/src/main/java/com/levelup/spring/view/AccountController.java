package com.levelup.spring.view;

import com.levelup.spring.model.Account;
import com.levelup.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by java on 18.04.2015.
 */
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping("/acc")
    public  String getMainPage(Model model) {
       // model.addAttribute("accounts",accountService.getAllAccounts());
        return "account.page";
    }

    @RequestMapping(value = "all", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Account> getAllCategory() {
        List<Account> accounts = accountService.getAllAccounts();
        return  accounts;
    }

    @RequestMapping(value = "save", method = RequestMethod.POST,produces = "application/json")
    public @ResponseBody Account save(@RequestBody Account account){
        accountService.create(account);
        return  account;
    }

}
