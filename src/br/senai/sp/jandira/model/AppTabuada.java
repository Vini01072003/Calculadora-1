package br.senai.sp.jandira.model;

import java.awt.Color;

import br.senai.sp.jandira.gui.FrameTabuada;

public class AppTabuada {

	public static void main(String[] args) {
	 
	FrameTabuada tela = new FrameTabuada();
	tela.titulo = "Tabuada";
	tela.altura = 600;
	tela.largura = 600;
	tela.corDeFundoDaTela = new Color(44,185,204);
	// tela.corDeTextoDoBotao = new Color(0, 0, 0);
		tela.criarTela();
		
		
	Tabuada Tabuada= new Tabuada();
	 Tabuada.multiplicando = 2;
	 Tabuada.minimomultiplicador = 8;
	 Tabuada.maximomultiplicador = 14;
	 
	 String[] resultado = Tabuada.getTabuada();
	 
	 
	 int Contador = 0;
	 while (Contador < resultado.length) {
		 System.out.println(resultado[Contador]);
		 Contador++;
	 }
	
	System.out.println("--------------------FIM-----------------");
	
	

	}

}
