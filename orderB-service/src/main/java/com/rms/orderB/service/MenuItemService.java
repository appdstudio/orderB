package com.rms.orderB.service;

import java.util.List;

import com.rms.orderB.dto.MenuItemDTO;

public interface MenuItemService {
	void saveMenuItems(List<MenuItemDTO> menuItemDTOs);
}
