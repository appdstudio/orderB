package com.rms.orderB.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class MenuItemDTO {

	private Short displayOrder;

	private Integer menuID;

	private String quantity;	

	private Double rate;
	
	@NotEmpty(message="Menu Item name cannot be blank!")
	@Size(max=50)
	private String displayName;

	private Boolean isActive = Boolean.valueOf(true);


	public Short getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}
	public Integer getMenuID() {
		return menuID;
	}

	public void setMenuID(Integer menuID) {
		this.menuID = menuID;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
}
