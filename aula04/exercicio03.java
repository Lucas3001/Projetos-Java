package aula04;
import java.util.Scanner;
public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		int canal=0,canal4=0,canal5=0,canal7=0,canal12=0,numPessoas = 0,numTotal=0;
		
		System.out.print("Digite o número do canal:");
		canal=entrada.nextInt();
		while(canal!=4 && canal!=5 && canal!=7 && canal!=12) {
			System.out.print("Digita o número do canal corretamente:");
			canal=entrada.nextInt();
		}
		if (canal==4) {
			System.out.print("Digite o número de pessoas:");
			numPessoas=entrada.nextInt();
			canal4=canal4+numPessoas;
		}
		if(canal==5) {
			System.out.print("Digite o número de pessoas:");
			numPessoas=entrada.nextInt();
			canal5=canal5+numPessoas;
		}
		if(canal==7) {
			System.out.print("Digite o número de pessoas:");
			numPessoas=entrada.nextInt();
			canal7=canal7+numPessoas;
		}
		if(canal==12) {
			System.out.print("Digite o número de pessoas:");
			numPessoas=entrada.nextInt();
			canal12=canal12+numPessoas;
		}
		numTotal+=numPessoas;
		
		if(numTotal!=0) {
			System.out.println("Canal 4:" + (canal4/numTotal)*100 + "%");
			System.out.println("Canal 5:" + (canal5/numTotal)*100 + "%");
			System.out.println("Canal 7:" + (canal7/numTotal)*100 + "%");
			System.out.println("Canal 12:" + (canal12/numTotal)*100 + "%");
		}
	
	}	

}
