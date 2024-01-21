package herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.services;

import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities.Circulo;
import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities.Forma;
import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities.Retangulo;
import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.enums.Cor;

import java.util.List;
import java.util.Scanner;

public class SistemaMethodos extends Sistema{
    Scanner scan = new Scanner(System.in);
    public char registrarFormas() {
            char escolha;
            System.out.print("Retangulo ou Circulo (r/c)? ");

            do {
                escolha = scan.next().charAt(0);
                if (escolha != 'r' && escolha != 'R' && escolha != 'c' && escolha != 'C') {
                    System.out.printf("Opção inválida!%nDigite Novamente: ");
                }
            } while (escolha != 'r' && escolha != 'R' && escolha != 'c' && escolha != 'C');
            return escolha;
    }
    public int registrarCor(){
        int cor;
        System.out.print("Digite o número da cor (PRETO(1)/AZUL(2)/VERMELHO(3)): ");
        do {
            cor = scan.nextInt();
            if (cor != 1 && cor != 2 && cor != 3){
                System.out.printf("Número inválido!%nDigite Novamente: ");
            }
        }while (cor != 1 && cor != 2 && cor != 3);
        return cor;
    }
    public void cadastrando(char escolha, int cor){;
        if(escolha == 'r'  || escolha == 'R'){
            System.out.print("Altura: ");
            double altura = scan.nextDouble();
            System.out.print("Largura: ");
            double largura = scan.nextDouble();

            lista.add(new Retangulo(Cor.values()[cor-1],altura, largura));
        }else {
            System.out.print("Raio: ");
            double raio = scan.nextDouble();
            lista.add(new Circulo(Cor.values()[cor-1], raio));
        }
    }
    public String informacoes(List<Forma> lista){
        StringBuilder sb = new StringBuilder();
        sb.append("Área da(s) forma(s):\n");
        for(Forma x : lista){
            if (x instanceof Retangulo){
                sb.append(String.format("Area do retângulo %s: %.2f%n", x.getCor(),x.area()));
            }else{
                sb.append(String.format("Area do círculo %s: %.2f%n", x.getCor() ,x.area()));
            }
        }
        return sb.toString();
    }
}
