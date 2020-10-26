package cr.ac.ucenfotec.tarea2.iu;

import java.io.PrintStream;
import java.util.Scanner;

public class IU {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public  void mostrarMenu() {
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

    /**
     * @return input.nextInt() el entero que devuelve es la entrada para ingresar un numero entero
     */
    public int leerOpcion() {
        output.println("Su opción es: ");
        return input.nextInt();
    }

    /**
     *
     * @return input.nextInt() el entero que devuelve es la entrada para ingresar un numero entero
     */
    public int leerEntero() {
        return input.nextInt();
    }
    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }
    /**
     * @return input.next() la cadena de caracteres que devuelve es la entrada para ingresar una cadena de caracteres
     */
    public String leerTexto() {
        return input.next();
    }
    public char leerChar() {
        return input.next().charAt(0);
    }
}
