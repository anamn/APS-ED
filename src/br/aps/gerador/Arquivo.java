package br.aps.gerador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public void setArquivo(Base base, String nome) throws IOException {
		base.getLista();
		FileWriter arq = new FileWriter("C:\\temp\\" + nome + ".txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		gravarArq.printf(base.toString());
		arq.close();
	}
}
