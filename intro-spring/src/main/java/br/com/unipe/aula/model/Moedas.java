package br.com.unipe.aula.model;

public class Moedas {
	
	private double dolar_cota =  0.18;
	private double dolar;
	private double real_cota = 5.62;
	private double real;
	
	public Moedas() {}

	public Moedas(double dolar_cota, double dolar, double real_cota, double real) {
		super();
		this.dolar_cota = dolar_cota;
		this.dolar = dolar;
		this.real_cota = real_cota;
		this.real = real;
	}

	public double getDolar_cota() {
		return dolar_cota;
	}

	public void setDolar_cota(double dolar_cota) {
		this.dolar_cota = dolar_cota;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}

	public double getReal_cota() {
		return real_cota;
	}

	public void setReal_cota(double real_cota) {
		this.real_cota = real_cota;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double resultadoDolar() {
		
		return dolar * real_cota;
	}
	
	public double resultadoReal() {
		return real*dolar_cota;
	}
}
