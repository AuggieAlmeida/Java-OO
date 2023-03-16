package br.com.fatec;

import java.util.Random;

public class Conta {
    private final int num;
    private float balance;
    private final Correntista holder = new Correntista();
    Random cod = new Random();

    public Conta(String name) {
        this.holder.setName(name);
        this.num = cod.nextInt(9999999);
    }

    public Correntista getHolder() {
        return holder;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void addBalance(float value) {
        this.balance += value;
        System.out.println("Saldo atual: R$ " + this.balance);
    }

    public void rmvBalance(float value) {
        if(value > getBalance()) {
            System.out.println("Saldo insuficiente");
        }
        else {
            this.balance -= value;
            System.out.println("Saldo atual: R$ " + this.balance);
        }
    }

    public int getNum() {
        return num;
    }
}
