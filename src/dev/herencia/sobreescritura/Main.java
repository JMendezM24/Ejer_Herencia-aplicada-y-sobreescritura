package dev.herencia.sobreescritura;

import java.time.LocalDate;

import dev.herencia.persona.*;
import dev.herencia.cuenta.*;
import dev.herencia.producto.*;
import dev.herencia.transporte.*;
import dev.herencia.empleado.*;
import dev.herencia.animal.*;
import dev.herencia.vehiculo.*;
import dev.herencia.figura.*;
import dev.herencia.libro.*;

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
        Cuenta cuenta1 = new Cuenta(100);
        System.out.println("---- Cuenta ----");
        cuenta1.retirar(150);
        cuenta1.mostrarSaldo();
        
        System.out.println("\n---- Cuenta Corriente ----");
        CuentaCorriente cuenta2 = new CuentaCorriente(100, 50);
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
        
        
        System.out.println("\n===== EJERCICIO 5 =====");
        System.out.println("---- Empleado ----");
        Empleado emp = new Empleado("Manuel", 3000);
        emp.mostrarInfo();
        
        System.out.println("\n---- Gerente ----");
        Gerente ger = new Gerente("Maria", 4000, 2500);
        ger.mostrarInfo();
        
        
        System.out.println("\n===== EJERCICIO 6 =====");
        System.out.println("---- Animal ----");
        Animal animal = new Animal();
        animal.hacerSonido();
        
        System.out.println("\n---- Perro ----");
        Perro perro = new Perro();
        perro.hacerSonido();
        
        
        System.out.println("\n===== EJERCICIO 7 =====");
        System.out.println("---- Vehiculo ----");
        Vehiculo veh = new Vehiculo("Toyota", 180);
        veh.mostrarInfo();
        
        System.out.println("\n---- Moto ----");
        Moto moto = new Moto("Suzuki", 120, 125);
        moto.mostrarInfo();

        
        System.out.println("\n===== EJERCICIO 8 =====");
        System.out.println("---- Figura ----");
        Figura fig = new Figura();
        System.out.print("Area: " + fig.calcularArea()+ "\n");
        
        System.out.println("\n---- Moto ----");
        Rectangulo rect = new Rectangulo(20, 10);
        System.out.println("Area: " + rect.calcularArea());

        System.out.println("\n---- Circulo ----");
        Circulo cir = new Circulo(25);
        System.out.println("Area: " + cir.calcularArea());

        
        System.out.println("\n===== EJERCICIO 9 =====");
        System.out.println("---- Libro ----");
        Libro libro = new Libro("El Quijote", "Cervantes");
        libro.mostrarInfo();
        
        System.out.println("\n---- Libro Digital ----");
        LibroDigital ebook = new LibroDigital("Clean Code", "Robert C. Martin", 5.2);
        ebook.mostrarInfo();
            
    }
}
