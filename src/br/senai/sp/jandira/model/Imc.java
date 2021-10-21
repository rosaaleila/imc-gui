package br.senai.sp.jandira.model;

public class Imc {
	
	private double imc;
	private String estado;
	
	public void calcular(double altura, double peso) {
		imc = peso / (altura*altura);
	    imc = Math.round(imc * 100);
	    imc = imc / 100;
	}

	public void verificar() {
		if (imc < 18.5) {
			estado = "Abaixo do peso.";
		} else if (imc >= 18.6 && imc <= 24.9) {
			estado = "Peso ideal";
		} else if (imc >= 25.0 && imc <= 29.9) {
			estado = "Levemente acima do peso";
		} else if (imc >= 30.0 && imc <= 34.9) {
			estado = "Obesidade grau I";
		} else if (imc >= 35.0 && imc <= 39.9) {
			estado = "Obesidade grau II (severa)";
		} else if (imc > 40) {
			estado = "Obesidade III (mórbida)";
		}
	}
	
	public double getImc() {
		return imc;
	}

	public String getEstado() {
		return estado;
	}

	
}
