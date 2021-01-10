package bdEjercicio1;

import java.sql.Connection;
import java.sql.Statement;

public class ClienteBd {

    public boolean crearCliente(Cliente cliente) {
        boolean reguistrar = false;
        Connection con = null;
        Statement stm = null;

        String sql = "INSERT INTO `cliente`.`persona` (`cedulo`, `nombre`, `apellido`, `direccion`, `correo`, `telefono`) VALUES ('" + cliente.getCedulo() + "', '" + cliente.getNombre() + "', '" + cliente.getApellido() + "', '" + cliente.getDireccion() + "', '" + cliente.getCorreo() + "', '" + cliente.getTelefono() + "')";

        try {
            bdEjercicio1 conexion = new bdEjercicio1();
            con = conexion.Conexion_Mysql();
            stm = con.createStatement();
            stm.execute(sql);
            reguistrar = true;
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return reguistrar;
    }
}
