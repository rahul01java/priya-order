package com.service.tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.service.tracking.entity.AdminSale;
import com.service.tracking.entity.UserEntity;
import com.service.tracking.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public UserEntity saveUserDetails(@RequestBody UserEntity entity) {
		return userService.saveUser(entity);
	}

	@GetMapping("{mobile}")
	public String exixtingUser(@PathVariable("mobile") String mobileNo) {
		return userService.existingUser(mobileNo);
	}

	@PostMapping("/sales")
	public AdminSale savleSales(@RequestBody AdminSale adminSale) {
		return userService.saveSales(adminSale);
	}

}
