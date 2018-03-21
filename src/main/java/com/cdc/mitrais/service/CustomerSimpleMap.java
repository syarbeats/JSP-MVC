package com.cdc.mitrais.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.mitrais.model.Customer;

public class CustomerSimpleMap implements CustomerLookupService{

	private Map<String,Customer> customers;

	private static final Logger logger = LoggerFactory.getLogger(CustomerSimpleMap.class);
	
	public CustomerSimpleMap() {
		customers = new HashMap<String,Customer>();
		addCustomer(new Customer("id001", "Harry", 
				"Hacker", -3456.78));
		addCustomer(new Customer("id002", "Codie",
				"Coder", 1234.56));
		addCustomer(new Customer("id003", "Polly",
				"Programmer", 987654.32));
		
		logger.debug("Create CustomerSimpleMap Object");
		logger.debug("Customer with id id001 is: "+customers.get("id001").getFirstName());
		
	}

	/** Finds the customer with the given ID.
	 *  Returns null if there is no match.
	 */

	public Customer findCustomer(String id) {
		if (id!=null) {
			logger.debug("Customer with id:"+id+" is: "+customers.get(id).getFirstName());
			return(customers.get(id.toLowerCase()));
		} else {
			return(null);
		}
	}

	private void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}

}
