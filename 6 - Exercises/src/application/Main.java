package application;

public class Main {
    public static void main(String[] args) {

        //AVERAGE GRADE
        double firstGrade = 8.9;
        double secondGrade = 7.5;
        double average = (firstGrade + secondGrade) / 2;
        System.out.println("Average: " + average);
        System.out.println("--------------------------------------------------------------------");
        //CASTING
        double numberToDouble = 9.8;
        int numberToInt = (int) numberToDouble;
        System.out.println("Casting double to int: " + numberToInt);
        System.out.println("--------------------------------------------------------------------");
        //CONCAT
        char letter = 'E';
        String word = "werton";
        String message = "My name is " + letter + word;
        System.out.println(message);
        System.out.println("--------------------------------------------------------------------");
        //PRODUCT
        double productPrice = 1.99;
        int quantity = 3;
        double total = productPrice * quantity;
        String messageProduct = "The price total is R$" + total;
        System.out.println(messageProduct);
        System.out.println("--------------------------------------------------------------------");
        //CONVERT DOLAR
        double valueInDolar = 50.00;
        double tax = 5.70;
        double valueInReal = valueInDolar * tax;
        System.out.println("The value in real is R$" + valueInReal);
        System.out.println("--------------------------------------------------------------------");
        //DISCOUNT
        double originalPrice = 100.0;
        double discountPercentage = 15.0;
        double discountValue = (discountPercentage / 100.0) * originalPrice;
        double newPrice = originalPrice - discountValue;

        System.out.println("Original price: R$" + originalPrice);
        System.out.println("Discount: R$" + discountValue);
        System.out.println("New price with discount: R$" + newPrice);

    }
    }



