package com.atm.system.dto;

public class NewPinDto {
	
	private Long accNo;
	private String pin;
	private String newPin;
	public NewPinDto(Long accNo, String pin, String newPin) {
		super();
		this.accNo = accNo;
		this.pin = pin;
		this.newPin = newPin;
	}
	public NewPinDto() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getNewPin() {
		return newPin;
	}
	public void setNewPin(String newPin) {
		this.newPin = newPin;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChangePinDto [accNo=");
		builder.append(accNo);
		builder.append(", pin=");
		builder.append(pin);
		builder.append(", newPin=");
		builder.append(newPin);
		builder.append("]");
		return builder.toString();
	}
		


}
