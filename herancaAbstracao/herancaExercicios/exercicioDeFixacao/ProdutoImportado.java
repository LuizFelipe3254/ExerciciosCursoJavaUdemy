package herancaeAbstracao.herancaExercicios.exercicioDeFixacao;

public class ProdutoImportado extends Produto{
    private final Double taxaAlfandega;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String etiquetaPreco(){
        return String.format("%s R$%.2f (Taxa: R$%.2f%n)",getNome(),getPreco(),valorTotal());
    }

    private Double valorTotal(){
        return getPreco() + taxaAlfandega;
    }
    @Override
    public String toString(){
        return String.format("%s",etiquetaPreco());
    }
}
