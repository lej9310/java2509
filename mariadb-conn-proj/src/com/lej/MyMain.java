package com.lej;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyMain {

	public static void main(String[] args) {

		// DB 접속 정보
		String host = "localhost"; // 또는 DB 서버 IP
		int port = 3306; // MariaDB 기본 포트
		String database = "employees"; // 실제 DB명으로 변경
		String user = "root";
		String password = "2356";

		// JDBC URL (문자셋/타임존 옵션은 환경에 맞게 조정)
		// String url = "jdbc:mariadb://localhost:3306/employees";
		String url = String.format(
				"jdbc:mariadb://%s:%d/%s?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Seoul", host, port,
				database);

		try {
			// 드라이버 로드 (신규 드라이버는 생략 가능하나 호환성 위해 명시)
			Class.forName("org.mariadb.jdbc.Driver");

			// try-with-resources로 자원 자동 해제
			try (Connection conn = DriverManager.getConnection(url, user, password)) {
				System.out.println("MariaDB 연결 성공!");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("DB 연결 실패: " + e.getMessage());
		}
	}

}
