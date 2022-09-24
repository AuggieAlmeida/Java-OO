package br.com.fatec;

public class Jogo {
    private String name;
    private int plysQtd;
    private boolean online;
    private Console console;

    // Construtor
    public Jogo() {
    }

    public Jogo(String name) {
        this.name = name;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlysQtd() {
        return plysQtd;
    }

    public void setPlysQtd(int plysQtd) {
        this.plysQtd = plysQtd;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }
}
