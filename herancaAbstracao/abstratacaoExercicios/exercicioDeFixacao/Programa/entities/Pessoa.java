package herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities;

public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    public abstract Double calcularImposto();

    public String getNome() {
        return nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }
}
