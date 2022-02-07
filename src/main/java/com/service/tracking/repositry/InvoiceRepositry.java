package com.service.tracking.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.tracking.entity.Innvoice;

public interface InvoiceRepositry extends JpaRepository<Innvoice, Integer> {

}
