//23 - Faça um programa em que o usuário informe 20 valores e no final, escreva o maior e o menor valor lido.

import java.util.Scanner;

public class atv23 {
    public static void main(String[] args){

        int n_maior = 0;
        int n_menor = 1;
        int contador = 0;

        Scanner in = new Scanner(System.in);

        while (contador < 20){
            System.out.println("Informe um numero");
            int numero = in.nextInt();

            if( numero > n_maior){
                n_maior = numero;
            }
            
            if(numero < n_menor){
                n_menor = numero;
            }

                contador++;

            }

            System.out.println("Maior valor: " + n_maior + " Menor valor: "  + n_menor);

        in.close();

    }
}
