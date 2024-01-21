package herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities;

import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.enums.Cor;

public abstract class Forma {
    private Cor cor;

    public Forma(Cor cor) {
        this.cor = cor;
    }

    public abstract double area();

    public Cor getCor() {
        return cor;
    }
}
