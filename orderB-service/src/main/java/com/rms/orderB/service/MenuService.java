package com.rms.orderB.service;

import java.util.List;

import com.rms.orderB.dto.MenuDTO;

public interface MenuService {
	
	List<MenuDTO> getMenu();
	void saveMenu(MenuDTO menuDTO);
	
}
