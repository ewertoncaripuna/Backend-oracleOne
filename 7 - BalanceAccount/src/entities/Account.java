package entities;

public class Account {

//    Nome: Jacqueline Oliveira
////    Tipo conta: Corrente
////    Saldo inicial: R$ 2500,00
//

    private String name;
    private String type;
    private Double balance;

    public Account(String name, String type, Double balance) {
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getBalance() {
        return balance;
    }

    public double deposit(Double value){
        return balance += value;
    }

    public double withdraw(Double value){
        return balance -= value;
    }

    @Override
    public String toString() {
        return "***********************\n" +
                "Name: " + name + "\n" +
                "Type Account: " + type + "\n" +
                "Balance: " + balance + "\n" +
                "***********************";
    }
}
