package com.atm.system.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "Account_Holder", uniqueConstraints = {
        @UniqueConstraint(columnNames = "accNo")})
public class AccHolder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(unique = true,length = 10)
	private Long accNo;
	private String name;
	private String fatherName;
	private String email;
	private String address;
	private String pin;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;
	private Double balance= 0.0;
	
	
		public AccHolder() {
		super();
		// TODO Auto-generated constructor stub
	}
		public AccHolder(Long id2, Long accNo2, String name2, String fatherName2,
			String address2, String email2, Double balance2, String encode,
			LocalDate dob2) {
		// TODO Auto-generated constructor stub
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccHolder [id=");
		builder.append(id);
		builder.append(", accNo=");
		builder.append(accNo);
		builder.append(", name=");
		builder.append(name);
		builder.append(", fatherName=");
		builder.append(fatherName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", address=");
		builder.append(address);
		builder.append(", pin=");
		builder.append(pin);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", balance=");
		builder.append(balance);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	

}
