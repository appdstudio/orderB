package com.rms.orderB;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rms.orderB.common.RequestMappingConstants;
import com.rms.orderB.core.dto.CustomerInfoDTO;


@RestController
@RequestMapping(value="/ws/")
public class MenuWSController {
	
	@RequestMapping(value = RequestMappingConstants.SHOW_ALL_CUSTOMER_INFO)
	public CustomerInfoDTO getAllCustomerInfo() {
		return null;
	}

}
