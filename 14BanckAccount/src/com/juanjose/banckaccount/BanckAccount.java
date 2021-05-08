package com.juanjose.banckaccount;

import java.util.ArrayList;
import java.util.Random;

public class BanckAccount {

	// MEMBER VARIABLE
	private String numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;

	// MEMBER VARIABLE STATIC
	private static int numeroDeCuentasCreadas;
	private static double cantidadDeDineroAlmacenado;

	// CONSTRUCTORS
	public BanckAccount(String numeroCuenta, double saldoCuentaCorriente, double saldoCuentaAhorro) {
		this.numeroCuenta = numeroCuenta;
		this.saldoCuentaCorriente = saldoCuentaCorriente;
		this.saldoCuentaAhorro = saldoCuentaAhorro;
		
		numeroDeCuentasCreadas++;
	}

	public BanckAccount() {
		this.numeroCuenta = generarNuevoNumeroCuenta();
		this.saldoCuentaCorriente = 0;
		this.saldoCuentaAhorro = 0;
	}

	// GETTERS AND SETTERS

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/*
	 * public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta =
	 * numeroCuenta; }
	 */

	private String generarNuevoNumeroCuenta() {
		Random rnd = new Random();
		String num = "";
		for (int i = 0; i < 10; i++) {
			num += rnd.nextInt(10);
		}
		
		return num;
	}

	public double getSaldoCuentaCorriente() {
		System.out.println("Saldo de la cuenta corriente: " + this.saldoCuentaCorriente);
		return saldoCuentaCorriente;
	}

	public void setSaldoCuentaCorriente(double saldoCuentaCorriente) {
		this.saldoCuentaCorriente = saldoCuentaCorriente;
	}

	public double getSaldoCuentaAhorro() {
		System.out.println("Saldo de la cuenta ahorro: " + this.saldoCuentaAhorro);
		return saldoCuentaAhorro;
	}

	public void setSaldoCuentaAhorro(double saldoCuentaAhorro) {
		this.saldoCuentaAhorro = saldoCuentaAhorro;
	}

	// OTHER METHODS

	public void depositarCuentaCorriente(double saldoCuentaCorriente) {
		this.setSaldoCuentaCorriente(saldoCuentaCorriente);
		System.out.println("Depositas " + saldoCuentaCorriente + " a tu cuenta corriente");
		cantidadDeDineroAlmacenado = +saldoCuentaCorriente;
	}

	public void depositarCuentaAhorro(double saldoCuentaAhorro) {
		this.setSaldoCuentaAhorro(saldoCuentaAhorro);
		System.out.println("Depositas " + saldoCuentaAhorro + " a tu cuenta corriente");
		cantidadDeDineroAlmacenado = +saldoCuentaAhorro;
	}

	public void sacarDineroCuentaCorriente(int monto) {
		if (getSaldoCuentaCorriente() < monto) {
			System.out.println("No tienes suficiente dinero para sacar esta cantidad de dinero");
		}
		else {
			setSaldoCuentaCorriente(getSaldoCuentaCorriente()- monto);
		}
	}

	public void sacarDineroCuentaAhorro(int monto) {
		if (getSaldoCuentaAhorro() < monto) {
			System.out.println("No tienes suficiente dinero en la cuenta ahorro para retirar");
		} else {
			System.out.println("Retiras " + monto + " a la cuenta ahorro");
			setSaldoCuentaAhorro(getSaldoCuentaAhorro() - monto);
		}
	}
	
	public double total() {
		cantidadDeDineroAlmacenado = saldoCuentaCorriente + saldoCuentaAhorro;
		
		System.out.println("La cantidad total de dinero: " + cantidadDeDineroAlmacenado);
		return cantidadDeDineroAlmacenado;
	}

}
