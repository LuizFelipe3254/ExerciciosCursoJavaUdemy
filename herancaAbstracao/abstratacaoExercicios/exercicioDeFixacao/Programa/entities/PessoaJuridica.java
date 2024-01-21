package herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities;

import herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.services.Sistema;

import java.util.Scanner;

public class PessoaJuridica extends Pessoa{
    Sistema sistema = new Sistema();
    Scanner scan = new Scanner(System.in);
    private Integer numeroDeFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double calcularImposto() {
        Double imposto = 0.0;
        if (numeroDeFuncionarios > 10){
            imposto = getRendaAnual() * 0.14;
        }else {
            imposto = getRendaAnual() * 0.16;
        }
        return imposto;
    }

    public String toString(){
        return String.format("%s: R$%.2f%n", getNome(), calcularImposto());
    }
}
