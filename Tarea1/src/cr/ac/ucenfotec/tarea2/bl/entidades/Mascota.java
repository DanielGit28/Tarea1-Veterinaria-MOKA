
package cr.ac.ucenfotec.tarea2.bl.entidades;


import cr.ac.ucenfotec.tarea2.bl.entidades.Duenno;

public class Mascota {
    private String nombre;
    private Duenno duenno;
    private String foto;
    private int ranking;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Duenno getDuenno() {
        return duenno;
    }
    public void setDuenno(Duenno duenno) {
        this.duenno = duenno;
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
        return "Mascota: [nombre: " +this.nombre + ", dueño: "+ this.duenno + ", foto: "+ this.foto+", ranking: " + this.ranking + "]";
    } 
    
    public Mascota(String nombre, Duenno duenno, String foto,int ranking) {
        this.nombre = nombre;
        this.duenno = duenno;
        this.foto = foto;
        this.ranking = ranking;
    }
    public Mascota() { }

  
    
}
