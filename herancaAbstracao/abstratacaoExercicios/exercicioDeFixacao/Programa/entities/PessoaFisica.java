package herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities;

import herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.services.Sistema;

import java.util.Scanner;

public class PessoaFisica extends Pessoa{
    Sistema sistema = new Sistema();
    Scanner scan = new Scanner(System.in);
    private Double gastoSaude;
    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    @Override
    public Double calcularImposto() {
        Double imposto = 0.0;
        if (getRendaAnual() >= 20000){
            imposto = getRendaAnual() * 0.25;
        }else {
            imposto = getRendaAnual() * 0.15;
        }
        if (gastoSaude > 0){
            imposto -= gastoSaude * 0.50;
        }
        return imposto;
    }

    public String toString(){
        return String.format("%s: R$%.2f%n", getNome(), calcularImposto());
    }
}
