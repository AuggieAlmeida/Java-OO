package va4_1309_heranca_polimorfismo;


public class Funcionario {
    private String name;
    private float salario;
    private int registro;
    private int DAYSOFF = 30;


    //métodos

    public void bookVacation(){
        System.out.println("Férias de " + DAYSOFF + " dias marcada");
    }

    //getters e setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getRegistro() { return registro; }

    public void setRegistro(int registro) { this.registro = registro; }
}
