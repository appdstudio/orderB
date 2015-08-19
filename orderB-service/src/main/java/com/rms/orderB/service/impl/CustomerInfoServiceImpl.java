package com.rms.orderB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rms.orderB.converter.CustomerInfoConverter;
import com.rms.orderB.core.dao.CustomerInfoDAO;
import com.rms.orderB.dto.CustomerInfoDTO;
import com.rms.orderB.service.CustomerInfoService;

@Service
public class CustomerInfoServiceImpl implements CustomerInfoService {

	@Autowired
	private CustomerInfoDAO customerInfoDAO;

	@Autowired
	private CustomerInfoConverter customerInfoConverter;

	@Override
	public List<CustomerInfoDTO> getAllCustomerInfo() {
		return customerInfoConverter.convertToCustomerInfoDTO(customerInfoDAO.getCustomerInfoList());
	}

	@Override
	public CustomerInfoDTO getCustomerInfoByPhoneNumber(String phoneNo) {
		return customerInfoConverter.convertToCustomerInfoDTO(customerInfoDAO.getCustomerByPhoneNo(phoneNo));
	}

	@Override
	@Transactional
	public void saveCustomerInfo(CustomerInfoDTO customerInfoDTO) {
		customerInfoDAO.saveCustomerInfo(customerInfoConverter.convertToCustomerInfo(customerInfoDTO));

	}

}
