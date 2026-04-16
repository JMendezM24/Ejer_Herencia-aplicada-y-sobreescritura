package dev.herencia.cuenta;

public class CuentaCorriente extends Cuenta{
	    private double limiteSobregiro;

	    public CuentaCorriente(double saldo, double limiteSobregiro) {
	        super(saldo);
	        this.limiteSobregiro = limiteSobregiro;
	    }

	    @Override
	    public void retirar(double monto) {
	        // lógica nueva
	        if (saldo + limiteSobregiro >= monto) {
	            super.retirar(monto); // reutiliza método base
	        } else {
	            System.out.println("Límite de sobregiro excedido");
	        }
	    }
}

