package com.atm.system.dto;

public class DepositDto {
	
	private Long accNo;
	private Double depositAmt;
	public DepositDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepositDto(Long accNo, Double depositAmt) {
		super();
		this.accNo = accNo;
		this.depositAmt = depositAmt;
	}
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public Double getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(Double depositAmt) {
		this.depositAmt = depositAmt;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DepositDto [accNo=");
		builder.append(accNo);
		builder.append(", depositAmt=");
		builder.append(depositAmt);
		builder.append("]");
		return builder.toString();
	}
	
	

}
