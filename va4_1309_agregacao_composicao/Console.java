package br.com.fatec;

public class Console {
    private String name;
    private int releaseYear;
    private Fabricante fabricante;

    // Construtor
    public Console() { }



    // Métodos
    public String Dados() {
        String aux = "Dados do Console - " + getName();
        aux += "\nAno de Lançamento: " + getReleaseYear();
        aux += "\nFabricante: " + fabricante.getName();

        return aux;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
