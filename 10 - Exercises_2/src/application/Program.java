package application;
import br.com.alura.*;

public class Program {

    public static void main(String[] args) {

        CurrencyConvert convert = new CurrencyConvert();
        convert.convertDollarToReal(50.0);

        CalculatorRoomRect calculate = new CalculatorRoomRect();
        calculate.calcArea(30.4, 18);
        calculate.calculatePerimeter(10.3, 4.2);

    }

}
