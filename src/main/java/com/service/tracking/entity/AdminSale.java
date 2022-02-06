package com.service.tracking.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class AdminSale {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int orderNo;
	@Column
	String typeOfOrder;
	@Column
	Date orderDate;
	@Column
	Date ServiceStartDate;
	@Column
	Date serviceEndDate;
	@Column
	Date nextDueDate;
	@Column
	String orderStatus;

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getTypeOfOrder() {
		return typeOfOrder;
	}

	public void setTypeOfOrder(String typeOfOrder) {
		this.typeOfOrder = typeOfOrder;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getServiceStartDate() {
		return ServiceStartDate;
	}

	public void setServiceStartDate(Date serviceStartDate) {
		ServiceStartDate = serviceStartDate;
	}

	public Date getServiceEndDate() {
		return serviceEndDate;
	}

	public void setServiceEndDate(Date serviceEndDate) {
		this.serviceEndDate = serviceEndDate;
	}

	public Date getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(Date nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	@Override
	public String toString() {
		return "AdminSale [orderNo=" + orderNo + ", typeOfOrder=" + typeOfOrder + ", orderDate=" + orderDate
				+ ", ServiceStartDate=" + ServiceStartDate + ", serviceEndDate=" + serviceEndDate + ", nextDueDate="
				+ nextDueDate + "]";
	}

}
