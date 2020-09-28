
package tarea1;


public class Mascota {
    private String nombre;
    private String dueño;
    private String foto;
    private int ranking;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDueño() {
        return this.dueño;
    }
    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    public String getFoto() {
        return this.foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public int getRanking() {
        return this.ranking;
    }
    public void setRanking(int ranking) {
        this.ranking=ranking;
    }
    
    
    @Override
    public String toString() {
        return "Mascota: [nombre: " +this.nombre + ", dueño: "+ this.dueño + ", foto: "+ this.foto+", ranking: " + this.ranking + "]";
    } 
    
    public Mascota(String nombre, String dueño, String foto,int ranking) {
        this.nombre = nombre;
        this.dueño = dueño;
        this.foto = foto;
        this.ranking = ranking;
    }
    public Mascota() { }
}
