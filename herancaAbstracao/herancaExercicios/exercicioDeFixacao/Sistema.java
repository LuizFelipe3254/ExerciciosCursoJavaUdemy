package herancaeAbstracao.herancaExercicios.exercicioDeFixacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scan = new Scanner(System.in);


        System.out.print("Digite o número de produtos: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Informações do produto #%d%n", i + 1);
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char escolha;
            do {
                escolha = scan.next().charAt(0);
                if (escolha != 'c' && escolha != 'C'&& escolha != 'u' &&  escolha != 'u'&& escolha != 'i' && escolha != 'I' ){
                    System.out.print("Digito inválido!\nRepita:");
                }
            } while (escolha != 'c' && escolha != 'C'&& escolha != 'u' &&  escolha != 'u'&& escolha != 'i' && escolha != 'I' );

            System.out.print("Nome: ");
            scan.nextLine();

            String nome = scan.nextLine();
            System.out.print("Preço: ");

            double preco = scan.nextDouble();
            scan.nextLine();

            if (escolha == 'i' || escolha == 'I'){
                System.out.print("Taxa: ");
                double taxa = scan.nextDouble();
                Produto.lista.add(new ProdutoImportado(nome, preco, taxa));
            } else if (escolha == 'u' || escolha == 'U') {
                System.out.print("Data de fabricação (dd/MM/YYYY): ");
                Date data = formatar.parse(scan.nextLine());
                Produto.lista.add(new ProdutoUsado(nome, preco, data));
            }else {
                Produto.lista.add(new Produto(nome, preco));
            }
        }
        for (Produto p : Produto.lista){
            System.out.println(p);
        }
    }
}
