package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SelectTbl {

	 public static void selectTbl(String tableName) {
		String sql = "SELECT * FROM " + tableName;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("\n============ Select " + tableName + " 테이블 ============");

			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rs.getMetaData().getColumnCount();

			// 컬럼명 출력
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnLabel(i) + "\t");
			}
			System.out.println();
			// 데이터 출력
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			System.out.println("================================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}
}
