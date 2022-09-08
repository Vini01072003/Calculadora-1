package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicando;
	public int minimomultiplicador;
	public int maximomultiplicador;

	public String[] getTabuada() {

		int Tamanho = minimomultiplicador - maximomultiplicador + 1;
		String Tabuada[] = new String[Tamanho];

		int Contador = 0;

		while (Contador < Tamanho) {

			int produto = multiplicando * minimomultiplicador;

			String resultado = multiplicando + " X " + minimomultiplicador + " X " + maximomultiplicador;
			Tabuada[Contador] = resultado;

			Contador++;
			minimomultiplicador++;

		}
		return Tabuada;
	}

}