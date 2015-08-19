package com.rms.orderB;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rms.orderB.dto.MenuItemDTO;
import com.rms.orderB.service.MenuItemService;
import com.rms.orderB.util.common.RequestMappingConstants;
import com.rms.orderB.util.helper.HPRequest;


@RestController
@RequestMapping(value=RequestMappingConstants.WS)
public class MenuItemWSController {
	
	@Autowired
	private MenuItemService menuItemService;
	
	@RequestMapping(value=RequestMappingConstants.CREATE_MENU_ITEM,method=RequestMethod.POST)
	public void createMenuItem(@RequestBody HPRequest<List<MenuItemDTO>> request){
		menuItemService.saveMenuItems(request.getRequestDTO());
	}
}
