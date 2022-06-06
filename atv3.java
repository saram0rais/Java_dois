//3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

import java.util.Scanner;

public class atv3 {
    public static void main(String[] args){
        
        //Primeiro valor(número)
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro valor");
        int valor1 = in.nextInt();

        //Segundo valor(número)
        System.out.println("Informe o segundo valor");
        int valor2 = in.nextInt();

        //Terceiro valor(número)
        System.out.println("Informe o terceiro valor");
        int valor3 = in.nextInt();

        //Condições
        if(valor1 > valor2 && valor1 > valor3){
            System.out.println("O valor 1 e maior");
        } 
        else if(valor2 > valor1 && valor2 > valor3){
            System.out.println("O valor 2 e maior");
        } 
        else if (valor3 > valor1 && valor3 > valor2){
            System.out.println("O valor 3 e maior");
        }
        
    }
}
