package section_19_introducao_generics.application;

import section_19_introducao_generics.services.PrintService;

import java.util.Scanner;

public class ProgramaGenerics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PrintService<Integer> printService = new PrintService<>();

        System.out.println("Digite algum valor: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            Integer valor = scanner.nextInt();
            printService.adicionarValor(valor);

        }

        printService.exibirPrint();
        System.out.println("Primeiro: " + printService.primeiro());
        
        scanner.close();
    }
}
