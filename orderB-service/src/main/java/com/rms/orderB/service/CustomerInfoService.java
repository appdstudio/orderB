package com.rms.orderB.service;

import java.util.List;

import com.rms.orderB.dto.CustomerInfoDTO;

public interface CustomerInfoService {

	List<CustomerInfoDTO> getAllCustomerInfo();

	CustomerInfoDTO getCustomerInfoByPhoneNumber(String phoneNo);

	void saveCustomerInfo(CustomerInfoDTO customerInfoDTO);

}
