package section_17_escrevendo_txt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaEscreverNoTXT {
    public static void main(String[] args) {
        String[] listaHerois = new String[]{"Visão", "Viuva Negra"};

        String pathHeroi = "src\\section_17_escrevendo_txt\\herois.txt";

        // parametro TRUE indica que não queremo recriar o arquivo e sim adicionar mais informações
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathHeroi, true))) {
            for (String linha : listaHerois) {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
