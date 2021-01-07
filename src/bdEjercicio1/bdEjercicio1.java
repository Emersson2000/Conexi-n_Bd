package bdEjercicio1;

import java.sql.Connection;
import java.sql.DriverManager;

public class bdEjercicio1 {
    
    private static final String nombre = "cliente";
    private static final String user = "root";
    private static final String pass = "0986358542";
    private static final String lineaBase = "jdbc:mysql://localhost:3306/" + nombre + "? useUnicode=true&use"
            + " JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private Connection con = null;

    public boolean Conexion_Mysql() {

        try {
            con = DriverManager.getConnection(lineaBase, user, pass);
            if (con != null) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return false;
    }
}
