package section_13_trabalhador.application;

import section_13_trabalhador.entities.ContratoHora;
import section_13_trabalhador.entities.Departamento;
import section_13_trabalhador.entities.Trabalhador;
import section_13_trabalhador.entities.enums.NiveisTrabalho;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramaTrabalhador {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com nome departamento: ");
        String nomeDepartamento = scanner.nextLine();

        System.out.println(" ==== Entre dados trabalhador ===");
        System.out.println("Nome: ");
        String nomeTrabalhador = scanner.nextLine();
        System.out.println("Nivel: ");
        String nivelTrabalhador = scanner.nextLine();
        System.out.println("Salario base: ");
        Double salarioBaseTrabalhador = scanner.nextDouble();

        Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NiveisTrabalho.valueOf(nivelTrabalhador), salarioBaseTrabalhador, new Departamento(nomeDepartamento));

        System.out.println("Quantos contratos para esse trabalhador: ");
        Integer qtdContratos = scanner.nextInt();

        for (int i = 0; i < qtdContratos; i++) {
            System.out.println("Digite a data do " + i + "º contrato");
            System.out.print("Data (DD/MM/YYY): ");
            Date dataContrato = simpleDateFormat.parse(scanner.next());
            System.out.print("\nDigite valor por hora: ");
            Double valorPorHora = scanner.nextDouble();
            System.out.print("\nDuração (Hora): ");
            Integer duracaoHora = scanner.nextInt();
            ContratoHora contratoHora = new ContratoHora(dataContrato, valorPorHora, duracaoHora);

            trabalhador.adicionarContratoHora(contratoHora);
        }

        System.out.println("\nDigite o mês e ano (MM/YYYY) para calculcar a renda: ");
        String mesAno = scanner.next();
        Integer mes = Integer.parseInt(mesAno.substring(0, 2));
        Integer ano = Integer.parseInt(mesAno.substring(3, 7));
        System.out.println("Nome: " + trabalhador.getNome());
        System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
        System.out.println("Renda para " + mesAno + ": " + String.format("%.2f", trabalhador.rendimento(mes, ano)));


        System.out.println("\n" + trabalhador.toString());
        scanner.close();
    }
}
