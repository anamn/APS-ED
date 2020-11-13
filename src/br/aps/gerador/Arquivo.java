package br.aps.gerador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {

	public void setArquivo(Base base, String nome) throws IOException {
		FileWriter arq = new FileWriter("C:\\Users\\Doug\\Desktop\\" + nome + ".txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		for (Integer integer : base.getLista()) {
			gravarArq.printf(integer + ",");
		}
		arq.close();
	}

	public Base getArquivo(String nome) throws IOException {
		Base base = new Base();
		FileReader file = new FileReader("C:\\Users\\Doug\\Desktop\\" + nome + ".txt");
		BufferedReader le = new BufferedReader(file);
		String line;
		String[] numStr = new String[10];
		while ((line = le.readLine()) != null) {
			numStr = line.split(",");
		}

		Integer[] numeros = new Integer[10001];
		int i = 0;
		for (String num : numStr) {
			numeros[i] = Integer.valueOf(num);
			i++;
		}
		le.close();
		base.setLista(numeros);
		return base;

	}
}
