package va4_1309_heranca_polimorfismo;


public class Diretor extends Gerente{
    private Veiculo veiculo;
    private Funcionario secretaria;

    //Construtor
    public Diretor(Funcionario secretaria) {
        this.secretaria = secretaria;
        veiculo = new Veiculo();
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Funcionario secretaria) {
        this.secretaria = secretaria;
    }
}
