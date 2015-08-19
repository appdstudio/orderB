package com.rms.orderB.core.dao;

import java.util.List;

import com.rms.orderB.core.entity.Menu;


public interface MenuDAO {
	List<Menu> getMenu();
	void saveMenu(Menu menu);
	Menu fetchMenuOnPK(Integer pk);
}
