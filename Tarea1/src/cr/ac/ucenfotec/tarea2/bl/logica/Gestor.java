package cr.ac.ucenfotec.tarea2.bl.logica;

import cr.ac.ucenfotec.tarea2.bl.entidades.*;

import java.util.ArrayList;

public class Gestor {
    ArrayList<Usuario> usuarios = new ArrayList<>();
    ArrayList<Duenno> duennos = new ArrayList<>();
    ArrayList<Cita> citas = new ArrayList<>();
    ArrayList<Mascota> mascotas = new ArrayList<>();
    ArrayList<Reservacion> reservaciones = new ArrayList<>();


    /**
     *
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     * @param rol
     * @param estado
     */
    public void crearUsuario(String nombre, String cedula, String telefono,  String direccion, String rol, String estado) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario temp = usuarios.get(i);
            if(temp != null) {
                if (temp.getCedula().equals(cedula)) {
                    System.out.println("No se puede ingresar un usuario ya existente");
                return;
                }
            }
        }
        Usuario nuevo = new Usuario(nombre, cedula, telefono, direccion, rol, estado);
        usuarios.add(nuevo);
    }

    /**
     *
     * @param cedulaDuenno
     * @param nombre
     * @param foto
     * @param ranking
     */
    public void crearMascota( String cedulaDuenno, String nombre, String foto, int ranking) {
        System.out.println("Se inicializa");
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota temp = mascotas.get(i);
            if (temp != null) {
                if (temp.getNombre().equals(nombre)) {
                    System.out.println("No se puede ingresar una mascota ya existente");
                    return;
                }
            }
        }
        for (int j = 0; j < duennos.size(); j++) {
            Duenno duennoTemp = duennos.get(j);
            System.out.println("No pasa el null");
            if (duennoTemp != null) {
                System.out.println("Pasa el null");
                if (duennoTemp.getCedula().equals(cedulaDuenno)) {
                    Mascota nueva = new Mascota(nombre, duennoTemp ,foto, ranking);
                    mascotas.add(nueva);
                    return;
                }

            }
        }


    }

    /**
     *
     * @param nombre
     * @param cedula
     * @param telefono
     * @param direccion
     */
    public void crearDuenno( String nombre, String cedula, String telefono, String direccion) {
        for (int i = 0; i < duennos.size(); i++) {
            Duenno temp = duennos.get(i);
            if(temp != null) {
                if (temp.getCedula().equals(cedula)) {
                    System.out.println("No se puede ingresar un dueño ya existente");
                    return;
                }
            }
        }
        Duenno duenno = new Duenno(nombre, cedula, telefono, direccion);
        duennos.add(duenno);
    }

    /**
     *
     * @param nombreMascota
     * @param fechaEntrada
     * @param fechaSalida
     */
    public void crearReservacion(String nombreMascota, String fechaEntrada, String fechaSalida) {
        Reservacion reserva = new Reservacion(nombreMascota, fechaEntrada, fechaSalida);
        reservaciones.add(reserva);
    }

    /**
     *
     * @param nombreMascota
     * @param fecha
     * @param horaCita
     * @param observaciones
     */
    public void crearCita(String nombreMascota, String fecha, String horaCita, String observaciones) {
        Cita cita = new Cita(nombreMascota, fecha, horaCita, observaciones);
        citas.add(cita);
    }

    /**
     *
     * @return duennos arreglo de objetos de tipo Duenno
     */
    public ArrayList<Duenno> listarDuennos() {
        return this.duennos;
    }

    /**
     *
     * @return citas arreglo de objetos de tipo Cita
     */
    public ArrayList<Cita> listarCitas() {
        return this.citas;
    }

    /**
     *
     * @return usuarios arreglo de objetos de tipo Usuario
     */
    public ArrayList<Usuario> listarUsuarios() {
        return this.usuarios;
    }

    /**
     *
     * @return reservaciones arreglo de objetos de tipo Reservacion
     */
    public ArrayList<Reservacion> listarReservaciones() {
        return this.reservaciones;
    }

    /**
     *
     * @return mascotas arreglo de objetos de tipo Mascota
     */
    public ArrayList<Mascota> listarMascotas() {
        return this.mascotas;
    }


}
