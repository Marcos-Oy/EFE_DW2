
package Config;

import java.sql.*;

public class Conexion {
   private String username = "root";
    private String password = "admin";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "mvc_jsp";
    private String classname = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    private Connection con;

    public Conexion() {
        try {
            Class.forName(classname);
            this.con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.err.println("ERROR PAPU:"+e.getMessage());
        }
    }    
    public Connection getConnection(){
        return this.con;
    }
}
