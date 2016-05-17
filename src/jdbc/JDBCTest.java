package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		CallableStatement cs = conn.prepareCall("");
		cs.executeQuery("efe"); //No Compiler error with string
	}
}
