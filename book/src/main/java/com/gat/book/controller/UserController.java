package com.gat.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping(value = "/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>("test", HttpStatus.OK);
	}

}
