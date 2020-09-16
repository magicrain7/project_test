package com.dev.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dev.common.ConnectionManager;

public class DesignerDAO {
	// 전역변수, 모든 메서드에서 공통으로 사용되는 변수
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs = null; // 초기화

	// 싱글톤
	static DesignerDAO instance;

	public static DesignerDAO getInstance() {
		if (instance == null)
			instance = new DesignerDAO();
		return instance;
	}

	// 전체조회
	public ArrayList<DesignerVO> selectAll() {
		DesignerVO resultVO = null;
		ResultSet rs = null; // 초기화
		ArrayList<DesignerVO> list = new ArrayList<DesignerVO>();
		try {
			conn = ConnectionManager.getConnnect();
			String sql = " SELECT * FROM DESIGNER ORDER BY ID ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				resultVO = new DesignerVO();
				resultVO.setId(rs.getString(1));
				resultVO.setPhone(rs.getString(2));
				resultVO.setEmail(rs.getString(3));
				resultVO.setPw(rs.getString(4));
				resultVO.setHoliday(rs.getString(5));
				resultVO.setWorkstart(rs.getString(6));
				resultVO.setWorkend(rs.getString(7));
				list.add(resultVO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(rs, pstmt, conn);
		}
		return list;

	}

	public DesignerVO selectOne(DesignerVO designerVO) {
		DesignerVO resultVO = null;

		try {
			conn = ConnectionManager.getConnnect();
			String sql = " SELECT * FROM Designer WHERE ID= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, designerVO.getId());
			rs = pstmt.executeQuery();
			if (rs.next()) { // 처음 커서 위치는 BOF
				resultVO = new DesignerVO();
				resultVO.setId(rs.getString(1));
				resultVO.setPhone(rs.getString(2));
				resultVO.setEmail(rs.getString(3));
				resultVO.setPw(rs.getString(4));
				resultVO.setHoliday(rs.getString(5));
				resultVO.setWorkstart(rs.getString(6));
				resultVO.setWorkend(rs.getString(7));

			} else {
				System.out.println("no data");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(rs, pstmt, conn);
		}
		return resultVO;

	}

	// insert
	public int insert(DesignerVO designerVO) {
		conn = ConnectionManager.getConnnect();
		String sql = "INSERT INTO DESIGNER ( ID, PHONE, EMAIL, PW, HOLIDAY, WORKSTART, WORKEND )"
				+ " VALUES( ?, ?, ?, ?, ?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, designerVO.getId());
			pstmt.setString(2, designerVO.getPhone());
			pstmt.setString(3, designerVO.getEmail());
			pstmt.setString(4, designerVO.getPw());
			pstmt.setString(5, designerVO.getHoliday());
			pstmt.setString(6, designerVO.getWorkstart());
			pstmt.setString(7, designerVO.getWorkend());
			int r = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			ConnectionManager.close(conn);
		}
		return 0;

	}

	public int delete(DesignerVO designerVO) {
		int r = 0;
		try {
			conn = ConnectionManager.getConnnect();
			String sql = "DELETE FROM DESIGNER WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, designerVO.getId());
			r = pstmt.executeUpdate();
			System.out.println(r + " 건이 삭제됨");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ConnectionManager.close(null, pstmt, conn);
		}
		return r;
	}
}
