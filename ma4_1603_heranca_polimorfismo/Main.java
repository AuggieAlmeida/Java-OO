package br.com.fatec;

import br.com.fatec.conta.Aplicacao;
import br.com.fatec.conta.Poupanca;
import br.com.fatec.conta.corrente.Especializacao;
import br.com.fatec.conta.corrente.especial.Cartao;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Carlos");
        Especializacao e1 = new Especializacao("Willian", 2000);
        Poupanca p1 = new Poupanca("Jefferson");
        Cartao card1 = new Cartao(e1);
        Aplicacao a1 = new Aplicacao("Josisnei");


        System.out.println(c1.getHolder().getName());
        c1.setBalance(2000);
        c1.rmvBalance(3000);
        c1.addBalance(1000);
        c1.rmvBalance(3000);

        System.out.println("\n-------------------\n");
        System.out.println(e1.getHolder().getName());
        System.out.println("R$ " + e1.getBalance());
        System.out.println("R$ " + e1.getCredit());
        e1.rmvBalance(2000);

        System.out.println("\n-------------------\n");
        p1.setIncome(5);
        p1.setBalance(2000);
        System.out.println(p1.getHolder().getName());
        System.out.println("R$ " + p1.getBalance());
        System.out.println("Rendimento: " + p1.getIncome() + " %");
        p1.upIncome();

        System.out.println("\n-------------------\n");
        System.out.println(card1.getAccount().getHolder().getName());
        System.out.println(card1.getCardNum());

        System.out.println("\n-------------------\n");

        a1.setFee(5);
        a1.setBalance(2000);
        System.out.println(a1.getHolder().getName());
        System.out.println("R$ " + a1.getBalance());
        System.out.println("Desconto de IOF: " + a1.getIncome() + " %");
        a1.colectFee();
    }
}