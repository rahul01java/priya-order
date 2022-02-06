package com.service.tracking.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.tracking.entity.AdminSale;

public interface SaleRepositry extends JpaRepository<AdminSale, Integer>{

}
