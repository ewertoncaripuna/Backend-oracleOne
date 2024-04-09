package br.com.alura;

public class CalculatorRoomRect implements CalculateGeometric{


    @Override
    public void calcArea(double height, double width) {
        double area = height * width;
        System.out.println("The area room retangle is " + String.format("%.2f",area));
    }

    @Override
    public void calculatePerimeter(double height, double width) {
        double perimeter = 2 * (height + width);
        System.out.println("The piremeter room is " + String.format("%.2f",perimeter));
    }
}



