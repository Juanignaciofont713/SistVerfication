package SistVerf;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Usuario {
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor
    public Usuario(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad del usuario
    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    // Getter para el nombre del usuario
    public String getNombre() {
        return nombre;
    }
}    