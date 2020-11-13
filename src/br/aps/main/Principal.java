package br.aps.main;

import java.io.IOException;

import br.aps.gerador.Arquivo;
import br.aps.gerador.Base;
import br.aps.ordenacao.Insertion;
import br.aps.ordenacao.Quick;
import br.aps.ordenacao.Select;
import br.aps.timer.Timer;

public class Principal {
	public static void main(String[] args) throws IOException {
		Arquivo arq = new Arquivo();
		Base base = new Base();
		Timer timer = new Timer();

		base.geraLista();
		arq.setArquivo(base, "arquivoBase");
		arq.getArquivo("arquivoBase");

		// Insertion Sort
		base.setLista(Insertion.InsertionSort(arq.getArquivo("arquivoBase").getLista()));
		arq.setArquivo(base, "ordenacaoInsertionArquivo");
		base.setLista(Insertion.InsertionSort(base.getLista()));
		arq.setArquivo(base, "ordenacaoInsertionRandom");
		System.out.println("--------------------------------------------------");
		// Quick Sort
		timer.start();
		base.setLista(Quick.QuickSort(arq.getArquivo("arquivoBase").getLista(), 0, 3000));
		timer.end("Quick Sort");
		arq.setArquivo(base, "ordenacaoQuickArquivo");
		timer.start();
		base.setLista(Quick.QuickSort(base.getLista(), 0, 3000));
		timer.end("Quick Sort");
		arq.setArquivo(base, "ordenacaoQuickRandom");
		System.out.println("--------------------------------------------------");
		// Select Sort
		base.setLista(Select.selectionSort(arq.getArquivo("arquivoBase").getLista()));
		arq.setArquivo(base, "ordenacaoSelectionArquivo");
		base.setLista(Select.selectionSort(base.getLista()));
		arq.setArquivo(base, "ordenacaoSelectionRandom");
		System.out.println("--------------------------------------------------");
	}
}
