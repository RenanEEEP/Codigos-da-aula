package exercicio04apostilha;

import java.util.Scanner;

public class Exercicio04Apostilha {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String ven = tcl.next();
        System.out.print("Digite seu salario fixo: ");
        float sf = tcl.nextFloat();
        System.out.print("Digite o total de vendas no mês(Em dinheiro): ");
        float tdv = tcl.nextFloat();
        float c = (tdv * 15) / 100 ;
        float s = sf + c;
        System.out.println("O nome do vendedor é "+ven+" ele tem o salario fixo de "+sf+""
                + " porem graças a comição ele obteve no final do mês "+s);
        
        
        
    }
    
}
