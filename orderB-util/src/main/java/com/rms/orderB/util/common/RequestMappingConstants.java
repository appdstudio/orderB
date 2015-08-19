package com.rms.orderB.util.common;

public final class RequestMappingConstants {

	private RequestMappingConstants() {
		throw new ExceptionInInitializerError("Can not initialise RequestMappingConstant class");
	}
	
	public static final String WS = "/ws";
	
	public static final String CREATE_CUSTOMER_INFO = "/createCustomerInfo";
	public static final String SHOW_ALL_CUSTOMER_INFO = "/showAllCustomerInfo";
	
	
	
	/*********** MENU Related Constants ********************************************************/
	public static final String CREATE_MENU = "/createMenu";
	public static final String CREATE_MENU_ITEM = "/createMenuItem";
	
	/*****************************************************************************************/
	
}
