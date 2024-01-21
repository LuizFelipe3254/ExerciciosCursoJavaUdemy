package herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.services;

import herancaeAbstracao.abstratacaoExercicios.exercicioDemo.Programa.entities.Forma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema{
    static List<Forma> lista = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SistemaMethodos sM = new SistemaMethodos();

        System.out.print("Digite o número de formas: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Informações da forma #%s%n", i+1);
            sM.cadastrando(sM.registrarFormas(), sM.registrarCor());
            }
            System.out.println(sM.informacoes(lista));
        }
    }