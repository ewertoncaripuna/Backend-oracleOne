package br.com.alura.application;

import br.com.alura.entities.Address;
import br.com.alura.entities.Cep;

import java.util.Scanner;

public class Program {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit_chars = 9;

        System.out.print("Please insert cep number to search: ");
        String cep = sc.nextLine();

        if(cep.length() < limit_chars ) {
            Cep input = new Cep();
            Address addr = input.checkCep(cep);

            System.out.println(addr);

        }else{
            System.out.println("Must be insert an valid cep, with 8 characters.");
        }
        sc.close();
    }


}
