package section_19_usando_map;

import java.util.Map;
import java.util.TreeMap;

public class ProgramaMap {
    public static void main(String[] args) {

        Map<String, String> shinobis = new TreeMap<>();

        shinobis.put("Nome", "Madara");
        shinobis.put("Vila", "Konoha");
        shinobis.put("Força", "12000");


        shinobis.remove("forca");

        shinobis.put("Nome", "Hashirama");

        for (String chave : shinobis.keySet()) {
            System.out.println(chave + " : " + shinobis.get(chave));
        }

        System.out.println("Existe a chave 'nome' no map shinobis? " + shinobis.containsKey("Nome"));
    }
}
