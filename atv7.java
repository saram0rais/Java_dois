//7. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de
// todos eles (considere que todos os números informados serão diferentes)

import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int valor = in.nextInt();

        System.out.println("Informe o segundo valor");
        int valor2 = in.nextInt();

        System.out.println("Informe o terceiro valor");
        int valor3 = in.nextInt();

        System.out.println("Informe o quarto valor");
        int valor4 = in.nextInt();

        if(valor2 > valor && valor2 > valor3 && valor2 > valor4){
            System.out.println("Primeiro valor: " + valor + " Ultimo valor: " + valor4 + " Maior valor: " + valor2);
        }
        else if(valor > valor2 && valor > valor3 && valor > valor4){
            System.out.println("Primeiro valor: " + valor + " Ultimo valor: " + valor4 + " Maior valor: " + valor);
        }
        else if(valor3 > valor && valor3 > valor2 && valor3 > valor4){
            System.out.println("Primeiro valor: " + valor + " Ultimo valor: " + valor4 + " Maior valor: " + valor3);
        }
        else if(valor4 > valor && valor4 > valor2 && valor4 > valor3){
            System.out.println("Primeiro valor: " + valor + " Ultimo valor: " + valor4 + " Maior valor: " + valor4);
        }
        


    }
}
