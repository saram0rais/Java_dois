// 25 - Uma micro calculadora
// Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem
// executadas (codificada da seguinte forma: 1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação).
// O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos. Observação: 
// Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações.

import java.util.Scanner;

public class atv25 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Qual o tipo de operacao voce deseja fazer? (1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação)");
        int operacao = in.nextInt();

        System.out.println("Informe o primeiro numero.");
        int n1 = in.nextInt();

        System.out.println("Informe o segundo numero.");
        int n2= in.nextInt();

        if(operacao == 1 ){
            int soma = n1 + n2 ;
            System.out.println("Resultado: " + soma);
        }
        else if(operacao == 2 ){
            int subtracao = n1 - n2 ;
            System.out.println("Resultado: " + subtracao);
        }
        else if(operacao == 3 ){
            int divisao = n1 / n2 ;
            System.out.println("Resultado: " + divisao);
        }
        else if(operacao == 4 ){
            int multi = n1 * n2 ;
            System.out.println("Resultado: " + multi);
        }
       
        in.close();

    }
}
