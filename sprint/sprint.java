package sprint;

import java.util.Scanner;

public class sprint {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int dist1=0,dist2=0,dist3=0,dist4=0,dist5=0,dist6=0,dist7=0;
		String comando,com1,com2,com3,com4,com5,com6,com7;
		int i=0,continuar=1;
			
			
		System.out.print("Digite a potência da bateria do robô(2 de energia por quadrado, 150 é o mínimo para que ele se mantenha ligado):");
	double	bateria=entrada.nextDouble();
		while(bateria<150) {
			System.out.print("Bateria insuficiente, aumente a carga:");
			bateria=entrada.nextDouble();
		}
		do {
		
			
		System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
		comando=entrada.next().toUpperCase();
		
		while(!(comando.equalsIgnoreCase("FRENTE")) && !(comando.equalsIgnoreCase("TRÁS")) && 
				!(comando.equalsIgnoreCase("ESQUERDA")) && !(comando.equalsIgnoreCase("DIREITA"))) {
			
			System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
			comando=entrada.next().toUpperCase();
		}
		
		System.out.print("Digite a distância:");
		dist1=entrada.nextInt();
		
		if( dist1>14 && comando.equalsIgnoreCase("FRENTE")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist1>3 && !(comando.equalsIgnoreCase("FRENTE"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				} else {
					if(dist1<10) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!comando.equalsIgnoreCase("FRENTE")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				}
			}
		if(dist1>=10 || dist1<=14 && comando.equalsIgnoreCase("FRENTE")) {
			System.out.println("Continue após a verificação da bateria"); 
			i++;
			continuar++;
			bateria=bateria-(dist1*2);
		} 
		if(bateria<150) {
			System.out.println("Bateria insuficiente, robô desligando");
			System.exit(i);
		} else {
			System.out.println("Bateria suficiente, continue");
		}
		
		//CAMINHO
			
		if(i==1) {
			System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
			com1=entrada.next().toUpperCase();
			while(!(com1.equalsIgnoreCase("FRENTE")) && !(com1.equalsIgnoreCase("TRÁS")) && 
					!(com1.equalsIgnoreCase("ESQUERDA")) && !(com1.equalsIgnoreCase("DIREITA"))) {
				
				System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
				com1=entrada.next().toUpperCase();
			}
			System.out.print("Digite a distância:");
			dist2=entrada.nextInt();
			if( dist2>16 && com1.equalsIgnoreCase("DIREITA")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist2>3 && !(com1.equalsIgnoreCase("DIREITA"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				}else {
					if(dist2<10) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!com1.equalsIgnoreCase("DIREITA")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				} 
			} 
		if(dist2>=10 || dist2<=16 && com1.equalsIgnoreCase("DIREITA")) {
			System.out.println("Continue após a verificação da bateria"); 
			i++;
			continuar++;
			bateria=bateria-(dist2*2);
		}
		if(bateria<150) {
			System.out.println("Bateria insuficiente, robô desligando");
			System.exit(i);
		} else {
			System.out.println("Bateria suficiente, continue");
		}
		}
		
		//CAMINHO
		
		if(i==2) {
			System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
			com2=entrada.next().toUpperCase();
			while(!(com2.equalsIgnoreCase("FRENTE")) && !(com2.equalsIgnoreCase("TRÁS")) && 
					!(com2.equalsIgnoreCase("ESQUERDA")) && !(com2.equalsIgnoreCase("DIREITA"))) {
				
				System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
				com3=entrada.next().toUpperCase();
			}
			System.out.print("Digite a distância:");
			dist3=entrada.nextInt();
			if( dist3>17 && com2.equalsIgnoreCase("FRENTE")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist3>3 && !(com2.equalsIgnoreCase("FRENTE"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				} else {
					if(dist3<10) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!com2.equalsIgnoreCase("FRENTE")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				}
			}
		if(dist3>=10 || dist3<=14 && com2.equalsIgnoreCase("FRENTE")) {
			System.out.println("Continue após a verificação da bateria"); 
			i++;
			continuar++;
			bateria=bateria-(dist3*2);
		}
		if(bateria<150) {
			System.out.println("Bateria insuficiente, robô desligando");
			System.exit(i);
		} else {
			System.out.println("Bateria suficiente, continue");
		}
		}
		
		//CAMINHO
		
		if(i==3) {
			System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
			com3=entrada.next().toUpperCase();
			while(!(com3.equalsIgnoreCase("FRENTE")) && !(com3.equalsIgnoreCase("TRÁS")) && 
					!(com3.equalsIgnoreCase("ESQUERDA")) && !(com3.equalsIgnoreCase("DIREITA"))) {
				
				System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
				com3=entrada.next().toUpperCase();
			}
			System.out.print("Digite a distância:");
			dist4=entrada.nextInt();
			if( dist4>17 && com3.equalsIgnoreCase("ESQUERDA")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist4>3 && !(com3.equalsIgnoreCase("ESQUERDA"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				} else {
					if(dist4<10) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!com3.equalsIgnoreCase("ESQUERDA")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				}
			}
		if(dist4>=10 || dist4<=14 && com3.equalsIgnoreCase("ESQUERDA")) {
			System.out.println("Continue após a verificação da bateria"); 
			i++;
			continuar++;
			bateria=bateria-(dist4*2);
		}
		if(bateria<150) {
			System.out.println("Bateria insuficiente, robô desligando");
			System.exit(i);
		} else {
			System.out.println("Bateria suficiente, continue");
		}
		}
		
		//CAMINHO
		
		if(i==4) {
			System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
			com4=entrada.next().toUpperCase();
			while(!(com4.equalsIgnoreCase("FRENTE")) && !(com4.equalsIgnoreCase("TRÁS")) && 
					!(com4.equalsIgnoreCase("ESQUERDA")) && !(com4.equalsIgnoreCase("DIREITA"))) {
				
				System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
				com4=entrada.next().toUpperCase();
			}
			System.out.print("Digite a distância:");
			dist5=entrada.nextInt();
			if( dist5>14 && com4.equalsIgnoreCase("FRENTE")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist5>3 && !(com4.equalsIgnoreCase("FRENTE"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				} else {
					if(dist5<7) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!com4.equalsIgnoreCase("FRENTE")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				}
			}
		if(dist5>=7 || dist5<=11 && com4.equalsIgnoreCase("FRENTE")) {
			System.out.println("Continue após a verificação da bateria"); 
			i++;
			continuar++;
			bateria=bateria-(dist5*2);
		}
		if(bateria<150) {
			System.out.println("Bateria insuficiente, robô desligando");
			System.exit(i);
		} else {
			System.out.println("Bateria suficiente, continue");
		}
		}
		
		//CAMINHO
		
		if(i==5) {
			System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
			com5=entrada.next().toUpperCase();
			while(!(com5.equalsIgnoreCase("FRENTE")) && !(com5.equalsIgnoreCase("TRÁS")) && 
					!(com5.equalsIgnoreCase("ESQUERDA")) && !(com5.equalsIgnoreCase("DIREITA"))) {
				
				System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
				com5=entrada.next().toUpperCase();
			}
			System.out.print("Digite a distância:");
			dist6=entrada.nextInt();
			if( dist6>17 && com5.equalsIgnoreCase("DIREITA")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist6>3 && !(com5.equalsIgnoreCase("DIREITA"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				} else {
					if(dist6<10) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!com5.equalsIgnoreCase("DIREITA")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				}
			}
		if(dist6>=10 || dist6<=14 && com5.equalsIgnoreCase("DIREITA")) {
			System.out.println("Continue após a verificação da bateria"); 
			i++;
			continuar++;
			bateria=bateria-(dist6*2);
		}
		if(bateria<150) {
			System.out.println("Bateria insuficiente, robô desligando");
			System.exit(i);
		} else {
			System.out.println("Bateria suficiente, continue");
		}
		}
		
		//CAMINHO
		
		if(i==6) {
			System.out.print("Digite sua direção (Frente,Trás,Esquerda,Direita):");
			com6=entrada.next().toUpperCase();
			while(!(com6.equalsIgnoreCase("FRENTE")) && !(com6.equalsIgnoreCase("TRÁS")) && 
					!(com6.equalsIgnoreCase("ESQUERDA")) && !(com6.equalsIgnoreCase("DIREITA"))) {
				
				System.out.print("Digite a direção corretamente, siga os comandos digitados a cima:");
				com6=entrada.next().toUpperCase();
			}
			System.out.print("Digite a distância:");
			dist7=entrada.nextInt();
			if( dist7>17 && com6.equalsIgnoreCase("FRENTE")) {
				System.out.println("O robô colidiu");
				System.exit(i);
			} else {
				if(dist7>3 && !(com6.equalsIgnoreCase("FRENTE"))) {
					System.out.println("O robô colidiu");
					System.exit(i);
				} else {
					if(dist7<7) {
						System.out.println("Distância insuficiente, possível colisão detectada para desviar o robô, robô sendo desligado por motivos de segurança.");
						System.exit(i);
					} else {
						if(!com6.equalsIgnoreCase("FRENTE")){
							System.out.println("Direção errada, desligando o robô para economizar energia");
							System.exit(i);
						}
					}
				}
			}
		if(dist7>=7 || dist7<=9 && com6.equalsIgnoreCase("FRENTE")) {
			System.out.println("Parabéns, você chegou ao seu destino"); 
			i++;
			continuar--;
		}
		}
		}while(i<continuar);

	}

}
