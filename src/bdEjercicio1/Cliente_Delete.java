package bdEjercicio1;

import java.sql.Connection;
import java.sql.Statement;

public class Cliente_Delete {
    
    public boolean eliminarCliente(int id) {
        boolean eliminar = false;
        Connection con = null;
        Statement stm = null;

        String sql = "DELETE FROM persona WHERE idpersona = '" + id +"'";

        try {
            bdEjercicio1 conexion = new bdEjercicio1();
            con = conexion.Conexion_Mysql();
            stm = con.createStatement();
            stm.execute(sql);
            eliminar = true;
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return eliminar;
    }
}
