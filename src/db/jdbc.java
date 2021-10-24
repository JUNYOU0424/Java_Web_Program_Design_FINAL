package db; 
import java.sql.Connection; 
import java.sql.DriverManager; 

public class jdbc { 
    public Connection getConnection() throws Exception { 
     try { 
      String connectionURL = 
     "jdbc:mysql://localhost:3306/?&useSSL=false&serverTimezone=Asia/Shanghai"; 
     Connection connection = null; 
     Class.forName("com.mysql.cj.jdbc.Driver"); 
     connection = DriverManager.getConnection(connectionURL, "root", "edc880424"); 
     return connection; 
     } catch (Exception e) { 
      throw e; 
     } 
} 
} 