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

		// Ex3. Insert into Row ==============
		// insertUsers("1", "홍길동");
		// insertUsers("2", "일지매");
		// insertUsers("3", "세종대왕");
		// insertUsers("4", "장영실");

		// Ex4. Select Table(Users) ==========
		// selectUsers();

		// Ex5. Delete Row ===================
		// deleteUsers("3");
		// deleteUsers("4");

		// Ex6. Update Table ================
		// updateUsers("2", "일지매_수정후");

		// Ex7. Drop Table ==================
		// dropUsers();

		// Ex8. Add Column in Table =================
		// addColUsers("city");
		// addColUsers("country");

		// Ex9. Drop Column in Table =================
		// dropColUsers("city");
		// dropColUsers("country");

		selectUsers();
	}

	// Ex9. Drop Column in Table ===================================================
	private void dropColUsers(String colName) {
		System.out.println("========= users 테이블에 열 삭제 [시작] =========");

		String checkColSql = "SHOW COLUMNS FROM users LIKE ?";
		String dropColSql = "ALTER TABLE users DROP COLUMN `" + colName + "`";

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement checkStmt = conn.prepareStatement(checkColSql);) {

			checkStmt.setString(1, colName);
			try (ResultSet rs = checkStmt.executeQuery();) {
				if (!rs.next()) { // 컬럼이 존재하지 않음
					System.out.println("users 테이블에 삭제할 열 " + colName + "이 없습니다. 작업을 중지합니다.");
					return;
				}
			}
			try (PreparedStatement dropStmt = conn.prepareStatement(dropColSql)) {
				dropStmt.executeUpdate();
				System.out.println("*** 삭제된 컬럼명: " + colName + " ***");
				System.out.println("========= users 테이블에 열 삭제 [완료] =========");
			}
		} catch (SQLException e) {
			e.printStackTrace(); // 디버깅용
		}
	}

	// Ex8. Add Column in Table ===================================================
	private void addColUsers(String colName) {
		System.out.println("========= users 테이블에 열 추가 [시작] =========");

		String checkColSql = "SHOW COLUMNS FROM users LIKE ?";
		String addColSql = "ALTER TABLE users ADD COLUMN `" + colName + "`" + " VARCHAR(50)";

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement checkStmt = conn.prepareStatement(checkColSql)) {

			checkStmt.setString(1, colName);
			try (ResultSet rs = checkStmt.executeQuery()) {
				if (rs.next()) {
					System.out.println("users 테이블에 삭제할 열 " + colName + "이 이미 존재합니다. 작업을 중지합니다.");
					return;
				}
			}
			try (PreparedStatement addStmt = conn.prepareStatement(addColSql)) {
				addStmt.executeUpdate();
				System.out.println("*** 추가된 컬럼명: " + colName + " ***");
				System.out.println("========= users 테이블에 열 추가 [완료] =========");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Ex7. Drop Table ==========================================================
	private void dropUsers() {
		System.out.println("========= users 테이블 삭제 [시작] =========");
		String dropTblSql = "DROP TABLE IF EXISTS users;";
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(dropTblSql);
			int result = pstmt.executeUpdate();

			if (result == 0) {
				System.out.println("\n*** 삭제할 users 테이블이 없습니다.***");
			} else {
				System.out.println("\n========= users 테이블 삭제 [완료] =========");
			}
		} catch (SQLException e) {
			System.out.println("users 테이블 삭제 작업이 중단되었습니다.");
			System.out.println("오류 내용: " + e.getMessage());
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

	// Ex6. Update Table ========================================================
	private void updateUsers(String id, String name) {
		System.out.println("========= users 테이블의 레코드 수정 [시작] =========");
		String updateSql = "UPDATE users SET name = ? WHERE id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(updateSql);
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			int rows = pstmt.executeUpdate();
			System.out.println("*** " + rows + "행 수정 ***");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
		System.out.println("========= users 테이블의 레코드 수정 [완료] =========");
	}

	// Ex5. Delete Table Row ====================================================
	private void deleteUsers(String id) {
		System.out.println("======== users 테이블 행 삭제 [시작] =========");
		String deleteRowsql = "delete from users where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(deleteRowsql);
			pstmt.setString(1, id);
			int rows = pstmt.executeUpdate();
			System.out.println("*** users 테이블: " + rows + "행 삭제 ***");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
		System.out.println("======== users 테이블 행 삭제 [완료] =========");
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
			System.out.println("\n============ users 테이블 데이터 확인 [시작] ============");

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
			System.out.println("============ users 테이블 데이터 확인 [완료] ============\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}

	// Ex3. Insert Row into Table ==================================================
	private void insertUsers(String id, String name) {
		String sql = "insert into users(id, name) \r\n" + "values (?, ?)";
		Connection conn = null; // DB 연결
		PreparedStatement pstmt = null; // SQL문 실행 전 컴파일 >> 재사용

		try { // 기본 동작
			conn = DBConnection.getConnection(); // DB 연결
			pstmt = conn.prepareStatement(sql); // SQL 쿼리 - 컴파일
			pstmt.setString(1, id); // SQL 쿼리 - 파라미터 설정
			pstmt.setString(2, name); // SQL 쿼리 - 파라미터 설정
			int rows = pstmt.executeUpdate(); // SQL 쿼리 - 실행
			System.out.println("\n======= users 테이블: " + rows + "행 추가 [완료] =======");
		} catch (SQLException e) { // 예외 처리
			System.out.println("*** users 테이블의 행 추가 작업이 중단되었습니다. ***");
			System.out.println("오류 내용: " + e.getMessage());
		} finally { // 항상 실행
			DBConnection.close(pstmt, conn); // 객체 정리
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

			System.out.println("\n====== employees 데이터베이스의 테이블 목록 조회 [시작] ======");
			while (rs.next()) {
				// String tblName = rs.getString("tables_in_employees");
				String tblName = rs.getString(1);
				System.out.println("[TABLE] " + tblName);
			}
			System.out.println("====== employees 데이터베이스의 테이블 목록 조회 [완료] ======\n");
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
			System.out.println("\n============ 새로운 테이블 생성 [시작] ============");

			if (count > 0) {
				str = "Already esixts: TABLE users";
			} else {
				// 없으면 생성
				stmt.execute(createSql);
				str = "Created new: TABLE users";
			}
			System.out.println(str);
			System.out.println("============ 새로운 테이블 생성 [완료] =============\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(stmt, conn);
		}
	}

}
