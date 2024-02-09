package desafio_abs_delivery;

import java.util.Scanner;

import dominio.Bebida;
import enums.Bebidas;
import enums.TakeOutEatIn;
import enums.Tamanho;
import enums.TipoDeCopo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("---> Seja bem-vindo ao sistema ABS! <---");
		System.out.println(
				"| O seu sistema incrível de bebidas e o mais queridinho da galera |");
		System.out.println(">>> Vamos ao seu pedido: <<<");
		System.out.println("\n");

		Bebida bebida = new Bebida();

		System.out.println("Qual bebida deseja escolher?");
		System.out.println("1 - Refrigerante Coca");
		System.out.println("2 - Refrigerante Guaraná");
		System.out.println("3 - Suco de Uva");
		System.out.println("4 - Suco de Laranja");

		int opcaoBebida = sc.nextInt();

		while (opcaoBebida > 4 || opcaoBebida <= 0) {
			System.out.println("Número invalido, digite novamente: ");

			opcaoBebida = sc.nextInt();
		}

		switch (opcaoBebida) {
			case 1 -> bebida.setBebidas(Bebidas.COCA);
			case 2 -> bebida.setBebidas(Bebidas.GUARANA);
			case 3 -> bebida.setBebidas(Bebidas.UVA);
			case 4 -> bebida.setBebidas(Bebidas.LARANJA);
		}

		System.out.println("Deseja gelo em sua bebida?");
		System.out.println("S - Sim");
		System.out.println("N - Não");

		char gelo = sc.next().charAt(0);

		while (Character.toUpperCase(gelo) != 'S'
				&& Character.toUpperCase(gelo) != 'N') {
			System.out.println("Opcao invalida, digite novamente: ");

			gelo = sc.next().charAt(0);
		}

		if (Character.toUpperCase(gelo) == 'S') {
			bebida.setGelo(true);
		} else if (Character.toUpperCase(gelo) == 'N') {
			bebida.setGelo(false);
		} else {
			bebida.setGelo(true);
		}

		bebida.setQuantidadeGelo(0);

		System.out.println("Qual tamanho voce deseja?");

		if (opcaoBebida == 1 || opcaoBebida == 2) {
			System.out.println("P -> " + Tamanho.PEQUENO.getTamanho());
			System.out.println("M -> " + Tamanho.MEDIO.getTamanho());
			System.out.println("G -> " + Tamanho.GRANDE.getTamanho());

			bebida.setTipoDeCopo(TipoDeCopo.PAPEL);
			if (bebida.isGelo() == true) {
				bebida.setQuantidadeGelo(6);
			}
		} else {
			System.out.println("P -> " + Tamanho.PEQUENO.getTamanho());
			System.out.println("M -> " + Tamanho.MEDIO.getTamanho());

			bebida.setTipoDeCopo(TipoDeCopo.PLASTICO);
			if (bebida.isGelo() == true) {
				bebida.setQuantidadeGelo(12);
			}
		}

		char tamanhoBebida = sc.next().charAt(0);

		while (Character.toUpperCase(tamanhoBebida) != 'P'
				&& Character.toUpperCase(tamanhoBebida) != 'M'
				&& Character.toUpperCase(tamanhoBebida) != 'G') {
			System.out.println("Opção inválida, digite novamente: ");
			tamanhoBebida = sc.next().charAt(0);
		}

		switch (Character.toUpperCase(tamanhoBebida)) {
			case 'P' -> bebida.setTamanho(Tamanho.PEQUENO);
			case 'M' -> bebida.setTamanho(Tamanho.MEDIO);
			case 'G' -> bebida.setTamanho(Tamanho.GRANDE);
		}
		
		
		System.out.println("Deseja que o pedido seja embalado para viagem?");
		System.out.println("S - SIM");
		System.out.println("N - NAO");
		
		char isViagem;
		
		do {
		    isViagem = Character.toUpperCase(sc.next().charAt(0));
		    if (isViagem != 'S' && isViagem != 'N') {
		        System.out.println("Opcao invalida, digite novamente: ");
		    }
		} while (isViagem != 'S' && isViagem != 'N');

		
			switch (isViagem) {
				case 'S': bebida.setTampa(TakeOutEatIn.TAKE_OUT);
					break;
				case 'N': bebida.setTampa(TakeOutEatIn.EAT_IN);
					break;
	}

		System.out.println(bebida);
	}
	
}
