package com.rms.orderB.dto;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class MenuDTO {
	
	@NotEmpty(message="Menu Name cannot be Blank")
	@Size(max=50)
	private String menuName;
	
	private Short displayOrder;
	
	private boolean isActive = Boolean.valueOf(true);
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Short getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
}
