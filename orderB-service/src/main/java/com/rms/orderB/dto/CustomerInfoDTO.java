package com.rms.orderB.dto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class CustomerInfoDTO {

	@NotEmpty(message="Customer name should not be blank")
	@Size(max=50)
	private String customerName;

	@NotEmpty(message="Phone number should not be blank")
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
	@Override
	public String toString() {
		return "CustomerInfoDTO [customerName=" + customerName + ", phoneNo="
				+ phoneNo + "]";
	}


}
