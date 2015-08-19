package com.rms.orderB.converter;

import org.springframework.stereotype.Component;

import com.rms.orderB.core.entity.MenuItem;
import com.rms.orderB.dto.MenuItemDTO;


@Component(value="menuItemConverter")
public class MenuItemConverter {
	public MenuItem convertToMenuItem(MenuItemDTO menuItemDTO){
		MenuItem menuItem=null;
		if(menuItemDTO!=null){
			menuItem=new MenuItem();
			menuItem.setDisplayName(menuItemDTO.getDisplayName());
			menuItem.setDisplayOrder(menuItemDTO.getDisplayOrder());
			menuItem.setIsActive(menuItemDTO.getIsActive());
			menuItem.setQuantity(menuItemDTO.getQuantity());
			menuItem.setRate(menuItemDTO.getRate());
			
		}
		return menuItem;
	}
}
