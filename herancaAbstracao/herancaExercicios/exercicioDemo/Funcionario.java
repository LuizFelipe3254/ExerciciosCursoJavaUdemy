package herancaeAbstracao.herancaExercicios.exercicioDemo;

public class Funcionario {
    private final String nome;
    private final Integer horas;
    private final Double valorPorHora;


    public Funcionario(String nome, Integer horas, Double valorPorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }




    public double pagamento(){
        return horas * valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorPorHora() {
        return valorPorHora;
    }
}