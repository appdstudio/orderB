package com.rms.orderB.core.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rms.orderB.core.dao.CustomerInfoDAO;
import com.rms.orderB.core.dao.base.AbstractDao;
import com.rms.orderB.core.entity.CustomerInfo;

@Repository
public class CustomerInfoDAOImpl extends AbstractDao<Integer, CustomerInfo> implements CustomerInfoDAO {

	@Override
	public CustomerInfo getCustomerByPhoneNo(String phoneNo) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("phoneNo", phoneNo));
		return (CustomerInfo) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CustomerInfo> getCustomerInfoList() {
		Criteria criteria = createEntityCriteria();
		return (List<CustomerInfo>) criteria.list();
	}

	@Override
	@Transactional
	public void saveCustomerInfo(CustomerInfo customerInfo) {
		persist(customerInfo);
	}

}
