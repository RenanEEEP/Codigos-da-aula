package exercicio05apostilha;

import java.util.Scanner;

public class Exercicio05Apostilha {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite a tem peratura(graus celcius): ");
        double gc = tcl.nextFloat();
        double gf = (9 * gc + 160)/5;
        System.out.println("A tem peratura de "+gc+" graus celcius em graus Fahrenheit é "+gf);
        
        
    }
    
}
