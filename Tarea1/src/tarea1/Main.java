package tarea1;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in).useDelimiter("\\n");
    private static PrintStream output = new PrintStream(System.out);

    private static Mascota[] arregloDeMascotas = new Mascota[50];
    private static Duenno[] arregloDeDuennos = new Duenno[50];
    private static Cita[] arregloDeCitas = new Cita[50];
    private static Reservacion[] arregloDeReservaciones = new Reservacion[50];
    private static Usuario[] arregloDeUsuarios = new Usuario[50];
    private static int posMascotas = 0;
    private static int posCitas = 0;
    private static int posDueños = 0;
    private static int posReservaciones = 0;
    private static int posUsuarios = 0;

    public static void main(String[] args) {
        int opcion = 0;
        do {
            mostrarMenu();
            //output.println("Ingresar opción");
            opcion = input.nextInt();
            procesarOpcion(opcion);
        } while (opcion != 8);

    }

    private static void mostrarMenu() {
        output.println("\nBienvenido al sistema de la veterinaria MOKA. Elija la acción que desea realizar");
        output.println("1. Registrar Mascota");
        output.println("2. Listar Mascotas");
        output.println("3. Registrar citas");
        output.println("4. Registrar reservaciones");
        output.println("5. Registrar usuarios");
        output.println("6. Ingresar ranking de una mascota");
        output.println("7. Listar citas");
        output.println("8. Listar reservaciones");
        output.println("9. Listar dueños de mascotas");
        output.println("10. Listar usuarios");
        output.println("11. Salir");
        output.println("Ingrese su opción a continuación - ");
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                output.println("Nombre de la mascota: ");
                String nombreMascota = input.next();
                output.println("Digite los datos del dueño");
                output.println("Nombre completo: ");
                String nombreDuenno = input.next();
                output.println("Cédula: ");
                String cedulaDuenno = input.next();
                output.println("Número de teléfono: ");
                String telefonoDuenno = input.next();
                output.println("Dirección: ");
                String direccionDuenno = input.next();
                Duenno nuevoDuenno = new Duenno(nombreDuenno, cedulaDuenno, telefonoDuenno, direccionDuenno);
                arregloDeDuennos[posDueños++] = nuevoDuenno;
                output.println("Foto: ");
                String foto = input.next();
                for (int i = 0; i < arregloDeMascotas.length; i++) {
                    if (arregloDeMascotas[i] != null) {
                        if (arregloDeMascotas[i].getNombre().equals(nombreMascota)) {
                            output.println("No se puede ingresar una mascota ya existente. Intente de nuevo");
                            return;
                        }
                    }
                }
                Mascota nueva = new Mascota(nombreMascota, nuevoDuenno, foto, 0);
                arregloDeMascotas[posMascotas++] = nueva;
                break;
            case 2:
                for (int i = 0; i < arregloDeMascotas.length; i++) {
                    if (arregloDeMascotas[i] == null) {
                        break;
                    }
                    output.println("#" + (i + 1) + " " + arregloDeMascotas[i]);
                }
                break;
            case 3:
                output.println("Nombre de la mascota: ");
                String nombreMascotaCita = input.next();
                output.println("Fecha de la cita: ");
                String fechaCita = input.next();
                output.println("Hora de la cita: ");
                String horaCita = input.next();
                output.println("Observaciones(detalles): ");
                String observaciones = input.next();
                Cita nuevaCita = new Cita(nombreMascotaCita, fechaCita, horaCita, observaciones);
                arregloDeCitas[posCitas++] = nuevaCita;
                break;
            case 4:
                output.println("Nombre de la mascota: ");
                String nombreMascReservacion = input.next();
                output.println("Fecha de entrada: ");
                String fechaEntrada = input.next();
                output.println("Fecha salida: ");
                String fechaSalida = input.next();
                Reservacion nuevaReservacion = new Reservacion(nombreMascReservacion, fechaEntrada, fechaSalida);
                arregloDeReservaciones[posReservaciones++] = nuevaReservacion;
                break;
            case 5:
                output.println("Nombre completo: ");
                String nombreUsuario = input.next();
                output.println("Cédula: ");
                String cedulaUsuario = input.next();
                output.println("Teléfono: ");
                String telefonoUsuario = input.next();
                output.println("Dirección: ");
                String direccion = input.next();
                output.println("Rol: ");
                String rol = input.next();
                output.println("Estado: ");
                String estado = input.next();

                for (int i = 0; i < arregloDeUsuarios.length; i++) {
                    if (arregloDeUsuarios[i] != null) {
                        if (arregloDeUsuarios[i].getCedula().equals(cedulaUsuario)) {
                            output.println("No se puede ingresar un usuario ya existente. Intente de nuevo");
                            return;
                        }
                    }
                }

                Usuario nuevoUsuario = new Usuario(nombreUsuario, cedulaUsuario, telefonoUsuario, direccion, rol, estado);
                arregloDeUsuarios[posUsuarios++] = nuevoUsuario;
                break;
            case 6:
                output.println("Ingrese el nombre de la mascota a la que desea asignarle un ranking: ");
                String nombreMascRanking = input.next();

                for (int i = 0; i < arregloDeMascotas.length; i++) {
                    if (arregloDeMascotas[i] != null) {
                        if (arregloDeMascotas[i].getNombre().equals(nombreMascRanking)) {
                            output.println("Ranking de la mascota ");
                            int rankingMasc = input.nextInt();
                            arregloDeMascotas[i].setRanking(rankingMasc);
                            break;
                        } else {
                            output.println("No existe esa mascota. Intente de nuevo");
                        }
                    }
                }

                break;
            case 7:
                for (int i = 0; i < arregloDeCitas.length; i++) {
                    if (arregloDeCitas[i] == null) {
                        break;
                    }
                    output.println("#" + (i + 1) + " " + arregloDeCitas[i]);
                }
                break;
            case 8:
                for (int i = 0; i < arregloDeReservaciones.length; i++) {
                    if (arregloDeReservaciones[i] == null) {
                        break;
                    }
                    output.println("#" + (i + 1) + " " + arregloDeReservaciones[i]);
                }
                break;
            case 9:
                for (int i = 0; i < arregloDeDuennos.length; i++) {
                    if (arregloDeDuennos[i] == null) {
                        break;
                    }
                    output.println("#" + (i + 1) + " " + arregloDeDuennos[i]);
                }
                break;
            case 10:
                for (int i = 0; i < arregloDeUsuarios.length; i++) {
                    if (arregloDeUsuarios[i] == null) {
                        break;
                    }
                    output.println("#" + (i + 1) + " " + arregloDeUsuarios[i]);
                }
                break;
            case 11:
                break;
            default:
                output.println("Opción desconocida");
        }
    }

}
