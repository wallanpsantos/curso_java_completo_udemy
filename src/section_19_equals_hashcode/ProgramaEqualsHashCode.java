package section_19_equals_hashcode;

import section_19_equals_hashcode.Entities.Pessoa;

public class ProgramaEqualsHashCode {
    public static void main(String[] args) {


        Pessoa p1 = new Pessoa("Wallan", "wallanpereira09");
        Pessoa p2 = new Pessoa("Wallan", "wallanpereira09");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println();

        /**
         * Sempre use equals para comparar dois objetos pelo seu conteudo de igualdade
         * */
        System.out.println(p1.equals(p2));

        /* == usado para comparar a referencia na memoria dos objetos
         *  Não compara o conteudo e sim as referencia de memoria
         *  Na memoria RAP foram alocados em memorias direntes, mesmo tendo o mesmo conteudo
         * */
        System.out.println(p1.toString() == p2.toString());

        String t1 = "Teste";
        String t2 = "Teste";

        // True porque o compilador trata a expressão literal
        System.out.println(t1 == t2);

    }
}
