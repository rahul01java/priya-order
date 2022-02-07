package com.service.tracking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.tracking.entity.AdminSale;
import com.service.tracking.entity.Innvoice;
import com.service.tracking.entity.TechnicalTeam;
import com.service.tracking.entity.UserEntity;
import com.service.tracking.repositry.InvoiceRepositry;
import com.service.tracking.repositry.SaleRepositry;
import com.service.tracking.repositry.TechncalTeamRepositry;
import com.service.tracking.repositry.UserRepositry;

@Service
public class UserService {

	@Autowired
	UserRepositry userRepositry;
	@Autowired
	SaleRepositry saleRepositry;
	@Autowired
	TechncalTeamRepositry teamRepositry;
	@Autowired
	InvoiceRepositry invoiceRepositry;

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
	public List<AdminSale> tecnicalTeamStatusDropdown(String status) {
		List<AdminSale> findByorderStatus = saleRepositry.findByorderStatus(status);
		return findByorderStatus;
	}
	public TechnicalTeam changeStatus(TechnicalTeam team) {
		Optional<AdminSale> findById = saleRepositry.findById(team.getOrerNo()).map(o ->{
			o.setOrderStatus(team.getOrderStatus());
			return saleRepositry.save(o);
		});
		
		return teamRepositry.save(team);
	}
    public Innvoice accountTeam(Innvoice innvoice) {
    	
    	return invoiceRepositry.save(innvoice);
    }
}
