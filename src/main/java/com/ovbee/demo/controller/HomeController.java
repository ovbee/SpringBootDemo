package com.ovbee.demo.controller;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	private static final Logger logger = LogManager.getLogger(HomeController.class);
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) {
		logger.info("----------------");
		return "home";
	}
}
