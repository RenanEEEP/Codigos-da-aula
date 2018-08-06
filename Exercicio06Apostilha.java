package exercicio06apostilha;

import java.util.Scanner;

public class Exercicio06Apostilha {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Qual o valor do produto ? ");
        double pro = tcl.nextFloat() / 5;
        System.out.println("Sua parcela é de $"+pro+" por mês.");
    }
    
}
