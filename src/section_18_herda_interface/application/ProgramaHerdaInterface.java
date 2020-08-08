package section_18_herda_interface.application;

import section_18_herda_interface.model.entities.Circulo;
import section_18_herda_interface.model.entities.FormaAbstrata;
import section_18_herda_interface.model.enums.Cores;

import java.text.DecimalFormat;

public class ProgramaHerdaInterface {
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("##.##");

        FormaAbstrata formaAbstrata = new Circulo(Cores.LARANJA, 2.00);

        System.out.println("Cor: " + formaAbstrata.getCor() + " Tamanho: " + Math.abs(formaAbstrata.area()));
    }
}
