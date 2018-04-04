package com.gat.book.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gat.book.response.GatResponse;
import com.gat.book.vo.UserLoginVO;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping(value = "/login")
	public ResponseEntity<GatResponse<String>> login(@RequestBody UserLoginVO vo) {
		GatResponse<String> respone = new GatResponse<String>();
		System.out.println(vo.getEmail());
		
		respone.setData("test");
		return new ResponseEntity<GatResponse<String>>(respone, HttpStatus.OK);
	}

}
