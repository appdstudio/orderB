package com.rms.orderB;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rms.orderB.dto.CustomerInfoDTO;
import com.rms.orderB.service.CustomerInfoService;
import com.rms.orderB.util.common.RequestMappingConstants;
import com.rms.orderB.util.helper.HPRequest;


@RestController
@RequestMapping(value=RequestMappingConstants.WS)
public class CustomerWSController {

	@Autowired
	private CustomerInfoService customerInfoService;
	
	@RequestMapping(value = RequestMappingConstants.SHOW_ALL_CUSTOMER_INFO)
	public List<CustomerInfoDTO> getAllCustomerInfo() {
		return customerInfoService.getAllCustomerInfo();
	}

	@RequestMapping(value = RequestMappingConstants.CREATE_CUSTOMER_INFO, method=RequestMethod.POST)
	public void createCustomerInfo(@Valid @RequestBody HPRequest<CustomerInfoDTO> request) {
		customerInfoService.saveCustomerInfo(request.getRequestDTO());
	}
}
