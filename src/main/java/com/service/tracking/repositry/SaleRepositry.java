package com.service.tracking.repositry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.tracking.entity.AdminSale;

public interface SaleRepositry extends JpaRepository<AdminSale, Integer>{
  
	List<AdminSale> findByorderStatus(String status);
}
