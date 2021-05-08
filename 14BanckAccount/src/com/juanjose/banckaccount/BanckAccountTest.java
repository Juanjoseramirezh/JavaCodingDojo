package com.juanjose.banckaccount;

public class BanckAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BanckAccount cuenta1 = new BanckAccount();
		System.out.println("El numero de la cuenta es: " + cuenta1.getNumeroCuenta());
		//System.out.println("Saldo cuenta corriente: " + cuenta1.getSaldoCuentaCorriente());
		//System.out.println("Saldo cuenta ahorro: " + cuenta1.getSaldoCuentaAhorro());
		cuenta1.depositarCuentaAhorro(100);
		cuenta1.depositarCuentaCorriente(10000);
		cuenta1.sacarDineroCuentaAhorro(90);
		cuenta1.total();
		
		
	}

}
