package com.dev.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.model.CustomerDAO;
import com.dev.model.CustomerVO;

public class CustomerListController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<CustomerVO> list = CustomerDAO.getInstance().selectAll();
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("").forward(request, response);
		
	}

}
