package com.lej.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.lej.conn.DBConnection;

public class CRUDClass {

	public CRUDClass() {

		// Ex1. Create Table =================
		// createTable();

		// Ex2. Show Databases ===============
		// showDBs();

		// Ex3. Insert Row into Table ==========
		// insertUsers("1", "홍길동");
		// insertUsers("2", "일지매");
		// insertUsers("3", "세종대왕");
		// insertUsers("4", "장영실");

		// Ex4. Select Table(Users) ============
		selectUsers();

		// Ex5. Delete Table Row ==============
		// deleteUsers("3");
		// deleteUsers("4");

		// Ex6. Update Table =================
		// updateUsers("2", "일지매_수정후");
	}

	// Ex6. Update Table ========================================================
	private void updateUsers(String id, String name) {
		System.out.println("========= users 테이블의 레코드 수정 =========");
		String sql = "update users set name = ? where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			int rows = pstmt.executeUpdate();
			System.out.println("----- " + rows + "행이 수정됨");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
		System.out.println("=========================================");
	}

	// Ex5. Delete Table Row ====================================================
	private void deleteUsers(String id) {
		System.out.println("====== users 테이블 행 삭제 =======");
		String deleteRowsql = "delete from users where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(deleteRowsql);
			pstmt.setString(1, id);
			int rows = pstmt.executeUpdate();
			System.out.println("===== " + rows + "행 삭제 =====");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
		System.out.println("================================");
	}

	// Ex4.select Table(Users) ==================================================
	private void selectUsers() {
		String selectUsersSql = "SELECT * FROM users";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(selectUsersSql);
			rs = pstmt.executeQuery();
			System.out.println("\n============ users 테이블 확인 ============");

			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rs.getMetaData().getColumnCount();

			// 컬럼명 출력
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnLabel(i) + "\t");
			}
			System.out.println();

			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}

			System.out.println("=====================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}

	// Ex3. Insert Row into Table ==================================================
	private void insertUsers(String id, String name) {
		String sql = "insert into users(id, name) \r\n" + "values (?, ?)";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			int rows = pstmt.executeUpdate();
			System.out.println("\n======= " + rows + "행 추가 =======");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

	// Ex2. Show Databases =========================================================
	private void showDBs() {

		String showTblSql = "SHOW TABLES";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection(); // 1
			pstmt = conn.prepareStatement(showTblSql); // employee 데이터베이스 확인
			rs = pstmt.executeQuery();

			System.out.println("\n====== employees 데이터베이스의 테이블 목록 조회 ======");

			while (rs.next()) {
				// String tblName = rs.getString("tables_in_employees");
				String tblName = rs.getString(1);
				System.out.println("[TABLE] " + tblName);
			}
			System.out.println("============================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt);
		}
	}

	// Ex1. Create Table ===================================================
	private void createTable() {
		String tableCheckSql = "SELECT COUNT(*) FROM information_schema.TABLES WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = 'users'";
		String createSql = "CREATE TABLE IF NOT EXISTS users(\r\n" + "	id varchar(50),\r\n"
				+ "	name varchar(100)\r\n" + ")";
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();

			// 테이블 존재 여부 확인
			ResultSet rs = stmt.executeQuery(tableCheckSql);
			rs.next();
			int count = rs.getInt(1);
			String str;
			System.out.println("\n============ 새로운 테이블 생성 시작 ============");
			if (count > 0) {
				str = "Already esixts: TABLE users";
			} else {
				// 없으면 생성
				stmt.execute(createSql);
				str = "Created new: TABLE users";
			}
			System.out.println(str);
			System.out.println("============ 새로운 테이블 생성 끝 =============\n");

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBConnection.close(stmt, conn);
		}
	}

}
