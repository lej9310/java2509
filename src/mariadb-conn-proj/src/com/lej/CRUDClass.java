package com.lej;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CRUDClass {

	public CRUDClass() {
		// Create Table
		createTable();
		
		// Read Table
		selectTable();		
		
		// Update Table
		// updateTable();
		
		// Delete Table Row
		// deleteUsers();
		
		// insert Table Row
		// insertUsers();
	}

	private void insertUsers() {
		// TODO Auto-generated method stub
		
	}

	private void deleteUsers() {
		// TODO Auto-generated method stub
		
	}

	private void updateTable() {
		// TODO Auto-generated method stub
		
	}

	private void selectTable() {
		String sql = "show tables";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("===== employees 데이터베이스의 테이블 확인 =====");
			
			while(rs.next()) {
				String tblName = rs.getString("tables_in_employees");
				String tblName2 = rs.getString(1);
				System.out.println("[" + tblName + "]");
			}
			System.out.println("=================");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void createTable() {
		
		String sql = "create table if not exists users(\r\n"
				+ "	id varchar(50),\r\n"
				+ "	name varchar(100)\r\n"
				+ ")";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			stmt.execute(sql);
			System.out.println("users 테이블 생성 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(stmt, conn);
		}

		
	}
}
