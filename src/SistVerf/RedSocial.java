package SistVerf;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class RedSocial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar información al usuario
        System.out.println("Ingrese su nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su year de nacimiento:");
        int anio = scanner.nextInt();

        System.out.println("Ingrese su mes de nacimiento:");
        int mes = scanner.nextInt();

        System.out.println("Ingrese su dia de nacimiento:");
        int dia = scanner.nextInt();

        // Crear objeto Usuario con la información ingresada
        Usuario usuario = new Usuario(nombre, LocalDate.of(anio, mes, dia));

        // Crear sistema de verificación y comprobar la edad del usuario
        SistemaVerificacion sistemaVerificacion = new SistemaVerificacion();
        sistemaVerificacion.verificarEdad(usuario);

        scanner.close();
    }
}