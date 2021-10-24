package db;

import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 

import com.pegaxchange.java.web.model.good;

public class access { 
	
    public ArrayList<good> getgood(Connection con) throws SQLException { 
        ArrayList<good> goodlist = new ArrayList<good>(); 
        PreparedStatement stmt = con.prepareStatement("SELECT * FROM db.good"); 
        ResultSet rs = stmt.executeQuery(); 
        try { 
         while(rs.next()) { 
          good goodobj = new good(); 
          goodobj.setid(rs.getInt("good_id")); 
          goodobj.setnums(rs.getInt("good_nums"));
          goodobj.setprice(rs.getInt("good_price"));
          goodobj.settype(rs.getString("good_type")); 
          goodobj.setdepartment(rs.getString("good_department")); 
          goodobj.setname(rs.getString("good_name")); 
          goodlist.add(goodobj); 
         } 
        } catch (SQLException e) { 
           e.printStackTrace(); 
     } 
    return goodlist; 
   } 
} 