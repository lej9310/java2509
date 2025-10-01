package hrdtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex1 {
	public Ex1() {
		// Ex1. 2020년 이후 츨판된 도서 검색
		createTable();

	}

	// Ex1. Create Table ===================================================

	private void createTable() {
		String tableCheckSql = "SELECT COUNT(*) FROM information_schema.TABLES WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = 'users'";
		String createSql = "BookID INT NOT NULL,\r\n" + "		PRIMARY KEY (BookID),          -- PK\r\n"
				+ "	Title VARCHAR(50) NOT NULL,\r\n" + "	Author VARCHAR(50),\r\n" + "	Publisher VARCHAR(50),\r\n"
				+ "	Price INT,\r\n" + "	CHECK (Price >= 0),               -- CHECK 제약조건\r\n" + "	PubYear YEAR   ";
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
