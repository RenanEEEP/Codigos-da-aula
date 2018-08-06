package exercicio02apostila;

import java.util.Scanner;

public class Exercicio02Apostila {
    
    public static void main(String[] args) {
        System.out.println("Algoritimo 01");
        Scanner tcl = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int n1 =  tcl.nextInt();
        System.out.print("Digite outro: ");
        int n2 = tcl.nextInt();
        int som = n1+n2;
        int sub = n1-n2;
        int mul = n1*n2;
        int div = n1/n2;
        
        System.out.println("A soma dos valores é " + som + ", a subtração é "+ sub +
                ", a multiplicação é  " + mul + " e a divisão é " + div);
        
        System.out.println("Algoritmo 02");
        Scanner doa = new Scanner(System.in);
        System.out.print("Digite o ano atual:");
        int at = doa.nextInt();
        System.out.print("Digite o ano do nascimento:");
        int an = doa.nextInt();
        int i = at - an;
        
        System.out.println("Sua idade é "+i);
        
        
        
    }
    
}
