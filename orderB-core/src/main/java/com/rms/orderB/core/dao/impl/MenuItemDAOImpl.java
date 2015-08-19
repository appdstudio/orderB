package com.rms.orderB.core.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rms.orderB.core.dao.MenuItemDAO;
import com.rms.orderB.core.dao.base.AbstractDao;
import com.rms.orderB.core.entity.MenuItem;


@Repository(value="menuItemDAO")
public class MenuItemDAOImpl extends AbstractDao<Integer,MenuItem> implements MenuItemDAO {

	@Override
	@Transactional
	public void saveMenuItem(MenuItem menuItem) {
		persist(menuItem);
	}

}
