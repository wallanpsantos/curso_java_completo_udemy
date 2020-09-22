package section_20_lambda_comparator_consumer.application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProgramaOrdenaData {

    public static void main(String[] args) {

        System.out.println(listaDatas());

    }

    private static List<String> listaDatas() {

        List<String> listaData = new ArrayList<>();

        listaData.add("12/03/2013 23:11:59");
        listaData.add("12/03/2175 12:19:21");
        listaData.add("12/03/2010 17:59:44");

        listaData.sort(Comparator.comparing(String::toUpperCase));

        return listaData;
    }
}

