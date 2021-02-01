package br.edu.empresa.gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		
		
		// ***Construir um JLabel Altura
		JTextField textAltura = new JTextField();
		textAltura.setBounds(90, 10, 100, 30);
		
		
		JLabel labelBase = new JLabel();
		labelBase.setText("Base: ");
		labelBase.setBounds(10, 50, 80, 30);
		
		
		JTextField textBase = new JTextField();
		textBase.setBounds(90, 50, 100, 30);
		
		JLabel labelArea = new JLabel();
		labelArea.setText("Area");
		labelArea.setBounds(220, 10, 50, 30);
	
		
		JLabel labelPerimetro = new JLabel();
		labelPerimetro.setText("Perimetro");
		labelPerimetro.setBounds(220, 50, 70, 30);
		
		//Criar um botão
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("CALCULAR");
		buttonCalcular.setBounds(10, 100, 180, 30);
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("LIMPAR");
		buttonLimpar.setBounds(10, 140, 180, 30);
		
		
		
		telaRetangulo.getContentPane().add(labelAltura);
		telaRetangulo.getContentPane().add(textAltura);
		telaRetangulo.getContentPane().add(labelBase);
		telaRetangulo.getContentPane().add(textBase);
		telaRetangulo.getContentPane().add(buttonCalcular);
		telaRetangulo.getContentPane().add(buttonLimpar);
		telaRetangulo.getContentPane().add(labelArea);
		telaRetangulo.getContentPane().add(labelPerimetro);
		
		telaRetangulo.setVisible(true);
		
		// ****** Ouvintes de ações e clicks.
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r1 = new Retangulo();
				r1.setAltura(Double.parseDouble(textAltura.getText()));
				r1.setBase(Double.parseDouble(textBase.getText()));
				
				labelArea.setText(String.valueOf(r1.calcularArea()));
				labelPerimetro.setText(String.valueOf(r1.calcularPerimetro()));
			}
		});
		/*labelPerimetro.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Sai daqui");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Jonatan");
				
			}
		});*/
		
		//*****Cliques da tela
		/*buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Retangulo r = new Retangulo();
				r.setAltura(Double.parseDouble(textAltura.getText()));
				r.setBase(Double.parseDouble(textBase.getText()));
				
				labelAltura.setText(String.valueOf(r.calcularArea()));
				labelBase.setText(String.valueOf(r.calcularPerimetro()));
			}
		});*/
		
		//Autor: Jonatan V. Valdivia.
	}
	
	
}
