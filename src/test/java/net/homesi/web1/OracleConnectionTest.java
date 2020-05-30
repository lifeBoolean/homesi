package net.homesi.web1;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
	private static final String USER = "scott";
	private static final String PWD = "tiger";
	
	private Logger log = LoggerFactory.getLogger(OracleConnectionTest.class);
	
	@Test
	public void testConnection() throws ClassNotFoundException {
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PWD)) {
			System.out.println("conn++++++++++++++:"+conn);
			log.info("Connection=============== : "+conn);
		} catch (Exception e) {
			System.out.println("+++++++++++++++++++ error");
			e.printStackTrace();
		}
	}	

}
