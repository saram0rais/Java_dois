//18 - Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, 
//construa um programa que calcule e imprima seu peso ideal.

import java.util.Scanner;


public class atv18 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Por favor, informe a sua altura.");
        Double altura = in.nextDouble();

        System.out.println("Agora informe o seu sexo (1 = feminino e 2 = masculino)");
        Double sexo = in.nextDouble();

        Double calmasc = (72.7 * altura) - 58 ;

        Double calfem = (62.1 * altura) - 44.7 ;

        if (sexo == 1){
            System.out.println("Seu peso ideal é: " + calfem + "kg");
        } 
        else if (sexo == 2){
            System.out.println("Seu peso ideal é: " + calmasc + "kg");
        }

    }
}
