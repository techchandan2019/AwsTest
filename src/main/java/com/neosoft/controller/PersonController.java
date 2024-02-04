package com.neosoft.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.model.PersonRequest;
import com.neosoft.service.IPersonService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	private IPersonService service;	

	@PostMapping("/save")
	public ResponseEntity<String> savePerson(@RequestBody @Validated PersonRequest person){
		
		
		String res=service.savePerson(person);
		return new ResponseEntity<String>(res,HttpStatus.OK);
	}
	@GetMapping("/msg/{id}")
	public String getMessage(@PathVariable("id") Integer id) {
//		String idNumber=req.getHeader("id");
		return id+" successfully get from header " ;
	}
	
	
	
}
