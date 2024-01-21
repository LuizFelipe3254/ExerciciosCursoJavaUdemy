package herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities;

import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.enums.Cor;

public class Retangulo extends Forma{
    private Double altura;
    private Double largura;

    public Retangulo(Cor cor, Double altura, Double largura) {
        super(cor);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double area() {
        return largura * altura;
    }
}
