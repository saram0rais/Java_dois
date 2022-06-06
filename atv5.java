//5. Faça um programa que leia dois valores informados pelo usuário e exiba uma das três mensagens a seguir: ‘Números iguais’, 
//caso os números sejam iguais ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo maior’, caso o segundo seja 
//maior que o primeiro.

import java.util.Scanner;

public class atv5 {
    public static void main(String[] args){

        Scanner in = new Scanner (System.in);
        System.out.println("Informe o primeiro valor");
        int valor1 = in.nextInt();

        System.out.println("Informe o segundo valor");
        int valor2 = in.nextInt();

        if(valor1 == valor2){
            System.out.println("Numeros iguais");
        }
        else if(valor1 > valor2){
            System.out.println("Primeiro e maior");
        }
        else if(valor2 > valor1){
            System.out.println("Segundo maior");
        }

    }
}
