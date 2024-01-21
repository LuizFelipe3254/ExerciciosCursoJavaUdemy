package herancaeAbstracao.herancaExercicios.exercicioDemo;

public class FuncionarioTerceirizados extends Funcionario {
    private final Double cargaAdicional;

    public FuncionarioTerceirizados(String nome, Integer horas, Double valorPorHora, Double cargaAdicional) {
        super(nome, horas, valorPorHora);
        this.cargaAdicional = cargaAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + cargaAdicional * 1.1;
    }
    @Override
    public String toString(){
        return String.format("%.2f%n", pagamento());
    }
}