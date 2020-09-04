package section_19_exercicio_resolvido.application;

import section_19_exercicio_resolvido.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ProgramaLogEntry {
    public static void main(String[] args) {

        String caminho = "src/section_19_exercicio_resolvido/log.txt";

        Set<LogEntry> set = new HashSet<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(caminho))) {

            String linha = bufferedReader.readLine();
            while (linha != null) {
                String[] campos = linha.split(" ");
                String nome = campos[0];
                Date data = Date.from(Instant.parse(campos[1]));

                set.add(new LogEntry(nome, data));

                linha = bufferedReader.readLine();
            }

            // Exibir quantos nomes ( sem repetição ) existe no arquivo de Log
            System.out.println("Total de nomes: " + set.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
