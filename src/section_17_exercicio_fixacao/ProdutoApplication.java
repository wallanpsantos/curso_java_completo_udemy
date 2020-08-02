package section_17_exercicio_fixacao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutoApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        // Caminho do arquivo: src/section_17_exercicio_fixacao/arquivos/Produtos.csv
        String caminho = scanner.nextLine();

        File file = new File(caminho);
        final boolean mkdir = new File(file.getParent() + "\\out").mkdir();
        String arquivoAlvo = file.getParent() + "\\out\\resumo.csv";

        List<ProdutoEntity> listaProdutos = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {

            String linhaCsv = bufferedReader.readLine();

            while (linhaCsv != null) {

                String[] campos = linhaCsv.split(";");
                String nome = campos[0];
                Double preco = Double.parseDouble(campos[1]);
                Integer quantidade = Integer.parseInt(campos[2]);

                listaProdutos.add(new ProdutoEntity(nome, preco, quantidade));

                linhaCsv = bufferedReader.readLine();
            }
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivoAlvo))) {
                for (ProdutoEntity produtoEntity : listaProdutos) {
                    bufferedWriter.write(produtoEntity.getNome() + "; " + produtoEntity.total());
                    bufferedWriter.newLine();
                }
            } catch (IOException e) {
                System.out.println("Erro ao escrever novo arquivo " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + e.getMessage());
        }

        scanner.close();
    }
}
