package exercicioDemo.Programa.services;

import exercicioDemo.Programa.Exceptions.DomainException;
import exercicioDemo.Programa.entities.Reserva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        try{
            System.out.print("Numero do quarto: ");
            int quarto = scan.nextInt();
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            Date dataDeEntrada = fmt.parse(scan.next());
            System.out.print("Data de saída (DD/MM/YYYY): ");
            Date datadeSaida = fmt.parse(scan.next());
            Reserva reserva = new Reserva(quarto,dataDeEntrada, datadeSaida);
            System.out.println("Reserva: " + reserva);

            System.out.println("\nAtualizar datas: ");
            System.out.print("Data de entrada (DD/MM/YYYY): ");
            dataDeEntrada = fmt.parse(scan.next());
            System.out.print("Data de saída (DD/MM/YYYY): ");
            datadeSaida = fmt.parse(scan.next());
            reserva.atualizarDatas(dataDeEntrada, datadeSaida);
            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e){
            System.out.println("Data inválida!");
        }
        catch (DomainException e){
            System.out.println("Erro na reserva: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Digite apenas números!");
        }
    }

}
