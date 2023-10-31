package Exs;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner e = new Scanner(System.in);
		
		double preco[]= new double[10];
		int quantidade[]= new int[10];
		double total=0;
		double maior=0;
		
		
		//Repetição dos Produtos
		for(int i=0;i<3;i++) {
			System.out.println("-----------Produto: "+ (i+1) +"-----------");
			System.out.print("Informe o preço unitário de cada objeto: ");
			preco[i]=e.nextDouble();
			System.out.print("Informe a quantidade vendida: ");
			quantidade[i]=e.nextInt();			
		}
		//Relatórios das vendas
		for(int i=0;i<1;i++) {
			System.out.println("-----------Relatório de Vendas-----------");
			for(int j=0;j<3;j++) {
			System.out.print("Qtde: "+quantidade[j]+" \t");
			System.out.print("Preço: "+preco[j]+" \t" );
			System.out.print("Total: "+preco[j] * quantidade[j]+" \t");
			System.out.println("");
			total+=preco[j]*quantidade[j];
			if(preco[j]>preco[i])
			maior=preco[j];
		}
		}
		//Total Geral
		System.out.println("----------------------");
		System.out.println("Total Geral: "+total);
		
		//Comissão
		System.out.println("----------------------");
		System.out.println("Comissão: "+(total*5)/10);
		
		//Preço da maior quantidade
		System.out.println("-----------Preço da maior quantidade vendida-----------");
		System.out.println("Preço da maior quantidade vendida: "+maior);
		
	}

}
