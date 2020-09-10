package com.dev.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DesignerDAO {
	//전역변수, 모든 메서드에서 공통으로 사용되는 변수
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs = null; // 초기화
	
	//싱글톤
	static DesignerDAO instance;
	public static DesignerDAO getInstance() {
		if(instance == null)
			instance=new DesignerDAO();
			return instance;
	}
	
}
