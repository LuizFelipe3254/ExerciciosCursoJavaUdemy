package herancaeAbstracao.herancaExercicios.exercicioDemo;

import java.util.ArrayList;
import java.util.List;

public final class Empresa{
    private final String nomeEmpresa="Teste";
    private List<Funcionario> funcionarios=new ArrayList<>();

    public Empresa() {
    }

    public void adicionarFuncionario(Funcionario add){
        funcionarios.add(add);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Pagamentos:\n");
        for (Funcionario x: funcionarios
        ) {
            sb.append(String.format("%s - R$%.2f\n", x.getNome(), x.pagamento()));
        }
        return sb.toString();
    }
}