package edu.mum.eroc.controller;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.eroc.domain.Company;
import edu.mum.eroc.service.IRocService;

@Controller
public class HomeController {
private static	Logger logger=Logger.getLogger(HomeController.class);
	@Autowired 
	IRocService rocService;
@RequestMapping("/")
public String homePage(){
	return "index";
}

@RequestMapping(value="/register", method=RequestMethod.GET)
public String register(@ModelAttribute("company") Company company){
	logger.info("register the user information");
	
	return "register";
}

@RequestMapping(value="/register", method=RequestMethod.POST)
public String registerCompany(@Valid @ModelAttribute("company") Company company,Model model ){
	rocService.save(company);
	logger.info("succsessfull save the company"+" "+company.getCompanyName());
    return "success";
}
}
