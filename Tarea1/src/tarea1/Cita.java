
package tarea1;


public class Cita {
    private String nombreMascota;
    private String fecha;
    private String horaCita;
    private String observaciones;
    
    public String getNombreMascota() {
        return this.nombreMascota;
    }
    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }
    public String getFecha() {
        return this.fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getHoraCita() {
        return this.horaCita;
    }
    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }
    public String getObservaciones() {
        return this.observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    @Override
    public String toString() {
        return "Cita: [nombre mascota: " +this.nombreMascota + ", fecha: "+ this.fecha + ", hora de la cita: "+ this.horaCita + ", obsevaciones: " + this.observaciones + "]";
    } 
    
    public Cita(String nombre,String fecha , String horaCita, String observaciones) {
        this.nombreMascota = nombreMascota;
        this.fecha = fecha;
        this.horaCita = horaCita;
        this.observaciones = observaciones;
    }
    public Cita() { }
}
