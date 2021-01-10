package bdEjercicio1;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("7947384", "Emersson", "Romero", "Consacola", "emersson@gmail.com", "1234567890");
        ClienteBd clienteBd = new ClienteBd();
        
        if (clienteBd.crearCliente(cliente)) {
            System.out.println("Datos guardados satisfactoriamente");
        } else {
            System.out.println("Error en almacenar los datos");
        }
        //-------------------------------------------------------------------------------------------------------
       
        Cliente_Delete eliminar = new Cliente_Delete();

        if (eliminar.eliminarCliente(4)) {
            System.out.println("Cliente eliminado");
        } else {
            System.out.println("Error al eliminar el cliente");
        }
        //-------------------------------------------------------------------------------------------------------
       
        Actualizar_Cliente actualizar = new Actualizar_Cliente();

        if (actualizar.actualizarCliente(cliente, 2)) {
            System.out.println("Dato actualizado");
        } else {
            System.out.println("No se pudo actualizar el dato");
        }
    }
}
