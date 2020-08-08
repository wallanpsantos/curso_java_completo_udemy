package section_18_ler_e_ordenar_arquivo.application;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaLerOrdenar {
    public static void main(String[] args) {

        File file = new File("src/section_18_ler_e_ordenar_arquivo");
        String nomeDesordenado = "nomes.txt";
        String nomeOrdenado = "nomesOrdenados.txt";

        List<String> lista = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file + "/" + nomeDesordenado))) {

            String linha = bufferedReader.readLine();

            while (linha != null) {
                lista.add(linha);
                linha = bufferedReader.readLine();
            }
            Collections.sort(lista);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file + "/" + nomeOrdenado))) {

            File novoArquivoFile = new File(file + "/" + nomeOrdenado);
            final boolean newFile = novoArquivoFile.createNewFile();

            for (String nome : lista) {
                bufferedWriter.write(nome);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
