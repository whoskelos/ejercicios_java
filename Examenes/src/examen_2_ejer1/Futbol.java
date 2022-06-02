package examen_2_ejer1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
            System.out.println("error: " + ex.getMessage());
        }

        try {
            con = DriverManager.getConnection(url, usuario, clave);
            stmt = con.createStatement();
            PreparedStatement sentencia = con.prepareStatement("INSERT INTO estadisticas (CodEquipo) VALUES (?)");
            String instruccionSql = "SELECT CodEquipo FROM equipos";
            rs = stmt.executeQuery(instruccionSql);
            while (rs.next()) {
                String cod = rs.getString("CodEquipo");
                sentencia.setString(1, cod);
                sentencia.executeUpdate();
//                System.out.println(cod);
            }
            rs.close();

        } catch (SQLException ex) {
            System.out.println("error en la conex: " + ex.getSQLState() + "\n" + ex.getMessage());
        }
    }

}
