package com.rms.orderB.converter;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import com.rms.orderB.dto.CustomerInfoDTO;
import com.rms.orderB.core.entity.CustomerInfo;

@Component
public class CustomerInfoConverter {

	public CustomerInfo convertToCustomerInfo(CustomerInfoDTO customerInfoDTO) {
		CustomerInfo customerInfo = new CustomerInfo();
		if (customerInfoDTO != null) {
			customerInfo.setCustomerName(customerInfoDTO.getCustomerName());
			customerInfo.setPhoneNo(customerInfoDTO.getPhoneNo());
		}
		return customerInfo;
	}

	public List<CustomerInfo> convertToCustomerInfo(List<CustomerInfoDTO> customerInfoDTOList) {
		List<CustomerInfo> customerInfoList = new ArrayList<CustomerInfo>();
		if (CollectionUtils.isNotEmpty(customerInfoDTOList)) {
			for (CustomerInfoDTO customerInfoDTO : customerInfoDTOList) {
				customerInfoList.add(this.convertToCustomerInfo(customerInfoDTO));
			}
		}
		return customerInfoList;
	}

	public CustomerInfoDTO convertToCustomerInfoDTO(CustomerInfo customerInfo) {
		CustomerInfoDTO customerInfoDTO = new CustomerInfoDTO();
		if (customerInfo != null) {
			customerInfoDTO.setCustomerName(customerInfo.getCustomerName());
			customerInfoDTO.setPhoneNo(customerInfo.getPhoneNo());
		}
		return customerInfoDTO;		 
	}

	public List<CustomerInfoDTO> convertToCustomerInfoDTO(List<CustomerInfo> customerInfoList) {
		List<CustomerInfoDTO> customerInfoDTOList = new ArrayList<CustomerInfoDTO>();
		if (CollectionUtils.isNotEmpty(customerInfoList)) {
			for (CustomerInfo customerInfo : customerInfoList) {
				customerInfoDTOList.add(this.convertToCustomerInfoDTO(customerInfo));
			}
		}
		return customerInfoDTOList;
	}
}
