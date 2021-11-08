package com.sudharshanit;

public class User {
    private Integer userId;
    private String userName;
    private Long mobileNumber;
    private String address;
    
    public User(Integer userId,String userName) {
    	this.userId=userId;
    	this.userName=userName;
    }

	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
}
