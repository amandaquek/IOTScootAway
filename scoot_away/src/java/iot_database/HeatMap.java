package iot_database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HeatMap {
    private static final String RETRIEVE_COORDINATES = "SELECT latitude, longitude FROM speed_data";
    private static final String RETRIEVE_SPEEDINGCASE = "SELECT DATE(startTime), count(*) FROM speed_data group by DATE(startTime)";
    
    public static ArrayList<Coordinates> getAllCoordinates() {
        ArrayList<Coordinates> listOfCoordinates = new ArrayList<Coordinates>();
        ResultSet rs = null;
        
        try {
            /*(
            //Connect the database
            Connection conn = MySQL.getConnection();
            //Execute SQL Statement
            PreparedStatement stmt = conn.prepareStatement(RETRIEVE_USER);) {
            rs = stmt.executeQuery();*/
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoot_away","root","");  
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(RETRIEVE_COORDINATES);
            
            while(rs.next()){
                listOfCoordinates.add(new Coordinates(rs.getDouble(1), rs.getDouble(2)));
            }
            
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return listOfCoordinates;
    }
    
    public static ArrayList<SpeedingCases> getSpeedingCases(){
        ArrayList<SpeedingCases> listOfSpeedingCases = new ArrayList<SpeedingCases>();
        ResultSet rs = null;
        
        try {
            /*(
            //Connect the database
            Connection conn = MySQL.getConnection();
            //Execute SQL Statement
            PreparedStatement stmt = conn.prepareStatement(RETRIEVE_USER);) {
            rs = stmt.executeQuery();*/
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scoot_away","root","");  
            Statement stmt = con.createStatement();  
            rs = stmt.executeQuery(RETRIEVE_SPEEDINGCASE);
            
            while(rs.next()){
                listOfSpeedingCases.add(new SpeedingCases(rs.getDate(1), rs.getInt(2)));
            }
            
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        
        return listOfSpeedingCases;
    }
}
