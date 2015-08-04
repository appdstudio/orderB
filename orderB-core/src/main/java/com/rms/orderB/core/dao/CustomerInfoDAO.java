package com.rms.orderB.core.dao;

import java.util.List;

import com.rms.orderB.core.entity.CustomerInfo;

public interface CustomerInfoDAO {

	CustomerInfo getCustomerByPhoneNo(String phoneNo);

	List<CustomerInfo> getCustomerInfoList();

	void saveCustomerInfo(CustomerInfo customerInfo);

}
