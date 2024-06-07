package Classes;

import java.time.LocalDate;

public class Pintura extends Obra{
    String escola;
    String tipo;

    public Pintura(int id, LocalDate data, String artista, String escola, String tipo){
        super(id, data, artista);
        this.escola = escola;
        this.tipo = tipo;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pintura{" +
                "escola='" + escola + '\'' +
                ", tipo='" + tipo + '\'' +
                ", id=" + id +
                ", data=" + data +
                ", artista='" + artista + '\'' +
                '}';
    }
}
