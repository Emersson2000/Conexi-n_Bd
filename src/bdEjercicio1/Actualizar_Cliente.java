package bdEjercicio1;

import java.sql.Connection;
import java.sql.Statement;

public class Actualizar_Cliente {
    
    public boolean actualizarCliente(Cliente cliente, int id) {
        boolean actualizar = false;
        Connection con = null;
        Statement stm = null;

        String sql = "UPDATE persona SET cedulo = '" + cliente.getCedulo() + "', nombre = '" + cliente.getNombre() +"', apellido = '" + cliente.getApellido() + "', direccion = '" + cliente.getDireccion() +"', correo = '" + cliente.getCorreo() +"', telefono = '" + cliente.getTelefono() +"' WHERE idpersona = '" + id +"'";
        try {
            bdEjercicio1 conexion = new bdEjercicio1();
            con = conexion.Conexion_Mysql();
            stm = con.createStatement();
            stm.execute(sql);
            actualizar = true;
            stm.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Error : " + e);
            e.printStackTrace();
        }
        return actualizar;
    }
}
