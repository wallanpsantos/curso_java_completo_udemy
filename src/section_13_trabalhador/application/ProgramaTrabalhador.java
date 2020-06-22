package section_13_trabalhador.application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaTrabalhador {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com nome departamento: ");
        String nomeDepartamento = scanner.nextLine();
    }
}
