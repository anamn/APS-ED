package br.aps.gerador;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
		Base base= new Base();
		FileReader file = new FileReader("C:\\Users\\Doug\\Desktop\\" + nome + ".txt");
		BufferedReader le = new BufferedReader(file);
		String line;
		String[] numStr = new String[10];
		while ((line = le.readLine()) != null) {
			numStr = line.split(",");
		}
		List<Integer> numeros = new ArrayList<Integer>();
		for (String num : numStr) {
			numeros.add(Integer.valueOf(num));
		}
		le.close();
		base.setLista(numeros);
		return base;

	}
}
