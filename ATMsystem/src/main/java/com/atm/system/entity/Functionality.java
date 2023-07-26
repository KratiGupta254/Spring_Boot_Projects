package com.atm.system.entity;

import java.sql.Date;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Functions")
public class Functionality {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long accNo;
	// o = credit 1 = debit
	private boolean functionalityStatus;
	private Double amount;
	Date date = new Date(Calendar.getInstance().getTime().getTime());

	
	public Functionality(Long id, Long accNo, boolean functionalityStatus,
		Double amount, Date date) {
	super();
	this.id = id;
	this.accNo = accNo;
	this.functionalityStatus = functionalityStatus;
	this.amount = amount;
	this.date = date;
}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Functionality( Long accNo, boolean functionalityStatus,
			Double amount) {
		super();
		
		this.accNo = accNo;
		this.functionalityStatus = functionalityStatus;
		this.amount = amount;
	}
	public Functionality() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public boolean isFunctionalityStatus() {
		return functionalityStatus;
	}
	public void setFunctionalityStatus(boolean functionalityStatus) {
		this.functionalityStatus = functionalityStatus;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Functionality [id=");
		builder.append(id);
		builder.append(", accNo=");
		builder.append(accNo);
		builder.append(", functionalityStatus=");
		builder.append(functionalityStatus);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
