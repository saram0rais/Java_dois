//1. Escreva um programa em que o usuário informe dois números utilizando o "prompt". Então escreva em tela o maior deles.

import java.util.Scanner;

public class atv1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);       
        System.out.println("Informe o primeiro numero");
        int numero1 = entrada.nextInt();

        Scanner entrada2 = new Scanner(System.in);       
        System.out.println("Informe o segundo numero");
        int numero2 = entrada2.nextInt();

        if(numero1 > numero2){
            System.out.println("O numero maior e: " + numero1);
        }else {
            System.out.println("O numero maior e: " + numero2);
        }

    }
}