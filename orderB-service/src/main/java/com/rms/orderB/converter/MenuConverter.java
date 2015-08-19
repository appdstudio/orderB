package com.rms.orderB.converter;

import org.springframework.stereotype.Component;

import com.rms.orderB.core.entity.Menu;
import com.rms.orderB.dto.MenuDTO;

@Component(value="menuConverter")
public class MenuConverter {
	
	public Menu convertToMenu(MenuDTO menuDTO){
		Menu menu=null;
		if(menuDTO!=null){
			menu=new Menu();
			menu.setMenuName(menuDTO.getMenuName());
			menu.setActive(menuDTO.isActive());
			menu.setDisplayOrder(menuDTO.getDisplayOrder());
			
		}
		return menu;
	}
	
	
	/*public <T>T convertToMenu(Object dtoObject,Class<T> entityClass){
		T entity=null;
		try{
			if(dtoObject!=null){
				entity=entityClass.newInstance();	
				Field[] fields=dtoObject.getClass().getFields();
				for(int i=0;i<fields.length;i++){
					Object value=new PropertyDescriptor(fields[i].getName(),dtoObject.getClass()).getReadMethod().invoke(dtoObject);
					Method method=entityClass.getDeclaredMethod("set"+fields[i].getName());
					if(method!=null)
						method.invoke(dtoObject, value);
				}			
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return entity;
	}*/

}
