package com.rms.orderB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rms.orderB.converter.MenuConverter;
import com.rms.orderB.core.dao.MenuDAO;
import com.rms.orderB.dto.MenuDTO;
import com.rms.orderB.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{
	
	@Autowired
	MenuConverter menuConverter;
	
	@Autowired
	MenuDAO menuDAO;
	
	

	@Override
	@Transactional
	public void saveMenu(MenuDTO menuDTO) {
		menuDAO.saveMenu(menuConverter.convertToMenu(menuDTO));
	}
	
	

	@Override
	public List<MenuDTO> getMenu() {
		return null;
	}

}
