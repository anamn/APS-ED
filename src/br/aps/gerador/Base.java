package br.aps.gerador;

import java.util.Random;

public class Base {

	private Integer[] lista = new Integer[10001];

	public Integer[] geraLista() {
		for (int i = 0; i <= 10000; i++) {
			Random numero = new Random();
			lista[i] = numero.nextInt(3000);
		}
		return lista;
	}

	public Integer[] geraLista50() {
		for (int i = 0; i <= 5000; i++) {
			lista[i] = i;
		}
		for (int i = 5000; i <= 10000; i++) {
			Random numero = new Random();
			lista[i] = numero.nextInt(3000);
		}
		return lista;
	}

	public Integer[] geraLista75() {
		for (int i = 0; i <= 7500; i++) {
			lista[i] = i;
		}
		for (int i = 7500; i <= 10000; i++) {
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
