package Classes;

public class Voto {

    private String nomePessoa;
    private String email;
    private String telefone;

    public Voto(){}

    public Voto(String nomePessoa, String email, String telefone){
        this.email = email;
        this.nomePessoa = nomePessoa;
        this.telefone = telefone;
    }
    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
