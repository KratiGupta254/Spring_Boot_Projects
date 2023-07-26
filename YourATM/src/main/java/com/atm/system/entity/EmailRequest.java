package com.atm.system.entity;

public class EmailRequest {
	
	private String to;
	private String subject="Successful Registration!";
	private String body="Hello User, You are successfully registered in YourATM service.We hope that you enjoy all the facilities provided by YourATM";
	public EmailRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmailRequest(String to, String subject, String body) {
		super();
		this.to = to;
		this.subject = subject;
		this.body = body;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmailRequest [to=");
		builder.append(to);
		builder.append(", subject=");
		builder.append(subject);
		builder.append(", body=");
		builder.append(body);
		builder.append("]");
		return builder.toString();
	}
	
	

}
