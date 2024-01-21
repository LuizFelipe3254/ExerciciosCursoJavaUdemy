package herancaeAbstracao.herancaExercicios.exercicioDemo;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Empresa empresa = new Empresa();
        System.out.print("Digite o número de funcionarios: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Informações do funcionario #%s%n", i+1);
            System.out.println("Terceirizado (s/n)?: ");
            char c = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Horas: ");
            int horas = scan.nextInt();
            System.out.print("Valor por horas: ");
            double valorPorHora = scan.nextDouble();
            if (c == 's' || c == 'S') {
                System.out.print("Carga adicional: ");
                double cargaAdicional = scan.nextDouble();
                Funcionario funcionarioTerceirizado = new FuncionarioTerceirizados(nome, horas, valorPorHora,cargaAdicional);
                empresa.adicionarFuncionario(funcionarioTerceirizado);
            }else {
                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                empresa.adicionarFuncionario(funcionario);

            }
        }
        System.out.println(empresa);
        scan.close();
    }
}