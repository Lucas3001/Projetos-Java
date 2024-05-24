package fila;

import entidades.Mensagem;

public class FilaMensagens {

	private int capacidade;
    private Mensagem[] elementos;
    private int inicio;
    private int fim;
    private int total;

    public FilaMensagens(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Mensagem[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.total = 0;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean isFull() {
        return total == capacidade;
    }

    public void enqueue(Mensagem mensagem) {
        if (!isFull()) {
            if (fim == capacidade - 1) {
                fim = -1;
            }
            elementos[++fim] = mensagem;
            total++;
        } 
    }

    public Mensagem dequeue() {
        if (!isEmpty()) {
            Mensagem mensagem = elementos[inicio++];
            if (inicio == capacidade) {
                inicio = 0;
            }
            total--;
            return mensagem;
        } 
        return null;
    }
	
}
