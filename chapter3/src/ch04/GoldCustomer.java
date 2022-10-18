package ch04;

public class GoldCustomer extends Customer{

    private double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        saleRatio = 0.1;
        customerGrade = "GOLD";
        bonusRatio = 0.02;
    }

    @Override
    public int calcPrice(int money) {

        bonusPoint += money * bonusRatio;
        money -= (int)(money * saleRatio);
        return money;
    }
}
