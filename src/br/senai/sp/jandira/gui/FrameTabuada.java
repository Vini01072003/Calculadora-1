package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameTabuada {

	public String titulo;
	public int altura;
	public int largura;
	public Color corDeFundoDaTela;
	public Font fonteDosLabels;
	public Color corDoTextoDoBotao;
	public Color corDoBotao;
	
	
	public void criarTela() {
	JFrame tela = new JFrame();
	tela.setTitle(titulo);
	tela.setSize(largura, altura);
	tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	tela.setLayout(null);
	
	// Inserir os componentes dentro do container
	Container painel = tela.getContentPane();
	painel.setBackground(corDeFundoDaTela);
	
	
	// Criar os componentes do container
	JLabel labelTabuada = new JLabel();
	labelTabuada.setText("Tabuada");
	labelTabuada.setBounds(30, 10, 100, 30);
	labelTabuada.setFont(new Font("Courier new", Font.BOLD, 32));
	labelTabuada.setForeground(new Color(largura));
	
	
	JLabel labelmultiplicando = new JLabel();
	labelmultiplicando.setText("Nome:");
	labelmultiplicando.setBounds(30, 50, 100, 30);
	labelmultiplicando.setFont(fonteDosLabels);
	
	JTextField textFieldmultiplicando = new JTextField();
	textFieldmultiplicando.setBounds(30, 150, 100, 30);
	
	
	JLabel labelminimomultiplicador = new JLabel();
	labelminimomultiplicador.setText("Multiplicador:");
	labelminimomultiplicador.setBounds(30, 120, 100, 30);
	labelminimomultiplicador.setFont(fonteDosLabels);
	
	JTextField textFieldminimomultiplicador = new JTextField();
	textFieldminimomultiplicador.setBounds(30, 150, 100, 30);
	
	JLabel labelmaximomultiplicador = new JLabel();
	labelmaximomultiplicador.setText("maximomultiplicador:");
	labelmaximomultiplicador.setBounds(30, 190, 100, 30);
	labelmaximomultiplicador.setFont(fonteDosLabels);
	
	
	JButton buttonCalcular = new JButton();
	buttonCalcular.setText("Calcular");
	buttonCalcular.setBounds(240, 290, 100, 30);
	buttonCalcular.setForeground(corDoTextoDoBotao);
	buttonCalcular.setForeground(corDoTextoDoBotao);
	buttonCalcular.setForeground(corDoBotao);
	
	
	JButton buttonLimpar = new JButton();
	buttonLimpar.setText("Limpar");
	buttonLimpar.setBounds(240, 290, 100, 30);
	buttonLimpar.setForeground(corDoTextoDoBotao);
	buttonLimpar.setForeground(corDoBotao);
	
	JLabel labelResultado = new JLabel();
	labelResultado.setText("Seu resultado");
	labelResultado.setBounds(30, 380, 300, 30);
	
	
	
	
	
	}
	
	

}
