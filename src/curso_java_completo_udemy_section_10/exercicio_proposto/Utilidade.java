package curso_java_completo_udemy_section_10.exercicio_proposto;

public class Utilidade {

    private static Funcionario funcionario;

    public static Double ajusteSalario(Double porcentagem) {

        Double valorAjustado = funcionario.getSalario() + (funcionario.getSalario() + porcentagem);

        return valorAjustado;
    }
}
