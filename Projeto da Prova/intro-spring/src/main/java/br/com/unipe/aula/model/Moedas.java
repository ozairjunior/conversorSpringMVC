package br.com.unipe.aula.model;

import java.text.DecimalFormat;

public class Moedas {
	
	private double euro_cota = 131.1079;
	private double euro;
	private double iene_cota = 0.0076273 ;
	private double iene;
	
	public Moedas() {}

	public Moedas(double euro_cota, double euro, double iene_cota, double iene) {
		super();
		this.euro_cota = euro_cota;
		this.euro = euro;
		this.iene_cota = iene_cota;
		this.iene = iene;
	}

	public double getEuro_cota() {
		return euro_cota;
	}

	public void setEuro_cota(double euro_cota) {
		this.euro_cota = euro_cota;
	}

	public double getEuro() {
		return euro;
	}

	public void setEuro(double euro) {
		this.euro = euro;
	}

	public double getIene_cota() {
		return iene_cota;
	}

	public void setIene_cota(double iene_cota) {
		this.iene_cota = iene_cota;
	}

	public double getIene() {
		return iene;
	}

	public void setIene(double iene) {
		this.iene = iene;
	}

	public double resultadoEuro() {
		DecimalFormat df = new DecimalFormat("#.000");
		return Double.parseDouble(df.format(euro * iene_cota).replace(",","."));
	}
	
	public double resultadoIene() {
		DecimalFormat df = new DecimalFormat("#.000");
		return Double.parseDouble(df.format(iene * euro_cota).replace(",","."));
	}
}