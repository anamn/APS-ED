package br.aps.main;

import java.io.IOException;

import br.aps.gerador.Arquivo;
import br.aps.gerador.Base;

public class Principal {
	public static void main(String[] args) throws IOException {
		Arquivo arq = new Arquivo();
		Base base = new Base();
		base.geraLista();
		arq.setArquivo(base.getLista(), "numAntes");
		//adiciona o metodo de ordena�ao usando o getList da base e adiciona dnv nabase com o setList
		arq.getArquivo("numAntes");
	}
}
