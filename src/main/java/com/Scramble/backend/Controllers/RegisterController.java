package com.Scramble.backend.Controllers;

import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.sun.istack.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.Scramble.backend.Entities.Account;
import com.Scramble.backend.Services.EmailService;
import com.Scramble.backend.Services.AccountService
import com.nulabinc.zxcvbn.Strength;
import com.nulabinc.zxcvbn.Zxcvbn;

@Controller
public class RegisterController {

    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private AccountService accountService;
    private EmailService emailService;
    private Object ModelAndView;

    @Autowired
    public RegisterController(BCryptPasswordEncoder bCryptPasswordEncoder, AccountService accountService, EmailService emailService){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.accountService = accountService;
        this.emailService = emailService;
    }

    // return register form Template
    @RequestMapping(value="/register", method = RequestMethod.GET)
    public ModelAndView showRegistrationPage(ModelAndView modelAndView, Account account){
        showRegistrationPage().addObject("account", account);
        ModelAndView.setViewName("register");
        return (org.springframework.web.servlet.ModelAndView) ModelAndView;
    }

    //Input data from Form

}
