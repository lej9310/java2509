package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Selector {

	// 동적 쿼리 생성
	public static void select(String selectCol, String tableName, String condition) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 1. Connection 생성
			conn = DBConnection.getConnection();

			// 2. 쿼리 생성
			StringBuilder sqlBuilder = new StringBuilder("SELECT ");
			sqlBuilder.append(selectCol);
			sqlBuilder.append(" FROM ");
			sqlBuilder.append(tableName);

			if (condition != null && !condition.trim().isEmpty()) {
				sqlBuilder.append(" WHERE ");
				sqlBuilder.append(condition);
			}

			String sql = sqlBuilder.toString();
			System.out.println("\n====================================\nExecute Query:\n" + sql);

			// 3. PreparedStatement 생성 및 쿼리 실행
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			// 콘솔에 조회 결과를 출력 >> 헬퍼 메서드
			printResultSet(rs);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}

	// 모든 열(*)을 조회하는 메서드
	public static void selectFromTable(String tableName) {
		select("*", tableName, null);
	}

	// 헬퍼 메서드: ResultSet 내용을 콘솔에 출력
	private static void printResultSet(ResultSet rs) {
		try {
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();

			System.out.println("\n=============== Select 테이블 [시작] ===============");
			// 컬럼명 표시
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnLabel(i) + "\t");
			}
			System.out.println();
			// 데이터 표시
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			System.out.println("==============================================\n");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
