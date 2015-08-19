package com.rms.orderB.util.helper;

import java.util.Map;

public class HPRequest<T> {
	
	private T requestDTO;
	private Map<String,Object> appConstantMap;	
	
	
	public Map<String, Object> getAppConstantMap() {
		return appConstantMap;
	}

	public void setAppConstantMap(Map<String, Object> appConstantMap) {
		this.appConstantMap = appConstantMap;
	}

	public T getRequestDTO() {
		return requestDTO;
	}

	public void setRequestDTO(T requestDTO) {
		this.requestDTO = requestDTO;
	}

}
