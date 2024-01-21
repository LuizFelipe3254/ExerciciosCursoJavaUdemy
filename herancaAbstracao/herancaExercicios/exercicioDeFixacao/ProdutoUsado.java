package herancaeAbstracao.herancaExercicios.exercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
    private final Date dataDeFabricacao;

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String etiquetaPreco(){
        return String.format("%s (Usado) R$%.2f (Data de fabricação: %s%n)",getNome(), getPreco(), formatar.format(dataDeFabricacao));
    }
    @Override
    public String toString(){
        return String.format("%s", etiquetaPreco());
    }
}
