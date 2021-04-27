package br.com.unipe.aula.model;

import java.text.DecimalFormat;

public class Moedas {
	
	private double dolar_cota = 0.1793722;
	private double dolar;
	private double real_cota = 5.5744 ;
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
		DecimalFormat df = new DecimalFormat("#.000");
		return Double.parseDouble(df.format(dolar * real_cota).replace(",","."));
	}
	
	public double resultadoReal() {
		DecimalFormat df = new DecimalFormat("#.000");
		return Double.parseDouble(df.format(real * dolar_cota).replace(",","."));
	}
}