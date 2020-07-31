package section_17_manipulando_pastas;

import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caminho do diretorio: ");
        String caminho = scanner.nextLine();

        File file = new File(caminho);

        File[] folders = file.listFiles(File::isDirectory);
        for (File folder : Objects.requireNonNull(folders)) {
            System.out.println(folder);
        }

        File[] filers = file.listFiles(File::isFile);
        for (File arquivo : Objects.requireNonNull(filers)) {
            System.out.println(arquivo);
        }

        boolean mkdir = new File(caminho + "\\pastaCriadaPeloJava").mkdir();
        if (mkdir) System.out.println("Pasta criada com sucesso");
        scanner.close();
    }
}
