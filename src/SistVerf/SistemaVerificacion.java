package SistVerf;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class SistemaVerificacion {
    // Método para verificar si el usuario es mayor de 13 años
    public void verificarEdad(Usuario usuario) {
        int edad = usuario.calcularEdad();

        if (edad < 13) {
            System.out.println("Lo siento " + usuario.getNombre() + ", tu edad (" + edad + " years) es menor a la permitida para registrarte.");
            redirigirSegunEdad(edad);
        } else {
            System.out.println("Bienvenido " + usuario.getNombre() + "Tu edad es adecuada para registrarte.");
        }
    }

    // Método para redirigir al usuario a páginas según su edad
    public void redirigirSegunEdad(int edad) {
        if (edad < 6) {
            System.out.println("Te redirigimos a una pagina para juniors kids.");
        } else if (edad >= 6 && edad < 13) {
            System.out.println("Te redirigimos a una pagina para pre-adolescentes.");
        }
    }
}
