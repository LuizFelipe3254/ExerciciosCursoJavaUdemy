package exercicioDeFixacao.services;

import exercicioDeFixacao.entities.Account;
import exercicioDeFixacao.exceptions.WithdrawException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



        try {
            System.out.println("Enter account data:");
            System.out.print("Number: ");
            Integer number = scan.nextInt();
            System.out.print("Holder: ");
            scan.nextLine();
            String holder = scan.nextLine();
            System.out.print("initial balance: ");
            Double balance = scan.nextDouble();
            System.out.print("withdraw limit: ");
            Double withdrawLimit = scan.nextDouble();
            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.print("\nEnter amount for withdraw: ");
            acc.withdraw(scan.nextDouble());
            System.out.println("New balance: " + acc);
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido!");
        } catch (WithdrawException e) {
            System.out.println("Withdraw erro: " + e.getMessage());
        }
    }
}