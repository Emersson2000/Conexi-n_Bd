package bdEjercicio1;

public class Cliente {
    
    private int idPersona; 
    private String cedulo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;

    public Cliente( String cedulo, String nombre, String apellido, String direccion, String correo, String telefono) {
        this.cedulo = cedulo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public String getCedulo() {
        return cedulo;
    }

    public void setCedulo(String cedulo) {
        this.cedulo = cedulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
