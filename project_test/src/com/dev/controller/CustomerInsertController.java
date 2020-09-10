package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.model.CustomerDAO;
import com.dev.model.CustomerVO;

public class CustomerInsertController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("회원등록 ");
		//파라미터를 vo에 담기
		String c_id = request.getParameter("c_id");
		String pw = request.getParameter("pw");
		String email = request.getParameter("email");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String birth = request.getParameter("birth");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		
		CustomerVO customer = new CustomerVO();
		customer.setC_id(c_id);
		customer.setPw(pw);
		customer.setEmail(email);
		customer.setName(name);
		customer.setPhone(phone);
		customer.setBirth(birth);
		customer.setGender(gender);
		customer.setAddress(address);
		//유효성 체크
		//넘어온 값을 수정하거나 유효성 체크하는 것도 여기에서 수행.
		
		
		//서비스 처리
		int r = CustomerDAO.getInstance().insert(customer);
		//결과 저장
		request.setAttribute("cnt", r);
		//뷰페이지로 이동
	}	

}
