package cr.ac.ucenfotec.tarea2.controlador;

import cr.ac.ucenfotec.tarea2.bl.entidades.*;
import cr.ac.ucenfotec.tarea2.bl.logica.Gestor;
import cr.ac.ucenfotec.tarea2.iu.IU;

import java.util.ArrayList;

public class Controlador {

    private IU interfaz = new IU();
    private Gestor gestor = new Gestor();

    public void ejecutarPrograma() {
    int opcion = 0;
        do {
        interfaz.mostrarMenu();
        //output.println("Ingresar opción");
        opcion = interfaz.leerOpcion();
        procesarOpcion(opcion);
    } while (opcion != 11);

}

    /**
     *
     * @param opcion entero que determina la opcion que ejecutar en el switch
     */
    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                crearMascota();
                break;
            case 2:
                listarMascotas();
                break;
            case 3:
                crearCita();
                break;
            case 4:
                crearReservacion();
                break;
            case 5:
                crearUsuario();
                break;
            case 6:
                agregarRankingMascota();
                break;
            case 7:
                listarCitas();
                break;
            case 8:
                listarReservaciones();
                break;
            case 9:
                listarDuennos();
                break;
            case 10:
                listarUsuarios();
                break;
            case 11:
                break;
            default:
                interfaz.imprimirMensaje("Opción desconocida");
        }
    }

    //--ZONA DE CREACION DE CLASES--
    public void crearMascota() {
        interfaz.imprimirMensaje("Nombre de la mascota: ");
        String nombreMascota = interfaz.leerTexto();
        interfaz.imprimirMensaje("Digite los datos del dueño");
        interfaz.imprimirMensaje("Nombre completo: ");
        String nombreDuenno = interfaz.leerTexto();
        interfaz.imprimirMensaje("Cédula: ");
        String cedulaDuenno = interfaz.leerTexto();
        interfaz.imprimirMensaje("Número de teléfono: ");
        String telefonoDuenno = interfaz.leerTexto();
        interfaz.imprimirMensaje("Dirección: ");
        String direccionDuenno = interfaz.leerTexto();
        gestor.crearDuenno(nombreDuenno, cedulaDuenno, telefonoDuenno, direccionDuenno);
        interfaz.imprimirMensaje("Foto: ");
        String foto = interfaz.leerTexto();

        gestor.crearMascota(cedulaDuenno, nombreMascota, foto, 0);
        interfaz.imprimirMensaje("Mascota creada con éxito.");
    }

    public void crearCita(){
        interfaz.imprimirMensaje("Nombre de la mascota: ");
        String nombreMascotaCita = interfaz.leerTexto();
        interfaz.imprimirMensaje("Fecha de la cita: ");
        String fechaCita = interfaz.leerTexto();
        interfaz.imprimirMensaje("Hora de la cita: ");
        String horaCita = interfaz.leerTexto();
        interfaz.imprimirMensaje("Observaciones (detalles): ");
        String observaciones = interfaz.leerTexto();

        gestor.crearCita(nombreMascotaCita, fechaCita,horaCita, observaciones);
    }
    public void crearReservacion() {
        interfaz.imprimirMensaje("Nombre de la mascota: ");
        String nombreMascotaReservacion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Fecha de entrada: ");
        String fechaEntrada = interfaz.leerTexto();
        interfaz.imprimirMensaje("Fecha de salida: ");
        String fechaSalida = interfaz.leerTexto();

        gestor.crearReservacion(nombreMascotaReservacion,fechaEntrada,fechaSalida);
    }
    public void crearUsuario() {
        interfaz.imprimirMensaje("Nombre completo: ");
        String nombreUsuario = interfaz.leerTexto();
        interfaz.imprimirMensaje("Cédula: ");
        String cedula = interfaz.leerTexto();
        interfaz.imprimirMensaje("Teléfono: ");
        String telefono = interfaz.leerTexto();
        interfaz.imprimirMensaje("Dirección: ");
        String direccion = interfaz.leerTexto();
        interfaz.imprimirMensaje("Rol: ");
        String rol = interfaz.leerTexto();
        interfaz.imprimirMensaje("Estado: ");
        String estado = interfaz.leerTexto();

        gestor.crearUsuario(nombreUsuario,cedula,telefono,direccion,rol,estado);
    }
    //--FIN ZONA DE CREACION DE CLASES--

    //--ZONA DE LISTADOS--
    private void listarMascotas() {
        ArrayList<Mascota> mascotas = gestor.listarMascotas();
        interfaz.imprimirMensaje("Lista de mascotas");
        for (int i = 0; i < mascotas.size(); i++) {
            interfaz.imprimirMensaje(mascotas.get(i).toString());
        }
    }
    private void listarDuennos() {
        ArrayList<Duenno> duennos = gestor.listarDuennos();
        interfaz.imprimirMensaje("Lista de dueños");
        for (int i = 0; i < duennos.size(); i++) {
            interfaz.imprimirMensaje(duennos.get(i).toString());
        }
    }
    private void listarUsuarios() {
        ArrayList<Usuario> usuarios = gestor.listarUsuarios();
        interfaz.imprimirMensaje("Lista de usuarios");
        for (int i = 0; i < usuarios.size(); i++) {
            interfaz.imprimirMensaje(usuarios.get(i).toString());
        }
    }
    private void listarReservaciones() {
        ArrayList<Reservacion> reservaciones = gestor.listarReservaciones();
        interfaz.imprimirMensaje("Lista de reservaciones");
        for (int i = 0; i < reservaciones.size(); i++) {
            interfaz.imprimirMensaje(reservaciones.get(i).toString());
        }
    }
    private void listarCitas() {
        ArrayList<Cita> citas = gestor.listarCitas();
        interfaz.imprimirMensaje("Lista de citas");
        for (int i = 0; i < citas.size(); i++) {
            interfaz.imprimirMensaje(citas.get(i).toString());
        }
    }
    //--FIN ZONA LISTADOS--

    public void agregarRankingMascota() {
        interfaz.imprimirMensaje("Ingrese el nombre de la mascota a la que desea asignarle un ranking: ");
        String nombreMascRanking = interfaz.leerTexto();

        for (int i = 0; i < gestor.listarMascotas().size(); i++) {
                if (gestor.listarMascotas().get(i).getNombre().equals(nombreMascRanking)) {
                    interfaz.imprimirMensaje("Ranking de la mascota ");
                    int rankingMasc = interfaz.leerEntero();
                    gestor.listarMascotas().get(i).setRanking(rankingMasc);
                    break;
                } else {
                    interfaz.imprimirMensaje("No existe esa mascota. Intente de nuevo");
                }
        }
    }

}
