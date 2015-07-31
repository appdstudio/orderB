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
public class MenuItem implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum MenuQuantity {
		QUARTER,
		HALF,
		FULL;
	}

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer primaryKey;

	private Short displayOrder;

	@ManyToOne(optional=false) @JoinColumn(name="fk_menu_id", nullable=false)
	private Menu menu;

	@Column(length=10, nullable=false)
	private String quantity;

	@Column(nullable=false)
	private Double rate;

	@Column(nullable=false)
	private Boolean isActive = Boolean.valueOf(true);

	public Integer getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Short getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Short displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
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

	
}
