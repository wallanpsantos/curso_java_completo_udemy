package section_17_manipulando_pastas;

import java.io.File;
import java.util.Scanner;

public class PegandoNomeArquivo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Digite nome do arquivo: ");

        // Cole no console => src/section_17_manipulando_pastas/marvel.json
        //String nomeArquivo = scan.nextLine();
        String nomeArquivo = "src/section_17_manipulando_pastas/marvel.json";

        File file = new File(nomeArquivo);

        // Pegando apenas o nome do arquivo
        System.out.println("getName() -> " + file.getName());

        // Pegando apenas o caminho
        System.out.println("getParent() -> " + file.getParent());

        // Todo o caminho
        System.out.println("getPath() -> " + file.getAbsolutePath());

        scan.close();
    }
}
