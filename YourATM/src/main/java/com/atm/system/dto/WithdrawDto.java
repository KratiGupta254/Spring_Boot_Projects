package com.atm.system.dto;

public class WithdrawDto {
	
	private Long accNo;
	private Double withdrawAmt;
	public WithdrawDto(Long accNo, Double withdrawAmt) {
		super();
		this.accNo = accNo;
		this.withdrawAmt = withdrawAmt;
	}
	public WithdrawDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public Double getWithdrawAmt() {
		return withdrawAmt;
	}
	public void setWithdrawAmt(Double withdrawAmt) {
		this.withdrawAmt = withdrawAmt;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WithdrawDto [accNo=");
		builder.append(accNo);
		builder.append(", withdrawAmt=");
		builder.append(withdrawAmt);
		builder.append("]");
		return builder.toString();
	}
	
	

}
