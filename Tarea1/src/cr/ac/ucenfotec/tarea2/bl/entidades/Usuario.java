
package cr.ac.ucenfotec.tarea2.bl.entidades;

/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
public class Usuario {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private String rol;
    private String estado;
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return this.cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getRol() {
        return this.rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Usuario: [Nombre completo: " +this.nombre + ", cédula: "+ this.cedula + ", teléfono: "+ this.telefono + ", dirección: " + this.direccion + ", rol: " + this.rol + ", estado: " + this.estado + "]";
    } 
    
    public Usuario(String nombre,String cedula , String telefono, String direccion, String rol, String estado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rol = rol;
        this.estado = estado;
    }
    public Usuario() { }
}
