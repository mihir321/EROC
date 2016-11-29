package edu.mum.eroc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.eroc.service.IRocService;

@RestController
public class RocController {

	private static final String DEFULT_STATUS="NO";
	@Autowired
	IRocService rocService;
	@ResponseBody
	@ResponseStatus(value=HttpStatus.OK)
	@RequestMapping(value="/api/numbers/{rocnumber}", method=RequestMethod.GET)
	public String rocCheckNumber(@PathVariable("rocnumber") String rocNumber){
		String status=DEFULT_STATUS;
		if(rocNumber!=null&&rocNumber.length()>0)
		{
			 status=rocService.checkRocNumber(rocNumber);
		}
		
		return status;
	}
}

