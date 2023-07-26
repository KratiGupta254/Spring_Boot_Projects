package com.atm.system.dto;

public class LoginDto {
	
	
	
	public LoginDto(Long accNo, String pin) {
		super();
		this.accNo = accNo;
		this.pin = pin;
	}
	
	
	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	private Long accNo;
	private String pin;
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "LoginDto [accNo=" + accNo + ", pin=" + pin + "]";
	}
	
	


}
