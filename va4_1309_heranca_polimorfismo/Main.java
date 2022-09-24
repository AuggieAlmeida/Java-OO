package va4_1309_heranca_polimorfismo;

/**
 *
 * @author Augusto de Barros Almeida
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criando um Funcionario e um Diretor
        
        Funcionario f = new Funcionario();
        Diretor d = new Diretor(f);

        //Funcionário (secretária)
        d.getSecretaria().setName("Kelly");
        d.getSecretaria().setSalario(2500.00f);
        
        //Diretor
        d.setName("Joao");
        d.setSalario(5600.00f);
        d.setBonus(600.00f);
        d.getVeiculo().setPlate("BMW-0000");
        d.getVeiculo().setModel("BMW X6");


        //exibindo dados
        
        System.out.println("Secretária: ");
        System.out.println("Nome: " + d.getSecretaria().getName());
        System.out.println("Salario Total: " + d.getSecretaria().getSalario());
        System.out.println("");
        
        System.out.println("Diretor: ");
        System.out.println("Nome: " + d.getName());
        System.out.println("Veiculo: " + d.getVeiculo().getPlate());
        System.out.println("Salario Total: " + d.bonusSalario());
        System.out.println("Salário s/ bonus: " + d.getSalario());

        d.bookVacation();
    }
    
}
