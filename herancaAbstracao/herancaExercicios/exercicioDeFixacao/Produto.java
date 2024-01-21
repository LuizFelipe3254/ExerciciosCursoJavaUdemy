package herancaeAbstracao.herancaExercicios.exercicioDeFixacao;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    static List<Produto> lista = new ArrayList<>();
    private final String nome;
    private final Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String etiquetaPreco(){
        return String.format("%s R$%.2f",nome,preco);
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Etiqueta Preço:\n");
        for (Produto p : lista){
            sb.append(etiquetaPreco());
        }
        return sb.toString();
    }
}
