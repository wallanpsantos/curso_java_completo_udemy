package section_18_comparable_interface.application;

import section_18_comparable_interface.entities.Colaborador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramaComparable {
    public static void main(String[] args) {

        List<Colaborador> colaboradores = new ArrayList<>();
        String path = "src/section_18_comparable_interface/nome_colaboradores.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String linha = bufferedReader.readLine();

            while (linha != null) {
                String[] campos = linha.split(",");
                colaboradores.add(new Colaborador(campos[0], Double.parseDouble(campos[1])));
                linha = bufferedReader.readLine();
            }
            Collections.sort(colaboradores);

            /**
             * Vai imprimir na tela a comparação de acordo
             * com o metodo compareTo da classe Colaborador
             *
             *  que no caso está por ordem de nome
             */
            for (Colaborador colaborador : colaboradores) {
                System.out.println(colaborador.getNome() + " " + colaborador.getSalario());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
