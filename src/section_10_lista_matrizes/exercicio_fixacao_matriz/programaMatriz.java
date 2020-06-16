package section_10_lista_matrizes.exercicio_fixacao_matriz;

import java.util.Scanner;

/**
 * @author Wallan Pereira
 * @since 26/05/2020
 * <p>
 * Fazer um programa para ler dois números inteiros M e N, e depois ler
 * uma matriz de M linhas por N colunas contendo números inteiros,
 * podendo haver repetições. Em seguida, ler um número inteiro X que
 * pertence à matriz. Para cada ocorrência de X, mostrar os valores à
 * esquerda, acima, à direita e abaixo de X, quando houver, conforme
 * exemplo.
 * <p>
 * Example
 * 3 4
 * 10 8 15 12
 * 21 11 23 8
 * 14 5 13 19
 * 8
 * Position 0,1:
 * Left: 10
 * Right: 15
 * Down: 11
 * Position 1,3:
 * Left: 23
 * Up: 12
 * Down: 19
 */
public class programaMatriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite valor de M: ");
        int m = scanner.nextInt();
        System.out.print("Digite valor de N: ");
        int n = scanner.nextInt();

        // Matriz com m linhas e n colunas
        int[][] matriz = new int[m][n];

        System.out.println("Monte a tabela " + m + "x" + n);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Escolha um número da tabela: ");
        int x = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Posição do número escolhido: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        scanner.close();
    }
}






















