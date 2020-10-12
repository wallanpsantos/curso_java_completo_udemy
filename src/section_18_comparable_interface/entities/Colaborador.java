package section_18_comparable_interface.entities;

public class Colaborador implements Comparable<Colaborador> {

    private String nome;
    private Double salario;

    public Colaborador(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    /**
     * Serve para comparar um objeto com outro objeto
     * Metodo para comparar nome de um colaborar desse objeto
     * com nome de colaborador de outro objeto.
     * <p>
     * Caso queria mudar para comparar por salario e
     * só mudar os campo nome por salario
     *
     * @param colaborador
     * @return
     */
    @Override
    public int compareTo(Colaborador colaborador) {
        /** caso queria descrecente coloque o sinal de -
         *  Exemplo: return -nome.compareTo(colaborador.getNome());
         */
        return nome.compareTo(colaborador.getNome());
    }
}
