package com.cdc.mitrais.service;

import com.cdc.mitrais.model.NumberBean;

public class RanUtils {
	
	public static NumberBean randomNum(String rangeString) {
		
		double range;
		
		try {
			range = Double.parseDouble(rangeString);
		}catch(Exception e) {
			range = 10.0;
		}
		
		return (new NumberBean(Math.random() * range));
	}
}
