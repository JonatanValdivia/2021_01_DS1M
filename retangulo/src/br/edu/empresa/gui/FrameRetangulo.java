package br.edu.empresa.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.edu.empresa.model.Retangulo;

public class FrameRetangulo {
	
	public void criarTela() {
		JFrame telaRetangulo = new JFrame();
		telaRetangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaRetangulo.setSize(500, 300);
		telaRetangulo.setTitle("Cálculos com retângulo");
		telaRetangulo.setLayout(null);
		telaRetangulo.setLocationRelativeTo(null);
		
		//****Criar um Label
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura: ");
		//Definir a posição e tamanho do Label (x, y, w, h)
		labelAltura.setBounds(10, 10, 80, 30);
		//*****Colocar o labelAltura dentro do 
		//painel de conteúdo -> contentPane
		//caixa de texto:
		
		JTextField textAltura = new JTextField();
		textAltura.setBounds(90, 10, 100, 30);
		
		
		JLabel labelBase = new JLabel();
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 50, 80, 30);
		
		
		JTextField textBase = new JTextField();
		textBase.setBounds(90, 50, 100, 30);
		
		//Criar um botão
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(10, 95, 180, 30);
		
		
		
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		
		
		telaRetangulo.setVisible(true);
		
		//*****Cliques da tela
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText()));
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.setText(String.valueOf(r.calcularArea()));
				labelBase.setText(String.valueOf(r.calcularPerimetro()));
			}
		});
	}
	
	
}
