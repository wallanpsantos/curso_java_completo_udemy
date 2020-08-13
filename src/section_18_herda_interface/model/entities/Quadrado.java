package section_18_herda_interface.model.entities;

import section_18_herda_interface.model.enums.Cores;

public class Quadrado extends FormaAbstrata {

    private Double largura;
    private Double altura;

    public Quadrado(Cores cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }
}
