package br.com.fatec.conta;

import br.com.fatec.Conta;

public class Poupanca extends Conta {

    private int income;

    public Poupanca(String name) {
        super(name);
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void upIncome() {
        addBalance(getBalance()*getIncome()/100);
    }
}
