
package ModeloDAO;

import Config.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    public boolean login(String nom,String pass) {
        String sql = "select * from usuarios where nombreUsuario='" + nom + "' and clave='" + pass + "'";
        boolean log = false;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                log = true;
            }
        } catch (Exception e) {            
            System.out.println(e);
        }
        return log;
    }

}
