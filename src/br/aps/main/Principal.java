package br.aps.main;

import java.io.IOException;

import br.aps.gerador.Arquivo;
import br.aps.gerador.Base;
import br.aps.ordenacao.Insertion;
import br.aps.ordenacao.Quick;
import br.aps.ordenacao.Select;

public class Principal {
	public static void main(String[] args) throws IOException {
		Arquivo arq = new Arquivo();
		Base base = new Base();
		base.geraLista();
		arq.setArquivo(base, "arquivoBase");

		// Insertion Sort
		base.setLista(Insertion.InsertionSort(arq.getArquivo("arquivoBase").getLista()));
		arq.setArquivo(base, "ordenacaoInsertionArquivo");
		base.setLista(Insertion.InsertionSort(base.getLista()));
		arq.setArquivo(base, "ordenacaoInsertionRandom");

		// Quick Sort
		// base.setLista(Quick.QuickSort(arq.getArquivo("arquivoBase").getLista()));
		arq.setArquivo(base, "ordenacaoQuickArquivo");
		// base.setLista(Quick.QuickSort(base.getLista()));
		arq.setArquivo(base, "ordenacaoQuickRandom");

		// Select Sort
		base.setLista(Select.selectionSort(arq.getArquivo("arquivoBase").getLista()));
		arq.setArquivo(base, "ordenacaoSelectionArquivo");
		base.setLista(Select.selectionSort(base.getLista()));
		arq.setArquivo(base, "ordenacaoSelectionRandom");
	}
}
