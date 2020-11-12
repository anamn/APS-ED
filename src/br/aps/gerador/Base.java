package br.aps.gerador;

import java.util.Random;

public class Base {

	private Integer lista[];

	public Integer[] geraLista() {
		for (int i = 0; i <= 10000; i++) {
			Random numero = new Random();
			lista[i] = numero.nextInt(3000);
		}
		return lista;
	}

	public void setLista(Integer[] lista) {
		this.lista = lista;
	}

	public Integer[] getLista() {
		return lista;
	}

	@Override
	public String toString() {
		return "" + lista;
	}
}
