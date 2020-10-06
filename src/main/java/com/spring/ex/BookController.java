package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {

	@RequestMapping(value="input", method=RequestMethod.GET)
	public String input() {
		return "input";
	}
	
	@RequestMapping(value ="inputProc" , method = RequestMethod.POST)  
	public String inputProc(@Valid BookDTO bdto, BindingResult result) {
		
		System.out.println(bdto.getTitle());
		System.out.println(bdto.getAuthor());
		
		String page = "resultView";
		System.out.println(result.hasErrors());   

		if(result.hasErrors()) {
			page = "input";
		}
		
		return page;
	}
	
}
