package exercicio03apostilha;

import java.util.Scanner;

public class Exercicio03Apostilha {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite o consumo do automovel(Litros): ");
        double c = tcl.nextInt();
        System.out.println("Digite a distencia em Km percorrida");
        double km = tcl.nextInt();
        double r = km/c;
        System.out.println("Seu altomovel percorre "+r+" km Por litro.");
        
    }
    
}
