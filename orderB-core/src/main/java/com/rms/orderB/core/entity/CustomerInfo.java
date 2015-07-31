package com.rms.orderB.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id  @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer primaryKey;
	
	@Column(length = 50, nullable=false)
	private String customerName;
	
	@Column(length = 10, nullable=false, unique=true)
	private String phoneNo;

	public Integer getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}
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
