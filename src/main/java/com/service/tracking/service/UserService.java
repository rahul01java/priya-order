package com.service.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.tracking.entity.AdminSale;
import com.service.tracking.entity.UserEntity;
import com.service.tracking.repositry.SaleRepositry;
import com.service.tracking.repositry.UserRepositry;

@Service
public class UserService {

	@Autowired
	UserRepositry userRepositry;
	@Autowired
	SaleRepositry saleRepositry;

	public UserEntity saveUser(UserEntity entity) {
              
		return userRepositry.save(entity);
	}

	public AdminSale saveSales(AdminSale adminSale) {
		adminSale.setOrderStatus("Pending");
		return saleRepositry.save(adminSale);
	}

	public String existingUser(String phoneNo) {

		UserEntity findByMobileNo = userRepositry.findByMobileno(phoneNo);
		return findByMobileNo.getDepartment();
	}

}
