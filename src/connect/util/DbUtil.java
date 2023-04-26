/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Driver;
import model.Shipment;
import model.ShipmentDirectory;
import model.UserDirectory;
import model.User;

/**
 *
 * @author yulon
 */
public class DbUtil {
    
    private String dbUrl = "jdbc:mysql://localhost:3306/new_database";
    private String dbUserName = "root";
    private String dbPassword = "Bran@123";
    private String jdbcName = "com.mysql.jdbc.Driver";
    
    Connection conn = null;
    ResultSet rs = null;
    Statement st;
        
    private static volatile DbUtil instance = null;

    private DbUtil() {
        getConnection();
        try {
            importDataToUserDir();
            importShipmentDataToDir();
        } catch (SQLException ex) {
            Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static DbUtil getInstance(){
        if(instance == null){
            synchronized(DbUtil.class){
                if(instance == null){
                    instance = new DbUtil();
                }
            }
        }
        return instance;
    }

    public Connection getConnection(){
        try{
            int log = 1;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_database", "root", "Bran@123");
            st = (Statement) conn.createStatement();
            System.out.println("connection succeed!");
        }catch(SQLException ex){
            System.out.println("connection failed");
        }
        return this.conn;
    }
    
    public ResultSet getRS(String query) throws SQLException{
        st = (Statement) conn.createStatement();
        rs = st.executeQuery(query);
        return rs;
    }
    
    public void importDataToUserDir() throws SQLException{
        rs = st.executeQuery("select * from t_user");
        while(rs.next()){
            //username and password comparison
            if(rs.getString(4).equals("driver")){
                Driver u = new Driver();
                u.setId(Integer.parseInt(rs.getString(1)));
                u.setUserName(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setType(rs.getString(4));
                u.setName(rs.getString(5));
                u.setAddress(rs.getString(6));
                u.setLocation(rs.getString(7));
                u.setLicensePlate(rs.getString(8));
                UserDirectory.getInstance().addUser(u);
                
            }else{
                User u = new User();
                u.setId(rs.getInt(1));
                u.setUserName(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setType(rs.getString(4));
                u.setName(rs.getString(5));
                u.setAddress(rs.getString(6));
                UserDirectory.getInstance().addUser(u);
            }
        }
        
        
        System.out.println("users info imported" + ": " + UserDirectory.getInstance().getUsers().size());
    }
    
    public void importShipmentDataToDir() throws SQLException{
        rs = st.executeQuery("select * from t_shipment");
        while(rs.next()){
            Shipment s = new Shipment();
            s.setTrackingNum(rs.getInt(1));
            s.setDesAddress(rs.getString(2));
            s.setStartAddress(rs.getString(3));
            s.setDriverID(rs.getInt(4));
            ShipmentDirectory.getInstance().addShipment(s);
        }
        System.out.println("shipments info imported" + ": " + ShipmentDirectory.getInstance().getShipment().size());
    }
}
