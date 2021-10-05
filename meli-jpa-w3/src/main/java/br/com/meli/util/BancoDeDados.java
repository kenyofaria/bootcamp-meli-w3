package br.com.meli.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

	private static Connection conn;

	public static Connection getConection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/meliw3", "postgres", "monalisa");
		return conn;
	}
}
