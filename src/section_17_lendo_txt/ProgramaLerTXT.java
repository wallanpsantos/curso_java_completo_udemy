package section_17_lendo_txt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaLerTXT {
    public static void main(String[] args) {
        File file = new File("src\\section_17_lendo_txt\\herois.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado " + e);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
