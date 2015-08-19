package com.rms.orderB;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.orderB.dto.MenuDTO;
import com.rms.orderB.service.MenuService;
import com.rms.orderB.util.common.RequestMappingConstants;
import com.rms.orderB.util.helper.HPRequest;



@RestController
@RequestMapping(value=RequestMappingConstants.WS)
public class MenuWSController {
	
	@Autowired
	private MenuService menuService;
	
		
	@RequestMapping(value=RequestMappingConstants.CREATE_MENU)
	public void createMenu(@Valid @RequestBody HPRequest<MenuDTO> request){
		menuService.saveMenu(request.getRequestDTO());
	}
	
	
}
