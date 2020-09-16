package section_18_herda_interface.model.entities;

import section_18_herda_interface.model.enums.Cores;

public class Circulo extends FormaAbstrata {

    private Double radius;

    public Circulo(Cores cor, Double radius) {
        super(cor);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }
}
