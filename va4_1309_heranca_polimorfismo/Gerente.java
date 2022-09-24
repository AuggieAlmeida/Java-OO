package va4_1309_heranca_polimorfismo;


public class Gerente extends Funcionario {
    private float bonus;
    private int DAYSOFF = 40;

    @Override
    public void bookVacation() {
        System.out.println("Férias de " + DAYSOFF + " dias marcada");
    }



    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float bonusSalario(){ return getSalario() + this.bonus; }



}
