package aplicacao;

import java.util.Scanner;

import entidades.Mensagem;
import fila.FilaMensagens;

public class AtendimentoMensagem {
	/* Lucas Henrique Carrascosa, RM: 99883
	 * Samuel de Paula Santolim, RM: 99115
	 * Isaac Maranho Destro, RM: 97847
	 * Rafael Gomes de Freitas, RM: 98838
	 * Pedro Reginato, RM: 550896
	 */
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 FilaMensagens filaReclamacao = new FilaMensagens(100);
	     FilaMensagens filaSugestao = new FilaMensagens(100);
	     FilaMensagens filaResolucao = new FilaMensagens(100);

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("0. Encerrar o programa");
            System.out.println("1. Receber mensagem");
            System.out.println("2. Atender mensagem");
            System.out.println("3. Receber e encaminhar resolução");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
            case 0:
                if (!filaReclamacao.isEmpty() || !filaSugestao.isEmpty() || !filaResolucao.isEmpty()) {
                    System.out.println("Não é possível encerrar o programa com mensagens pendentes.");
                    System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                    sc.nextLine();
                    opcao = 5;
                    break;
                }
                System.out.print("Encerrando o programa...");
                break;
            case 1:
                receberMensagem(filaReclamacao, filaSugestao);
                break;
            case 2:
                atenderMensagem(filaReclamacao, filaSugestao, filaResolucao);
                break;
            case 3:
                encaminharResolucao(filaResolucao);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                sc.nextLine();
                break;
            }
        } while (opcao != 0);
    }

    private static void receberMensagem(FilaMensagens filaReclamacao, FilaMensagens filaSugestao) {
    	System.out.println("Recebendo mensagem...");
        System.out.print("Nome (opcional): ");
        String nome = sc.nextLine();
        if (nome.isEmpty()) {
            nome = null; 
        }
        System.out.print("Email/Telefone: ");
        String emailTelefone = sc.nextLine();
        System.out.print("Motivo do contato (1-reclamação/ 2-sugestão): ");
        int motivo = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Mensagem (texto): ");
        String texto = sc.nextLine();

        if (emailTelefone.isEmpty() || (motivo != 1 && motivo != 2) || texto.isEmpty()) {
            System.out.println("Dados incompletos/incorretos. Mensagem não foi enviada.");
            System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
            sc.nextLine();
        } else {
        	System.out.println("Mensagem enviada com sucesso.");
        	System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
        	sc.nextLine();
            Mensagem mensagem = new Mensagem(nome, emailTelefone, motivo, texto);
            if (motivo == 1) {
                filaReclamacao.enqueue(mensagem);
            } else {
                filaSugestao.enqueue(mensagem);
            }
        }
    }
    private static void atenderMensagem(FilaMensagens filaReclamacao, 
    		FilaMensagens filaSugestao, FilaMensagens filaResolucao) {
        System.out.println("Atendendo mensagem...");
        System.out.print("Tipo de mensagem a ser atendida (1-reclamação/ 2-sugestão): ");
        int tipoMensagem = sc.nextInt();
        sc.nextLine(); 
        if (tipoMensagem == 1) {
            Mensagem mensagem = filaReclamacao.dequeue();
            if (mensagem != null) {
            	if(mensagem.getNome() != null) {
            		System.out.println("\nCliente: " + mensagem.getNome());            		
            	} else {
            		System.out.println("\nCliente optou por não se identificar.");
            	}
            	System.out.println("Forma de contato: " + mensagem.getEmailTelefone());
                System.out.println("Mensagem atendida: " + mensagem.getTexto());
                System.out.println("****** FIM DA MENSAGEM ******");
                System.out.print("Deseja encaminhar a mensagem para o setor de resolução? (s/n): ");
                String resposta = sc.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    filaResolucao.enqueue(mensagem);
                    System.out.println("Mensagem encaminhada para o setor de resolução, aguarde contato. Obrigado.");
                    System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                    sc.nextLine();
                } else {
                	System.out.println("Resposta enviada para o cliente: "
                			+ "Sua solicitação já foi resolvida. Obrigado!!!");   
                	System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                	sc.nextLine();
                }
            } else {
                System.out.println("Não há reclamações na fila para atendimento.");
                System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                sc.nextLine();
            }
        } else if (tipoMensagem == 2) {
            Mensagem mensagem = filaSugestao.dequeue();
            if (mensagem != null) {
            	if(mensagem.getNome() != null) {
            		System.out.println("\nCliente: " + mensagem.getNome());            		
            	} else {
            		System.out.println("\nCliente optou por não se identificar.");
            	}
            	System.out.println("Forma de contato: " + mensagem.getEmailTelefone());
                System.out.println("Mensagem atendida: " + mensagem.getTexto());
                System.out.println("****** FIM DA MENSAGEM ******");
                System.out.print("\nDeseja encaminhar a mensagem para o setor de resolução? (s/n): ");
                String resposta = sc.nextLine(); 
                if (resposta.equalsIgnoreCase("s")) {
                    filaResolucao.enqueue(mensagem);
                    System.out.println("Mensagem encaminhada para o setor de resolução, aguarde contato. Obrigado.");
                    System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                    sc.nextLine();
                } else {
                	System.out.println("Resposta enviada para o cliente: "
                			+ "Sua solicitação já foi resolvida. Obrigado!!!");   
                	System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                	sc.nextLine();
                }               
            } else {
                System.out.println("Não há sugestões na fila para atendimento.");
                System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
                sc.nextLine();
            }
        } else {
            System.out.println("Tipo de mensagem inválido.");
            System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
            sc.nextLine();
        }
    }

    private static void encaminharResolucao(FilaMensagens filaResolucao) {
        System.out.println("Encaminhando resolução...");
        Mensagem mensagem = filaResolucao.dequeue();
        if (mensagem != null) {
        	if(mensagem.getNome() != null) {
        		System.out.println("\nCliente: " + mensagem.getNome());            		
        	} else {
        		System.out.println("\nCliente optou por não se identificar.");
        	}
        	System.out.println("Forma de contato: " + mensagem.getEmailTelefone());
            System.out.println("Mensagem enviada: " + mensagem.getTexto());
            System.out.println("****** FIM DA MENSAGEM ******");
            System.out.println("Resposta enviada para o cliente: "
            		+ "Sua solicitação já foi resolvida pelo setor responsável. Obrigado!!! ");
            System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
            sc.nextLine();
        } else {
            System.out.println("Não há mensagens pendentes de resolução.");
            System.out.print("\nRetornando ao menu... aperte ENTER para confirmar.");
            sc.nextLine();
        }
	}
}

