package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.model.DesignerDAO;
import com.dev.model.DesignerVO;


public class DesignerSearchController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		
		//유효성 체크
		if(id==null||id=="") {
			request.setAttribute("error", "id없음");
			request.setAttribute("errorCode", 1);
			//search페이지로 포워드
			request.getRequestDispatcher("/shop/desigerSearch.jsp").forward(request, response);
			return;
		}
		//vo에 담기
		DesignerVO designer = new DesignerVO();
		designer.setId(id);
		
		//서비스
		designer = DesignerDAO.getInstance().selectOne(designer);
		request.setAttribute("designer", designer);
		request.getRequestDispatcher("/shop/desigerSearchOutPut.jsp").forward(request, response);
	}

}
