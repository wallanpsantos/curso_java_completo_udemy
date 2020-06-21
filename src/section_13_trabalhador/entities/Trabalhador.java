package section_13_trabalhador.entities;

import section_13_trabalhador.entities.enums.NiveisTrabalho;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NiveisTrabalho niveisTrabalho;
    private Double salario;
    private List<ContratoHora> contratoHoras = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NiveisTrabalho niveisTrabalho, Double salario) {
        this.nome = nome;
        this.niveisTrabalho = niveisTrabalho;
        this.salario = salario;
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

    public void adicionarContrato(ContratoHora contratoHora) {
        // pega lista de contratoHoras e adiciona o contratoHora
        contratoHoras.add(contratoHora);
    }
}
