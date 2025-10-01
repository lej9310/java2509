package book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class TableCreator {

	private static final Map<String, String> TABLE_DEFINITIONS = new HashMap<>();

	static {
		TABLE_DEFINITIONS.put("Book", "CREATE TABLE Book (\r\n" + "	BookID INT NOT NULL PRIMARY KEY,\r\n"
				+ "	Title VARCHAR(50) NOT NULL,\r\n" + "	Author VARCHAR(50),\r\n" + "	Publisher VARCHAR(50),\r\n"
				+ "	Price INT,\r\n" + "	CHECK (Price >= 0),\r\n" + "	PubYear YEAR	\r\n" + ");");

		TABLE_DEFINITIONS.put("Member",
				"CREATE TABLE Member (\r\n" + "	MemberID INT NOT NULL PRIMARY KEY,	\r\n"
						+ "	Name VARCHAR(50) NOT NULL,\r\n" + "	Phone VARCHAR(20),\r\n" + "	Address VARCHAR(100)\r\n"
						+ ");\r\n" + "");

		TABLE_DEFINITIONS.put("Rental",
				"CREATE TABLE Rental (\r\n" + "	RentalID INT NOT NULL PRIMARY KEY,\r\n" + "	MemberID INT,\r\n"
						+ "	BookID INT,\r\n" + "	RentDate DATE,\r\n" + "	ReturnDate DATE NULL,\r\n"
						+ "	FOREIGN KEY (MemberID)\r\n" + "		REFERENCES member (MemberID),\r\n"
						+ "	FOREIGN KEY (BookID)\r\n" + "		REFERENCES book (BookID)\r\n" + ");");
	}

//	public TableCreator() {
//		createTable("Book");
//		createTable("Member");
//		createTable("Rental");
//	}

	// Table creation method
	public static void createTable(String tableName) {
		String tableCheckSql = "SELECT COUNT(*) FROM information_schema.TABLES WHERE TABLE_SCHEMA = DATABASE() AND TABLE_NAME = '"
				+ tableName + "'";
		String createTblSql = TABLE_DEFINITIONS.get(tableName);
		if (createTblSql == null) {
			System.out.println("테이블 정의와 일치하지 않는 이름입니다: " + tableName);
			return;
		}

		Connection conn = null;
		Statement stmt = null;

		try {
			// 데이터베이스 연결
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();

			// 테이블 존재 여부 확인
			ResultSet rs = stmt.executeQuery(tableCheckSql);
			rs.next();
			int count = rs.getInt(1);

			System.out.println("\n============ 새로운 테이블 생성 [시작] ============");			

			if (count > 0) {
				System.out.println("*** 이미 존재하는 테이블으로 작업을 중단합니다: " + tableName);
			} else {
				// 테이블이 없으면 생성
				stmt.execute(createTblSql);
				System.out.println("새로운 테이블 생성 성공: " + tableName);
			}

			System.out.println("===========================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(stmt, conn);
		}
	}
}
