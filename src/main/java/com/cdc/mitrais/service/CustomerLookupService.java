package com.cdc.mitrais.service;

import com.cdc.mitrais.model.Customer;

public interface CustomerLookupService {
	public Customer findCustomer(String id);
}
