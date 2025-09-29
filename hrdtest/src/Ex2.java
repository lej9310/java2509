package hrdtest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Ex2 {
	public Ex2() {
		// ex1. 2020년 이후 츨판된 도서 검색
		selectTbl("Book", "*");
		
	}	
	
	// ex2. select table ==========================================
	private void selectTbl(String TblName, String cols) {
		String selectTblSql = "SELECT" + cols + " FROM `" + TblName + "`";

		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(selectTblSql);
				ResultSet rs = pstmt.executeQuery();
				) {		
			System.out.println("\n============ select" + TblName + "  테이블 ============");

			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

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
			System.out.println("====================================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
