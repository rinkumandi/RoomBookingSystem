package com.mandi.rbs.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mandi.rbs.dto.UserDetails;
import com.mandi.rbs.formBeans.LoginUser;
import com.mandi.rbs.services.LoginService;

@Controller
public class HomeController {
    
    private static final Logger logger = Logger.getLogger(HomeController.class);
    
    @Autowired
    private LoginService loginServiceImpl;

    @RequestMapping("/")
    public String showHome(@ModelAttribute("loginUser") LoginUser loginUser) {
        return "home";
    }

    @RequestMapping("/login")
    public String login(@ModelAttribute("loginUser") LoginUser loginUser, Model model) {
        UserDetails userDetails = loginServiceImpl.getUserById(loginUser.getUserId());
        
        logger.info(userDetails);
                
        if (userDetails != null) {
            if(loginUser.getPassword().equals(userDetails.getPassword())){
                model.addAttribute(userDetails);
                return "welcome";
            }else{
                model.addAttribute("DID_NOT_MATCH", "Given userId and password didn't match..");
                return "home";
            }
           
        } else {
            model.addAttribute("NOTFOUND", "User Not Found..");
            return "home";
        }
    }

}
