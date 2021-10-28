package br.senai.sp.jandira.ui;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Imc;

public class Tela {
	
	public void criarTela() {
		Imc calculoImc = new Imc();
		
		// formatação
		JFrame criarTela = new JFrame();
		criarTela.setSize(350, 400);
		criarTela.setResizable(false);
		criarTela.setLayout(null);
		criarTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		criarTela.setTitle("Calculadora IMC");
	
		// adicionando elementos
		JLabel lblTitulo = new JLabel();
		lblTitulo.setText("Cálculo de IMC");
		lblTitulo.setBounds(40, 20, 200, 30);
		lblTitulo.setForeground(Color.BLUE);
		lblTitulo.setFont(new Font("", Font.BOLD, 18));
		
		JLabel lblPeso = new JLabel();
		lblPeso.setText("Seu peso:");
		lblPeso.setBounds(40, 60, 60, 30);
		lblPeso.setFont(new Font("", Font.PLAIN, 12));
		
		JTextField txtPeso = new JTextField();
		txtPeso.setBounds(110, 60, 70, 30);
		
		JLabel lblAltura = new JLabel();
		lblAltura.setText("Sua altura:");
		lblAltura.setBounds(40, 100, 70, 30);
		lblAltura.setFont(new Font("", Font.PLAIN, 12));
		
		JTextField txtAltura = new JTextField();
		txtAltura.setBounds(110, 100, 70, 30);
		
		JButton btnCalcular = new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(40, 140, 200, 40);
		btnCalcular.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblResultados = new JLabel();
		lblResultados.setText("Resultados:");
		lblResultados.setBounds(40, 190, 80, 30);
		lblResultados.setFont(new Font("", Font.BOLD, 13));
		
		JLabel lblValor = new JLabel();
		lblValor.setText("Valor IMC:");
		lblValor.setBounds(40, 220, 70, 30);
		lblValor.setFont(new Font("", Font.PLAIN, 12));
		
		JLabel lblEstado = new JLabel();
		lblEstado.setText("Estado IMC:");
		lblEstado.setBounds(40, 250, 70, 30);
		lblEstado.setFont(new Font("", Font.PLAIN, 12));
		
		JLabel lblIMC = new JLabel();
		lblIMC.setBounds(120, 220, 70, 30);
		
		JLabel lblClassificacao = new JLabel();
		lblClassificacao.setBounds(120, 250, 90, 30);
		
		//adicionando elementos a tela
		criarTela.getContentPane().add(lblTitulo);
		criarTela.getContentPane().add(lblPeso);
		criarTela.getContentPane().add(txtPeso);
		criarTela.getContentPane().add(lblAltura);
		criarTela.getContentPane().add(txtAltura);
		criarTela.getContentPane().add(btnCalcular);
		criarTela.getContentPane().add(lblResultados);
		criarTela.getContentPane().add(lblEstado);
		criarTela.getContentPane().add(lblValor);
		criarTela.getContentPane().add(lblClassificacao);
		criarTela.getContentPane().add(lblIMC);

		// ação do botao
		btnCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculoImc.setAltura(txtAltura.getText()); // atribuindo altura
				calculoImc.setPeso(txtPeso.getText()); // atribuindo peso
				
				double altura = calculoImc.getAltura(); // criando variavel para guardar os valores
				double peso = calculoImc.getPeso();
				
				// chamando os metodos para operacoes
				calculoImc.calcular(altura, peso);
				calculoImc.verificar();
				
				String imc = calculoImc.getImc();
				String estado = calculoImc.getEstado();
				
				lblIMC.setText(imc);
				lblClassificacao.setText(estado);
				
			}
		});
		
		criarTela.setVisible(true);
	
	}
}
