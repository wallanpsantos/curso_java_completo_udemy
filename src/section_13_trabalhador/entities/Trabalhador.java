package section_13_trabalhador.entities;

import section_13_trabalhador.entities.enums.NiveisTrabalho;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NiveisTrabalho niveisTrabalho;
    private Double salario;

    private Departamento departamento;
    private List<ContratoHora> contratoHoras = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NiveisTrabalho niveisTrabalho, Double salario, Departamento departamento) {
        this.nome = nome;
        this.niveisTrabalho = niveisTrabalho;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NiveisTrabalho getNiveisTrabalho() {
        return niveisTrabalho;
    }

    public void setNiveisTrabalho(NiveisTrabalho niveisTrabalho) {
        this.niveisTrabalho = niveisTrabalho;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<ContratoHora> getContratoHoras() {
        return contratoHoras;
    }

    public void setContratoHoras(List<ContratoHora> contratoHoras) {
        this.contratoHoras = contratoHoras;
    }

    public void adicionarContratoHora(ContratoHora contratoHora) {
        // pega lista de contratoHoras e adiciona o contratoHora
        contratoHoras.add(contratoHora);
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", niveisTrabalho=" + niveisTrabalho +
                ", salario=" + salario +
                ", departamento=" + departamento.getNome() +
                '}';
    }

    public void removerContrato(ContratoHora contratoHora) {
        contratoHoras.remove(contratoHora);
    }

    public Double rendimento(Integer mes, Integer ano) {
        Double soma = salario;
        Calendar calendar = Calendar.getInstance();
        for (ContratoHora contratoHora : contratoHoras) {
            calendar.setTime(contratoHora.getData());
            Integer anoContrato = calendar.get(Calendar.YEAR);
            Integer mesContrato = 1 + calendar.get(Calendar.MONTH);

            if (ano.equals(anoContrato) && mes.equals(mesContrato)) {
                soma += contratoHora.valorTotal();
            }
        }
        return soma;
    }
}
