package Classes;

import java.time.LocalDate;

public abstract class Obra {
    int id;
    LocalDate data;
    String artista;

    //public Obra(){}

    public Obra(int id, LocalDate data, String artista){
        this.artista = artista;
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Obra{" +
                "id=" + id +
                ", data=" + data +
                ", artista='" + artista + '\'' +
                '}';
    }
}
