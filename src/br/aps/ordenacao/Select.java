package br.aps.ordenacao;

import br.aps.timer.Timer;

//import br.aps.gerador.*;

public class Select {

	public Select() {
		selectionSort(null);
	}

	public static Integer[] selectionSort(Integer[] array) {
		for (int pivo = 0; pivo < array.length - 1; pivo++) {
			int j = pivo;

			for (int i = j + 1; i < array.length; i++) {
				if (array[i] < array[j]) {
					j = i;
				}
			}
			if (j != pivo) {
				int k = array[pivo];
				array[pivo] = array[j];
				array[j] = k;
			}
		}
		return array;
	}

}
