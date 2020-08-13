package section_18_herda_interface.model.entities;

import section_18_herda_interface.model.enums.Cores;

public abstract class FormaAbstrata implements Forma {

    private Cores cor;

    public FormaAbstrata(Cores cor) {
        this.cor = cor;
    }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }
}
