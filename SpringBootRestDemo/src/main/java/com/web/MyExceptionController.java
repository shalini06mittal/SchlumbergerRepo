package com.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// exceptions globally
@ControllerAdvice
public class MyExceptionController {

	public MyExceptionController() {
		System.out.println("My Exception Controller");
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Object> handleException(Exception ex){
		System.out.println("Handle Exception");
		Map<String, Object> map = new HashMap<>();
		map.put("message", ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}
}
