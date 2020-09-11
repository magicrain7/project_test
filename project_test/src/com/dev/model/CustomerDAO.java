package com.dev.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.dev.common.ConnectionManager;


public class CustomerDAO {
	//전역변수, 모든 메서드에서 공통으로 사용되는 변수
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs = null; // 초기화
	
	//싱글톤
	static CustomerDAO instance;
	public static CustomerDAO getInstance() {
		if(instance == null)
			instance=new CustomerDAO();
			return instance;
	}
	
	//전체조회
		public ArrayList<CustomerVO> selectAll( ) {
			CustomerVO resultVO = null;
			ResultSet rs = null; // 초기화
			ArrayList<CustomerVO> list = new ArrayList<CustomerVO>();
			try {
				conn = ConnectionManager.getConnnect();
				String sql = " SELECT * FROM CUSTOMER ORDER BY ID";
				pstmt = conn.prepareStatement(sql);
				//pstmt.setInt(1,MemberVO.getDepartment_id()); sql문에 물음표 없어서 set도 필요없음.
				rs = pstmt.executeQuery(); 
				while(rs.next()) {	
					resultVO = new CustomerVO();
					resultVO.setC_id(rs.getString(1));
					resultVO.setPw(rs.getString(2));
					resultVO.setEmail(rs.getString(3));
					resultVO.setName(rs.getString(4));
					resultVO.setPhone(rs.getString(5));
					resultVO.setBirth(rs.getString(6));
					resultVO.setGender(rs.getString(7));
					resultVO.setAddress(rs.getString(8));
					list.add(resultVO);
				}
			} catch(Exception e) {
				
			} finally {
				ConnectionManager.close(rs, pstmt, conn);
			}
			return list;
			
		}
		//단건 조회
		public CustomerVO selectOne(CustomerVO customerVO) {
			CustomerVO resultVO = null;

			try {
				conn = ConnectionManager.getConnnect();
				String sql = " SELECT * FROM customer WHERE ID= ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,customerVO.getC_id());
				rs = pstmt.executeQuery(); 
				if(rs.next()) {	//처음 커서 위치는 BOF 
					resultVO = new CustomerVO();
					resultVO.setC_id(rs.getString(1));
					resultVO.setPw(rs.getString(2));
					resultVO.setEmail(rs.getString(3));
					resultVO.setName(rs.getString(4));
					resultVO.setPhone(rs.getString(5));
					resultVO.setBirth(rs.getString(6));
					resultVO.setGender(rs.getString(7));
					resultVO.setAddress(rs.getString(8));

				}else {
					System.out.println("no data");
				}
			} catch(Exception e) {
				
			} finally {
				ConnectionManager.close(rs, pstmt, conn);
			}
			return resultVO;
			
		}
		
		//insert
		public int insert(CustomerVO customerVO) {
			try {
				//1.DB연결
				conn = ConnectionManager.getConnnect();
				//2.SQL 구문 실행
				String sql = "INSERT INTO CUSTOMER(c_id , email, name, phone, birth, gender ,address)" 
							+ "VALUES (?, ?, ?, ?, sysdate , ?, ?  )";
			    pstmt = conn.prepareStatement(sql); //예외처리
				pstmt.setString(1, customerVO.getC_id());
				pstmt.setString(2, customerVO.getPw());
				pstmt.setString(3, customerVO.getEmail());
				pstmt.setString(4, customerVO.getName());
				pstmt.setString(5, customerVO.getPhone());
				pstmt.setString(6, customerVO.getBirth());
				pstmt.setString(7, customerVO.getGender());
				pstmt.setString(8, customerVO.getAddress());
				int r = pstmt.executeUpdate();
				//3.결과 처리
				System.out.println(r + " 건이 처리됨");
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				//4. 연결해제(DB에 접속 session수는 제한적 그래서 해제해야됨)
				ConnectionManager.close(conn);
				
			}
			return 0;
		}
		
}
