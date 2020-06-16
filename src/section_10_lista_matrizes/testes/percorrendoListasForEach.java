package section_10_lista_matrizes.testes;

public class percorrendoListasForEach {
    public static void main(String[] args) {
        String[] vect = new String[]{"Java", "Unity", "Flutter"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        
        System.out.println("\n");

        for (String obj : vect) {
            System.out.println(obj);
        }

    }
}
