package application;

import entities.Temperature;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius to convert it to Fahrenheit: ");
        Double tempInCelsius = sc.nextDouble();
        Temperature temp = new Temperature(tempInCelsius);

        System.out.println(temp.convertToCelsius());


    sc.close();
    }


}
