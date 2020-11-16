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

		// Listas aleatorias externas 
		// Insertion Sort
		System.out.println("Listas aleatorias externas");
		timer.start();
		base.setLista(Insertion.InsertionSort(arq.getArquivo("arquivoBase").getLista()));// Primeiro ordenamento
		timer.end("1� Insertion Sort");
		arq.setArquivo(base, "ordenacaoInsertionArquivo");
		
		// Quick Sort
		timer.start();
		base.setLista(Quick.QuickSort(arq.getArquivo("arquivoBase").getLista(), 0, 3000));
		timer.end("1� Quick Sort");
		arq.setArquivo(base, "ordenacaoQuickArquivo");
		
		// Select Sort
		timer.start();
		base.setLista(Select.selectionSort(arq.getArquivo("arquivoBase").getLista()));
		timer.end("1� Selection Sort");
		arq.setArquivo(base, "ordenacaoSelectionArquivo");
		System.out.println("--------------------------------------------------");
		
		// Listas aleatorias internas
		System.out.println("Listas aleatorias internas");
		// Insertion Sort
		timer.start();
		base.setLista(Insertion.InsertionSort(base.geraLista()));// segundo ordenamento
		timer.end("2� Insertion Sort");
		arq.setArquivo(base, "ordenacaoInsertionRandom");
		
		// Quick Sort
		timer.start();
		base.setLista(Quick.QuickSort(base.geraLista(), 0, 3000));
		timer.end("2� Quick Sort");
		arq.setArquivo(base, "ordenacaoQuickRandom");
		
		// Select Sort
		timer.start();
		base.setLista(Select.selectionSort(base.geraLista()));
		timer.end("2� Selection Sort");
		arq.setArquivo(base, "ordenacaoSelectionRandom");
		System.out.println("--------------------------------------------------");
		
		
		// lista cm 50% dos dados ordenados
		System.out.println("Listas 50% aleatorias");
		// Insertion Sort
		timer.start();
		base.setLista(Insertion.InsertionSort(base.geraLista50()));
		timer.end("3� Insertion Sort");
		arq.setArquivo(base, "ordenacaoInsertion50");

		// Quick Sort
		timer.start();
		base.setLista(Quick.QuickSort(base.geraLista50(), 0, 3000));
		timer.end("3� Quick Sort");
		arq.setArquivo(base, "ordenacaoQuick50");

		// Select Sort
		timer.start();
		base.setLista(Select.selectionSort(base.geraLista50()));
		timer.end("3� Selection Sort");
		arq.setArquivo(base, "ordenacaoSelection50");
		System.out.println("--------------------------------------------------");

		// lista cm 75% dos dados ordenados
		System.out.println("Listas 75% aleatorias");
		// Insertion Sort
		timer.start();
		base.setLista(Insertion.InsertionSort(base.geraLista75()));
		timer.end("4� Insertion Sort");
		arq.setArquivo(base, "ordenacaoInsertion75");

		// Quick Sort
		timer.start();
		base.setLista(Quick.QuickSort(base.geraLista75(), 0, 3000));
		timer.end("4� Quick Sort");
		arq.setArquivo(base, "ordenacaoQuick75");

		// Select Sort
		timer.start();
		base.setLista(Select.selectionSort(base.geraLista75()));
		timer.end("4� Selection Sort");
		arq.setArquivo(base, "ordenacaoSelection75");
		System.out.println("--------------------------------------------------");

	}
}
