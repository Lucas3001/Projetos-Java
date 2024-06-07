package Classes;

import java.time.LocalDate;

public class Escultura extends Obra{
    String material;

    public Escultura(int id, LocalDate data, String artista, String material){
        super(id, data, artista);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Escultura{" +
                "material='" + material + '\'' +
                ", id=" + id +
                ", data=" + data +
                ", artista='" + artista + '\'' +
                '}';
    }
}
