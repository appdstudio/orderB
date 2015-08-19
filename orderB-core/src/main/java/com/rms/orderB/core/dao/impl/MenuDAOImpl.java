package com.rms.orderB.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rms.orderB.core.dao.MenuDAO;
import com.rms.orderB.core.dao.base.AbstractDao;
import com.rms.orderB.core.entity.Menu;


@Repository(value="menuDAO")
public class MenuDAOImpl extends AbstractDao<Integer,Menu> implements MenuDAO{

	@Override
	public List<Menu> getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void saveMenu(Menu menu) {
		persist(menu);
	}

	@Override
	public Menu fetchMenuOnPK(Integer pk) {		
		return getByKey(pk);
	}

}
