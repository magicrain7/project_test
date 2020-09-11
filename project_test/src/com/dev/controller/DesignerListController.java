package com.dev.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.model.DesignerDAO;
import com.dev.model.DesignerVO;



public class DesignerListController implements Controller {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("디자이너 목록");
		//파라미터
		//유효성 체크
		//VO 담기
		//서비스
		List<DesignerVO> list = DesignerDAO.getInstance().selectAll();
		//결과저장
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("/shop/designerSelectAll.jsp").forward(request, response);
	}
		//페이지이동
}
