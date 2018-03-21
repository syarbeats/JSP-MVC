package com.cdc.mitrais.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cdc.mitrais.model.Customer;
import com.cdc.mitrais.service.CustomerLookupService;
import com.cdc.mitrais.service.CustomerSimpleMap;


/**
 * Servlet implementation class ShowBalance
 */

@WebServlet("/show-balance")
public class ShowBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger logger = LoggerFactory.getLogger(ShowBalance.class);
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowBalance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("customerId");
		logger.debug("Customer Id:"+customerId);
	    CustomerLookupService service = new CustomerSimpleMap();
	    Customer customer = service.findCustomer(customerId);  // OK to pass null or empty String to findCustomer
	    
	    request.setAttribute("customer", customer);
	    String address;
	    
	    if (customer == null) {
	    	request.setAttribute("badId", customerId);
	    	address = "/WEB-INF/result/unknown-customer.jsp";
	    } else if (customer.getBalance() < 0) {
	    	address = "/WEB-INF/result/negative-balance.jsp";
	    } else if (customer.getBalance() < 10000) {
	    	address = "/WEB-INF/result/normal-balance.jsp";
	    } else {
	    	address = "/WEB-INF/result/high-balance.jsp";
	    }
	    
	    logger.debug("on doGet - Customer Name:"+customer.getFirstName());
	    
	    RequestDispatcher dispatcher =
	    request.getRequestDispatcher(address);
	    dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
