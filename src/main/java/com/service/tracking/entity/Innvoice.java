package com.service.tracking.entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Innvoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	int invoiceNo;
	@Column
	Date invoiceDate;
	@Column
	byte[] uploadInvoice;
	@Column
	String uploadedBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public byte[] getUploadInvoice() {
		return uploadInvoice;
	}
	public void setUploadInvoice(byte[] uploadInvoice) {
		this.uploadInvoice = uploadInvoice;
	}
	public String getUploadedBy() {
		return uploadedBy;
	}
	public void setUploadedBy(String uploadedBy) {
		this.uploadedBy = uploadedBy;
	}
	@Override
	public String toString() {
		return "Innvoice [id=" + id + ", invoiceNo=" + invoiceNo + ", invoiceDate=" + invoiceDate + ", uploadInvoice="
				+ Arrays.toString(uploadInvoice) + ", uploadedBy=" + uploadedBy + "]";
	}
  
}
