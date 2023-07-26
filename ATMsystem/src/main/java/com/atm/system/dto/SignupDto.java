package com.atm.system.dto;

public class SignupDto {
	
	private Long id;

	private Long accNo;
	private String name;
	private String fatherName;
	private String email;
	private String address;
	private String pin;
	private String dob;
	private Double balance=0.0;
	public SignupDto(Long id, Long accNo, String name, String fatherName,
			String email, String address, String pin, String dob,
			Double balance) {
		super();
		this.id = id;
		this.accNo = accNo;
		this.name = name;
		this.fatherName = fatherName;
		this.email = email;
		this.address = address;
		this.pin = pin;
		this.dob = dob;
		this.balance = balance;
	}
	public SignupDto() {
		super();
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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
		builder.append("SignupDto [id=");
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
	
	
	
	