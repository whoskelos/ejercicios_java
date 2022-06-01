
package examen_2_ejer1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kelvin
 */
public class Futbol {
    public static void main(String[] args) {
        int i = 1;
        String usuario = "root";
        String clave = "";
        String url = "jdbc:mysql://localhost:3306/Futbol";
        
        Connection con;
        Statement stmt;
        ResultSet rs;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("error: " +ex.getMessage());
        }
        
        try {
            con = DriverManager.getConnection(url,usuario,clave);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT  FROM Partidos WHERE CodLocal = " +i);
            while (rs.next()) {
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println("error en la conex: " +ex.getSQLState() +"\n"+ex.getMessage());
        }
    }
    
}
