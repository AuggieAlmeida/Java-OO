package br.com.fatec.conta;

import br.com.fatec.Conta;

public class Aplicacao extends Conta {

    private int fee;

    public Aplicacao(String name) {
        super(name);
    }

    public int getIncome() {
        return fee;
    }

    public void setFee(int income) {
        this.fee = income;
    }

    public void colectFee() {
        rmvBalance(getBalance()*getIncome()/100);
    }
}
