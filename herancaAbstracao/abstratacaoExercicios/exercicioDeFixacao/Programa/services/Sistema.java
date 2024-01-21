package herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.services;

import herancaeAbstracao.abstratacaoExercicios.exercicioDeFixacao.Programa.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    static List<Pessoa>  pessoas = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SistemaMethodos sistemaMethodos = new SistemaMethodos();

        System.out.print("Insira o número de contribuentes: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Dados do contribuente #%d:%n", i+1);
            if (sistemaMethodos.escolha() == 1){
                sistemaMethodos.registrarPessoaFisica();
            }else {
                sistemaMethodos.registrarPessoaJuridica();
            }
        }
        System.out.printf("%nTotal de imposto pago:%nR$%.2f", sistemaMethodos.impostoTotal());
    }
}
