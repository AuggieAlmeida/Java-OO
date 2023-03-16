package br.com.fatec.conta.corrente;

import br.com.fatec.conta.Corrente;

public class Especializacao extends Corrente {

    private float credit;

    public Especializacao(String name, float limit) {
        super(name);
        setCredit(limit);
    }

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    @Override
    public void rmvBalance(float value) {
        if(value > getCredit()) {
            System.out.println("Saldo insuficiente");
        }
        else {
            this.credit -= value;
            System.out.println("Saldo atual: R$ " + this.getCredit());
        }
    }
}
