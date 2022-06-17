//8. Faça um programa que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.

import java.util.Scanner;

public class atv8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int numero1 = in.nextInt();


        System.out.println("Informe o segundo numero");
        int numero2 = in.nextInt();


        System.out.println("Informe o terceira numero");
        int numero3 = in.nextInt();


        System.out.println("Informe o quarto numero");
        int numero4 = in.nextInt();


        System.out.println("Informe o quinto numero");
        int numero5 = in.nextInt();


        System.out.println("Informe o sexto numero");
        int numero6 = in.nextInt();


        System.out.println("Informe o setimo numero");
        int numero7 = in.nextInt();


        System.out.println("Informe o oitavo numero");
        int numero8 = in.nextInt();
        

        System.out.println("Informe o nono numero");
        int numero9 = in.nextInt();


        System.out.println("Informe o decimo numero");
        int numero10 = in.nextInt();

        int soma = numero1 + numero2 + numero3 + numero4 + numero5 + numero6 + numero7 + numero8 + numero9 + numero10;

        System.out.println("Soma total: " + soma);
         
    }
}