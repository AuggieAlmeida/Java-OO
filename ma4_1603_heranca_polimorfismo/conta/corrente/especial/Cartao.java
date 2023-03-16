package br.com.fatec.conta.corrente.especial;

import br.com.fatec.conta.corrente.Especializacao;

import java.util.Random;

public class Cartao {
    private int cardNum;
    private int limit;
    private int day;
    private Especializacao account;
    private Random cod = new Random();

    public Cartao(Especializacao link) {
        this.cardNum = cod.nextInt(99999999);
        account = new Especializacao(link.getHolder().getName(), link.getCredit());
    }

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Especializacao getAccount() {
        return account;
    }

    public void setAccount(Especializacao account) {
        this.account = account;
    }
}
