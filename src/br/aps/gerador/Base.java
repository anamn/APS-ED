package br.aps.gerador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Base {

	private List<Integer> lista = new ArrayList<>();

	public List<Integer> geraLista() {
		for (int i = 0; i <= 10000; i++) {
			Random numero = new Random();
			lista.add(numero.nextInt(3000));
		}
		return lista;
	}

	public void setLista(List<Integer> lista) {
		this.lista = lista;
	}

	public List<Integer> getLista() {
		return lista;
	}

	@Override
	public String toString() {
		return "" + lista;
	}
}
