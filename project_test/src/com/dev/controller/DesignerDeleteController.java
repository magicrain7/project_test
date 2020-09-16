package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.model.DesignerDAO;
import com.dev.model.DesignerVO;

public class DesignerDeleteController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		DesignerVO designer = new DesignerVO();
		designer.setId(id);
		
		int r = DesignerDAO.getInstance().delete(designer);
		request.setAttribute("cnt", r);
		
		request.getRequestDispatcher("/shop/designerDelete.jsp").forward(request, response);
		
	}

}
