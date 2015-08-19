package com.rms.orderB.core.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id  @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer primaryKey;
	
	@Column(length = 50, nullable=false)
	private String menuName;
	
	
	private Short displayOrder;
	
	@Column(nullable=false)
	private boolean isActive = Boolean.valueOf(true);
	
	public Integer getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getMenuName()+" || "+getDisplayOrder();
	}
	
	
}
