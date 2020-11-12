package br.aps.ordenacao;

import br.aps.timer.Timer;

public class Insertion {

	public Insertion() {
		InsertionSort(null);
	}

	public static Integer[] InsertionSort(Integer[] vetor) {
		Timer timer = new Timer();
		timer.start();
		int i;
		int j;
		int pivo;

		for (j = 1; j < vetor.length; j++) {
			pivo = vetor[j];
			for (i = j - 1; (i >= 0) && (vetor[i] > pivo); i--) {
				vetor[i + 1] = vetor[i];
			}
			vetor[i + 1] = pivo;
		}
		timer.end("Insertion Sort");
		return vetor;
	}

}
