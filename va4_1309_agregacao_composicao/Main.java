package br.com.fatec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Fabricante f = new Fabricante();
        Console c = new Console();

        System.out.print("Insira o Console >> ");
        c.setName(leitor.nextLine());
        System.out.print("Insira o ano que ele foi lançado >> ");
        c.setReleaseYear(leitor.nextInt());
        System.out.print("Insira a fabricante do console >> ");
        f.setName(leitor.next());
        c.setFabricante(f);

        System.out.println("\n" + c.Dados());
}
}