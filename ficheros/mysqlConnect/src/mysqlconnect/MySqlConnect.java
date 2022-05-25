
package mysqlconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kelvin
 */
public class MySqlConnect {
    public static void main(String[] args) {
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/Juego";
        
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error en la conexion: " +ex);
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement();
//            stmt.executeUpdate("");

            rs = stmt.executeQuery("SELECT * FROM personaje");
            rs.next();
            while (rs.next()) {
                System.out.println("id: " +rs.getString("id")+ " Nombre: "
                        +rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.out.println("err en la conexion: " +ex);
        }
        
        
    }
    
}
