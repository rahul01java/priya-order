package com.service.tracking.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table
public class TechnicalTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	@Column
	Date date;
	@Column
	byte uploadReport;
	@Column
	String attendedBy;
	@Column
	String orderStatus;
	@Column
	int orerNo;
    @Column
	Date nextDueDate;

	public Date getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(Date nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	public int getOrerNo() {
		return orerNo;
	}

	public void setOrerNo(int orerNo) {
		this.orerNo = orerNo;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte getUploadReport() {
		return uploadReport;
	}

	public void setUploadReport(byte uploadReport) {
		this.uploadReport = uploadReport;
	}

	public String getAttendedBy() {
		return attendedBy;
	}

	public void setAttendedBy(String attendedBy) {
		this.attendedBy = attendedBy;
	}

	@Override
	public String toString() {
		return "TechnicalTeam [id=" + id + ", date=" + date + ", uploadReport=" + uploadReport + ", attendedBy="
				+ attendedBy + "]";
	}

}
