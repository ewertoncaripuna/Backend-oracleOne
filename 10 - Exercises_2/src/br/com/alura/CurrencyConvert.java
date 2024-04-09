package br.com.alura;

public class CurrencyConvert implements ConversionFinancial {

    @Override
    public void convertDollarToReal(Double value) {
        double priceDollar = 5.02;
        double priceBrl = value * priceDollar;
        System.out.println("The price in BRL: R$" + String.format("%.2f",priceBrl));
    }
}
