package com.atm.system.dto;



public class LoginDto {
	
	
	private Long accNo;
	private String pin;
	public LoginDto(Long accNo, String pin) {
		super();
		this.accNo = accNo;
		this.pin = pin;
	}
	public LoginDto() {
		super();
		
	}
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
	
	
	
	
		


}
