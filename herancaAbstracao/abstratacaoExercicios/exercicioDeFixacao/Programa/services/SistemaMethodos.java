package herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.services;

import herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities.Pessoa;
import herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities.PessoaFisica;
import herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities.PessoaJuridica;

import java.util.Scanner;

public class SistemaMethodos extends Sistema{
    Sistema sistema = new Sistema();
    Scanner scan = new Scanner(System.in);
    public Integer escolha(){
        Integer c;
        System.out.printf("Digite o número se for Pessoa Fisica(1) ou Pessoa Juridica(2)? ");
        do {
            c = scan.nextInt();
            if (c != 1 && c != 2){
                System.out.printf("Número Inválido!%nDigite Novamente: ");
            }
        }while (c != 1 && c != 2);
        return c;
    }
    //Registrar Pessoa Fisica.
    public void registrarPessoaFisica(){
        Double rendaAnual = 0.0;
        Double gastoSaude = 0.0;
        System.out.print("Nome: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.print("Renda Anual: ");
        do {
            rendaAnual = scan.nextDouble();
            if (rendaAnual <= 0){
                System.out.printf("Renda Anual não pode ser negativo ou igual 0%nDigite Novamente: ");
            }
        }while (rendaAnual <= 0);
        System.out.print("Gastos com saúde: ");
        do {
            gastoSaude = scan.nextDouble();
            if (gastoSaude < 0){
                System.out.print("Gasto de Saúde não pode ser negativo!\nDigite Novamente: ");
            }
        }while (gastoSaude < 0);
        sistema.pessoas.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
    }
    //Registrando Pessoa Juridica.
    public void registrarPessoaJuridica(){
        Double rendaAnual = 0.0;
        Integer numeroDeFuncionarios;
        System.out.print("Nome: ");
        scan.nextLine();
        String nome = scan.nextLine();
        System.out.print("Renda Anual: ");

        do {
            rendaAnual = scan.nextDouble();
            if (rendaAnual <= 0){
                System.out.printf("Renda Anual não pode ser negativo ou igual 0%nDigite Novamente: ");
            }
        }while (rendaAnual <= 0);

        System.out.print("Número de funcionarios: ");
        do{
            numeroDeFuncionarios = scan.nextInt();
            if (numeroDeFuncionarios < 0){
                System.out.printf("Número de funcionarios não pode ser negativo!%nDigite Novamente:");
            }
        }while (numeroDeFuncionarios < 0);
        sistema.pessoas.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
    }
    //Total de todos os impostos pagos.
    public Double impostoTotal(){
        Double imposto = 0.0;
        System.out.println("Imposto Pago:");
        for(Pessoa x : pessoas){
            imposto += x.calcularImposto();
            System.out.print(x);
        }
        return imposto;
    }

}
