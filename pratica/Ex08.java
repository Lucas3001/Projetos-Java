package pratica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat f= new DecimalFormat("R$ ###0.0");
		
		int[][] estoque= new int[5][3];
		int[] arm= new int[4];
		int[] custoE= new int[4];
		int[] prod= new int[3];
		int[] custoP= new int[3];
		int maiorProd=0;
		int menorProd=0;
		
		
		for(int i = 0; i < 4; i++) {
			System.out.println("--- Estoque no armázem("+(i+1)+")---");
			for(int j = 0; j < 3; j++) {
				System.out.print("---Informe a quantidade em estoque do produto("+(j+1)+") : ");
				estoque[i][j]=sc.nextInt();
				arm[i]+=estoque[i][j];
				prod[j]+=estoque[i][j];
			}
		}
		
		System.out.println("\n---------- CUSTO DE CADA PRODUTO ---------- ");
		
		for(int i = 0; i < 3; i++) {
			System.out.print("--- Informe o custo do produto("+(i+1)+") : ");
			estoque[4][i]=sc.nextInt();
		}
		
		System.out.println("\n---------- QUANTIDADE DE ITENS EM CADA ARMAZÉM ---------- ");
		
		for(int i = 0; i < 4; i++) {
			System.out.println("--- Estoque no armazém("+(i+1)+") : " + arm[i]);
			
		}
		
		System.out.println("\n---------- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ----------");
		
		for(int i = 0; i < 4 ; i++) {
			if(estoque[i][1]>estoque[maiorProd][1]) {
				maiorProd=i;
			}
		}
		System.out.println("--- Armazém("+(maiorProd+1)+") - Quantidade de estoque: "+estoque[maiorProd][1]);
					
		System.out.println("\n---------- ARMAZÉM COM MENOR ESTOQUE ----------");		
		for(int i = 0; i < 3; i++) {
			if(i == 0) {
				menorProd=i;
			}
			if(arm[i]<arm[menorProd]) {
				menorProd=i;
			}
		}
		System.out.println("--- Armazém("+(menorProd + 1)+") - Quantidade de estoque: "+arm[menorProd]);
		
		System.out.println("\n---------- CUSTO TOTAL DE CADA PRODUTO ----------");
		
		for(int i = 0; i < 3; i++) {
			custoP[i]=prod[i]*estoque[4][i];
			System.out.println("--- Custo total do produto("+(i + 1)+"): "+ f.format(custoP[i]));
		}
		
		System.out.println("\n---------- CUSTO TOTAL DE CADA ARMAZÉM ----------");
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				custoE[i]+=estoque[i][j]*estoque[4][j];
			}
			System.out.println("--- Custo total no armazém( "+(i + 1)+"): "+ f.format(custoE[i]));
		}
	}

}
