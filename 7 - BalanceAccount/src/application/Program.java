package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the client name: ");
        String name = sc.nextLine();

        System.out.print("Type account: ");
        String type = sc.nextLine();

        System.out.print("Balance: ");
        Double balance = sc.nextDouble();

        Account conta = new Account(name,type,balance);

        System.out.println();
        System.out.println(conta);
        System.out.println();

        System.out.println("Actions");
        System.out.println();
        System.out.println("1 - Check balance");
        System.out.println("2 - Deposit value");
        System.out.println("3 - Withdraw value");
        System.out.println("4 - Quit");
        System.out.println();
        int action;

        do{
            action = sc.nextInt();

            switch (action){

                case 1:
                    System.out.println("Current Balance: " + conta.getBalance());
                break;

                case 2:
                    System.out.print("Insert value to deposit: ");
                    Double Deposit = sc.nextDouble();
                    conta.deposit(Deposit);
                    System.out.println("Balance after deposit: " + conta.getBalance());
                    break;

                case 3:
                    System.out.print("Insert value to withdraw: ");
                    Double withdraw = sc.nextDouble();

                    if(withdraw <= conta.getBalance()) {
                        conta.withdraw(withdraw);
                        System.out.println("Balance after withdraw: " + conta.getBalance());
                    }else{
                        System.out.println("Value is greater than total balance, try again.");
                    }
                    break;

                case 4:
                    System.out.println("Quiting...");
                    break;
                default:
                    System.out.println("Option inválid. Try again.");
                    break;
            }


        } while(action != 4);

        System.out.println();
        System.out.println(conta);

        sc.close();
    }
}
