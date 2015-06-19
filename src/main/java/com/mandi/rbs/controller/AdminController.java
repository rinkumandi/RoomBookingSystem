package com.mandi.rbs.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mandi.rbs.dto.UserDetails;
import com.mandi.rbs.formBeans.LoginUser;
import com.mandi.rbs.services.LoginService;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

	@Autowired
	private LoginService loginServiceImpl;

	private static final Logger logger = Logger
			.getLogger(AdminController.class);

	@RequestMapping("/login")
	public String login(@ModelAttribute("loginUser") LoginUser loginUser) {
		return "adminLogin";
	}

	@RequestMapping("/home")
	public String login(
			@ModelAttribute("loginUser") @Valid LoginUser loginUser,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "adminLogin";
		}

		UserDetails userDetails = loginServiceImpl.getUserById(loginUser
				.getUserId());

		logger.info(userDetails);

		if (userDetails != null) {
			if (loginUser.getPassword().equals(userDetails.getPassword())) {
				model.addAttribute(userDetails);
				return "adminHome";
			} else {
				model.addAttribute("DID_NOT_MATCH",
						"Given userId and password didn't match..");
				return "adminLogin";
			}

		} else {
			model.addAttribute("NOTFOUND", "User Not Found..");
			return "adminLogin";
		}
	}

}
