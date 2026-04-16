package dev.herencia.sobreescritura;

import dev.herencia.persona.*;
import dev.herencia.cuenta.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 1 =====");
    	
    	Persona p = new Persona("Daniel", 20);
        Docente d = new Docente("Carlos", 40, "Matemática");
        Estudiante e = new Estudiante("Ana", 22, "2024-001");

        System.out.println("---- PERSONA ----");
        p.mostrar();

        System.out.println("\n---- DOCENTE ----");
        d.mostrar();

        System.out.println("\n---- ESTUDIANTE ----");
        e.mostrar();
        
        System.out.println("\n===== EJERCICIO 2 =====");
        // Cuenta normal
        Cuenta cuenta1 = new Cuenta(100);
        System.out.println("---- Cuenta ----");
        cuenta1.retirar(150);
        cuenta1.mostrarSaldo();

        //Cuenta corriente
        CuentaCorriente cuenta2 = new CuentaCorriente(100, 50);
        System.out.println("\n---- Cuenta Corriente ----");

        cuenta2.retirar(120); // permitido
        cuenta2.mostrarSaldo();

        cuenta2.retirar(50); // no permitido
        cuenta2.mostrarSaldo();
            
    }
}
