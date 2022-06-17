//9. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. 
//Escreva o valor final da soma efetuada e também todos valores que o usuário informou.  

import java.util.Scanner;

public class atv9 {
    public static void main(String[] args) {

        int contador = 0;
        int soma = 0;
        int vetor[] = new int[6];

        Scanner in = new Scanner(System.in);

        while (contador < 6) {

            System.out.println("Informe o numero");
            int numero = in.nextInt();

            vetor[contador] = numero;

            if (numero < 72) {
                soma = soma + numero;
            }

            contador++;

        }

        System.out.println("Resultado da soma: " + soma);

        for(int i = 0;i<vetor.length;i++){
            System.out.println("Numeros digitados: " + vetor [i]);
        }

        in.close();

    }
}
