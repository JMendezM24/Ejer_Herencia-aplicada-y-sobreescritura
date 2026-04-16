package dev.herencia.producto;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaVencimiento);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);

        if (estaVencido()) {
            System.out.println("⚠ Producto vencido");
        } else {
            System.out.println("✅ Producto vigente");
        }
    }
}