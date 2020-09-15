package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.model.DesignerDAO;
import com.dev.model.DesignerVO;

public class DesignerInsertController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("insert 실행");
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String pw = request.getParameter("pw");
		String holiday= request.getParameter("holiday");
		String workstart = request.getParameter("workstart");
		String workend = request.getParameter("workend");
		
		
		DesignerVO designer = new DesignerVO();
		designer.setId(id);
		designer.setPhone(phone);
		designer.setEmail(email);
		designer.setPw(pw);
		designer.setHoliday(holiday);
		designer.setWorkstart(workstart);
		designer.setWorkend(workend);
		
		int r = DesignerDAO.getInstance().insert(designer);
		
		request.setAttribute("cnt", designer);
		request.getRequestDispatcher("/designerSelectAll.do").forward(request, response);
		//리다이렉트 ? designerSelectAll
	}

}
