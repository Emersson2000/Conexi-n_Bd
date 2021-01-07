package bdEjercicio1;

public class Main {

    public static void main(String[] args) {
        bdEjercicio1 conectar = new bdEjercicio1();
        
        if (conectar.Conexion_Mysql()) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("Error en la conexión");
        }
    }
}
