package com.rms.orderB.core.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class CustomerInfoDTO {

	@NotNull
	@Size(max=50)
	private String customerName;
	
	@NotNull
	@Digits(integer=10, fraction=0)
	private String phoneNo;

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
}
