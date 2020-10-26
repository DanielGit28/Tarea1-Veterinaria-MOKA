
package cr.ac.ucenfotec.tarea2.bl.entidades;


public class Reservacion {
    private String nombreMascota;
    private String fechaEntrada;
    private String fechaSalida;
    
    public String getNombreMascota() {
        return this.nombreMascota;
    }
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getFechaEntrada() {
        return this.fechaEntrada;
    }
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public String getFechaSalida() {
        return this.fechaSalida;
    }
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
    @Override
    public String toString() {
        return "Reservación: [nombre mascota: " +this.nombreMascota + ", fecha de entrada: "+ this.fechaEntrada + ", hora salida: "+ this.fechaSalida + "]";
    } 
    
    public Reservacion(String nombreMascota,String fechaEntrada , String fechaSalida) {
        this.nombreMascota = nombreMascota;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    public Reservacion() { }
}
