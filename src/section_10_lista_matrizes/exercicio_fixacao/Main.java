package section_10_lista_matrizes.exercicio_fixacao;

import section_10_lista_matrizes.exercicio_fixacao.model.Quarto;

import java.util.Scanner;

/* Fazer exercicio da Aula 10 - Quartos para estudantes - página 18 da seção 10 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer qtdVagas = 10;

        Quarto[] quarto = new Quarto[qtdVagas];

        System.out.print("Quantidade de estudantes? ");
        Integer qtdEstaudantes = scanner.nextInt();

        for (int i = 1; i <= qtdEstaudantes; i++) {
            System.out.println("Rent #" + i);
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("E-mail: ");
            String email = scanner.next();
            System.out.print("Qual quarto de 0 a 9: ");
            quarto[scanner.nextInt()] = new Quarto(nome, email);
        }

        for (int i = 0; i < quarto.length; i++) {
            if (quarto[i] != null) {
                System.out.println("Quarto #" + i + ": " + quarto[i].getNome() + ", " + quarto[i].getEmail());
            }
        }
    }
}
