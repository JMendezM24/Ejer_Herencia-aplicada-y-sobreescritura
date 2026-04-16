package dev.herencia.persona;

public class Docente extends Persona {
    private String especialidad;

    public Docente(String nombre, int edad, String especialidad) {
        super(nombre, edad); // Llama al constructor de Persona
        this.especialidad = especialidad;
    }

    @Override
    public void mostrar() {
        super.mostrar(); // Reutiliza mostrar() de Persona
        System.out.println("Especialidad: " + especialidad);
    }
}