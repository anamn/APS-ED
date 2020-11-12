package br.aps.ordenacao;

import br.aps.timer.Timer;

public class Quick {

	public Quick() {
		QuickSort(null, 0, 0);
	}

	private static Integer[] QuickSort(Integer[] vetor, int inicio, int fim) {
		Timer timer = new Timer();
		timer.start();
		if (inicio < fim) {
			int pPivo = separar(vetor, inicio, fim);
			QuickSort(vetor, inicio, pPivo - 1);
			QuickSort(vetor, pPivo + 1, fim);
		}
		timer.end("Quick Sort");
		return vetor;
	}

	private static int separar(Integer[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio + 1, j = fim;
		while (i <= j) {
			if (vetor[i] <= pivo)
				i++;
			else if (pivo < vetor[j])
				j--;
			else {
				int troca = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = troca;
				i++;
				j--;
			}
		}
		vetor[inicio] = vetor[j];
		vetor[j] = pivo;
		return j;
	}

}
