package com.company;

public class BankAcccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum)
        throws LimitExeption{
        if (sum > amount){
            throw new
                    LimitExeption("Запрашиваемая сумма больше чем сумма на счете" + amount,getAmount());
        }
        System.out.println(amount = amount - sum);
    }
}
