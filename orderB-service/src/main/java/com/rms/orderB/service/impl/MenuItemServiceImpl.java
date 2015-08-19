package com.rms.orderB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rms.orderB.converter.MenuItemConverter;
import com.rms.orderB.core.dao.MenuItemDAO;
import com.rms.orderB.core.entity.MenuItem;
import com.rms.orderB.dto.MenuItemDTO;
import com.rms.orderB.service.MenuItemService;

@Service(value="menuItemService")
public class MenuItemServiceImpl implements MenuItemService{
	
	@Autowired
	MenuItemDAO menuItemDAO;
	
	@Autowired
	MenuItemConverter menuItemConverter;
	
	@Override
	@Transactional
	public void saveMenuItems(List<MenuItemDTO> menuItemDTOs) {
		if(menuItemDTOs!=null){
			for(MenuItemDTO loopMenuItemDTO:menuItemDTOs){
				MenuItem menuItem=menuItemConverter.convertToMenuItem(loopMenuItemDTO);
				menuItemDAO.saveMenuItem(menuItem);
			}
		}
	}
}
