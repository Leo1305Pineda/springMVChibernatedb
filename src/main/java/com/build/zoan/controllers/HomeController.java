package com.build.zoan.controllers;

import java.util.Date;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class HomeController {
	
	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping("home")
	public String home(ModelMap modelo){	
		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);
		modelo.addAttribute("now", now);
		return "home";
	}

}
