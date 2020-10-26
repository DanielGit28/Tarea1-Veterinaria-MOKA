
package cr.ac.ucenfotec.tarea2.bl.entidades;


public class Duenno {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    
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
    
    @Override
    public String toString() {
        return "Dueño: [nombre: " +this.nombre + ", cedula: "+ this.cedula + ", teléfono: "+ this.telefono + ", dirección: " + this.direccion + "]";
    } 
    
    public Duenno(String nombre, String cedula, String telefono,String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public Duenno() { }
}
