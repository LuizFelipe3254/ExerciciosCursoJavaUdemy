package herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities;

import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.enums.Cor;

public class Circulo extends Forma{
    private  Double raio;
    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }
}
