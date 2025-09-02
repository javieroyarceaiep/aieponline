// Importamos la clase Scanner desde la librería java.util para leer datos desde el teclado
import java.util.Scanner;

// Clase pública principal (debe llamarse igual que el archivo: VehiculoApp.java)
public class VehiculoApp {
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer datos desde consola
        Scanner sc = new Scanner(System.in);

        // Se ejecuta primero el módulo para capturar datos del usuario
        DatosUsuario datos = new DatosUsuario();
        datos.ejecutar(sc);

        // Luego se ejecuta el módulo para capturar datos del vehículo
        DatosVehiculo vehiculo = new DatosVehiculo();
        vehiculo.ejecutar(sc);
    }
}

// Clase para pedir el nombre y edad del usuario
class DatosUsuario {
    public void ejecutar(Scanner sc) {
        // Declaración de variables
        String nombre;
        int edad;

        // Solicitar datos al usuario
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Mostrar en pantalla los datos ingresados
        System.out.println("\n--- Datos del Usuario ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

// Clase para pedir datos del vehículo
class DatosVehiculo {
    public void ejecutar(Scanner sc) {
        // Declaración de variables
        String marca, modelo, cilindrada, combustible;
        int pasajeros;

        // Solicitar datos
        System.out.print("Ingrese la marca: ");
        marca = sc.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = sc.nextLine();

        System.out.print("Ingrese la cilindrada: ");
        cilindrada = sc.nextLine();

        System.out.print("Ingrese el tipo de combustible: ");
        combustible = sc.nextLine();

        System.out.print("Ingrese la capacidad de pasajeros: ");
        pasajeros = sc.nextInt();

        // Mostrar datos
        System.out.println("\n--- Datos del Vehiculo ---");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Combustible: " + combustible);
        System.out.println("Capacidad: " + pasajeros + " pasajeros");
    }
}
