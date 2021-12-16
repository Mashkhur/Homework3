package com.company;

public class Main {

    public static void main(String[] args){
        BankAcccount bankAcccount = new BankAcccount();
        bankAcccount.deposit(20000.00);

        while (true){
            try {
                bankAcccount.withDraw(6000);
            }catch (LimitExeption e){
                System.out.println(e.getMessage());
                try {
                    bankAcccount.withDraw((int)
                            bankAcccount.getAmount());
                    System.out.println("У вас не осталось денег");
                }catch (LimitExeption limitExeption){
                    System.out.println(limitExeption.getMessage());
                }break;
            }
        }
    }

    }

