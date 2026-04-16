package dev.herencia.cuenta;

public class Cuenta {
	    protected double saldo;

	    public Cuenta(double saldo) {
	        this.saldo = saldo;
	    }

	    public void depositar(double monto) {
	        saldo += monto;
	    }

	    public void retirar(double monto) {
	        saldo -= monto;
	    }

	    public void mostrarSaldo() {
	        System.out.println("Saldo: " + saldo);
	    }
}
