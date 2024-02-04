package com.neosoft.controller;

import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyControllerAdvice {

	@ExceptionHandler(MissingRequestHeaderException.class)
	public String getErrorMessage(MissingRequestHeaderException ex) {
		return ex.getMessage();
	}
}
