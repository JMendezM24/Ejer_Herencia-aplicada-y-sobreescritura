package dev.herencia.sobreescritura;

import java.time.LocalDate;

import dev.herencia.persona.*;
import dev.herencia.cuenta.*;
import dev.herencia.producto.*;
import dev.herencia.transporte.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("===== EJERCICIO 1 =====");
    	
    	Persona p = new Persona("Daniel", 20);
        Docente d = new Docente("Carlos", 40, "Matemática");
        Estudiante e = new Estudiante("Ana", 22, "2024-001");

        System.out.println("---- Persona ----");
        p.mostrar();
        System.out.println("\n---- Docente ----");
        d.mostrar();
        System.out.println("\n---- Estudiante ----");
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

        cuenta2.retirar(120); // Permitido
        cuenta2.mostrarSaldo();

        cuenta2.retirar(50); // No permitido
        cuenta2.mostrarSaldo();
        
        
        System.out.println("\n===== EJERCICIO 3 =====");
        System.out.println("---- Producto ----");
        Producto pro = new Producto("Arroz", 10.50);
        pro.mostrarInfo();

        System.out.println("\n---- Producto Perecedero ----");
        ProductoPerecedero pp = new ProductoPerecedero("Leche",8.75, LocalDate.of(2026, 5, 1)); // Cambia la fecha para probar
        pp.mostrarInfo();

        
        System.out.println("\n===== EJERCICIO 4 =====");
        System.out.println("---- Transporte ----");
        Transporte t = new Transporte(50);
        t.descripcion();

        System.out.println("\n---- Bus ----");
        Bus b = new Bus(40, "Zona 1 - Zona 10");
        b.descripcion();
        


            
    }
}
