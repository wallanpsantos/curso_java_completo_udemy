package section_10_lista_matrizes.exercicio_fixacao.model;

public class Quarto {

    String nome;
    String email;

    public Quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Quarto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
