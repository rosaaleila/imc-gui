package br.senai.sp.jandira.model;

public class Imc {
	
	private double altura;
	private double peso;
	private double imc;
	private String estado;
	
	public void setAltura(String altura) {
		// convertendo para double
		this.altura = Double.parseDouble(altura.replace("," , "."));
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setPeso(String peso) {
		// convertendo pra double
		this.peso = Double.parseDouble(peso.replace("," , "."));
	}

	public double getPeso() {
		return peso;
	}
	
	public void setImc(double imc) {
		this.imc = imc;
	}
	
	public String getImc() {
		return String.valueOf(imc);
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
		public String getEstado() {
		return estado;
	}
		
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
		} else {
			estado = "Obesidade III (mórbida)";
		}
	}
}
