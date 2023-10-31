package pratica;
	
	
	import java.text.DecimalFormat;
	import java.util.Scanner;

	public class exercici {
		public static void main(String[] args) {
			
			int[][] armazem = new int[5][3];
			int[] sumProd = new int[4];
			int[] sumEst = new int[3];
			int[] custoP = new int[3];
			int[] custoE = new int[4];
			int iMaiorP2 = 0;
			int iMenorE = 0;
			
			Scanner sc = new Scanner(System.in);
			DecimalFormat f = new DecimalFormat("R$ ###0.0");
			
			for(int i = 0 ; i < 4 ; i++) {
				System.out.println("--- Estoque do armazém ( " + (i + 1) + " ) ---");
				
				for(int j = 0 ; j < 3; j++) {
					System.out.print("--- Informe a quantidade em estoque do produto ( "
							+ (j + 1) + "): ");
					armazem[i][j] = sc.nextInt();
					sumProd[i] += armazem[i][j];
					sumEst[j] += armazem[i][j];
				}
			}
			
			
			System.out.println("\n---------- CUSTO DE CADA PRODUTO ----------");
			for(int i = 0 ; i < 3 ; i++) {
				System.out.print("--- Informe o custo do produto ( " + (i + 1) + " ): ");
				armazem[4][i] = sc.nextInt();
			}
			
			System.out.println("\n---------- QUANTIDADE DE ITENS EM CADA ARMAZÉM ----------");
			for(int i = 0 ; i < 4 ; i++) {
				System.out.println("--- Estoque no armazém ( " + (i + 1) + " ): " + sumProd[i]);
			}
			
			System.out.println("\n---------- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ----------");
			for(int i = 0 ; i < 4 ; i++) {
				if(armazem[i][1] > armazem[iMaiorP2][1]) {
					iMaiorP2 = i;
				}
			}
			System.out.println("--- Armazém ( " + (iMaiorP2 + 1) + " ) - Quantidade em estoque: "
					+ armazem[iMaiorP2][1]);
			
			System.out.println("\n---------- ARMAZÉM COM MENOR ESTOQUE ----------");
			for(int i = 0 ; i < 3 ; i++) {
				if(i == 0) {
					iMenorE = i;
				}
				
				if(sumProd[i] < sumProd[iMenorE]) {
					iMenorE = i;
				}
			}
			System.out.println("--- Armazém ( " + (iMenorE + 1) + " ) Quantidade em estoque: "
					+ sumProd[iMenorE]);
			
			System.out.println("\n---------- CUSTO TOTAL DE CADA PRODUTO ----------");
			for(int i = 0 ; i < 3 ; i++) {
				custoP[i] = sumEst[i] * armazem[4][i];
				System.out.println("--- Custo total do produto ( " + (i + 1) + " ): "
						+ f.format(custoP[i]));
			}
			
			System.out.println("\n---------- CUSTO TOTAL DE CADA ARMAZÉM ----------");
			for(int i = 0 ; i < 4 ; i++) {
				for(int j = 0 ; j < 3 ; j++) {
					custoE[i] += armazem[i][j] * armazem[4][j];
				}
				System.out.println("--- Custo total do armazém ( " + (i + 1) + " ): "
						+ f.format(custoE[i]));
			}
			sc.close();
		}
	}
