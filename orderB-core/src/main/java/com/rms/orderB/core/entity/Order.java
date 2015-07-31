package com.rms.orderB.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum ModeOfPayment {

		ONLINE_PAYMENT("online"),		
		CASH_PAYMENT("cash");

		private String value;

		private ModeOfPayment(String value) {
			this.value = value;
		}

		public String value() {
			return value;
		}
	}

	@Id  @GeneratedValue(strategy = GenerationType.AUTO)
	private Long primaryKey;

	@Column(nullable=false, unique=true, length=20)
	private String orderId;

	//@OneToMany @JoinColumn(referencedColumnName="primaryKey")
	//	private List<MenuItem> menuItemList;

	@ManyToOne(optional=false) @JoinColumn(name="fk_customerInfo_id", nullable=false)
	private CustomerInfo customerInfo;

	private Boolean isPaid;

	@Column(length=10)
	private String modeOfPayment;

	//@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	//private DateTime orderTime;

	public Long getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Long primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public CustomerInfo getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(CustomerInfo customerInfo) {
		this.customerInfo = customerInfo;
	}

	public Boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}		
}
