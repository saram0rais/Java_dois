// 24 - Um zoológico muito louco
// Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre diferente, assim como 
// das girafas ). Calcule e escreva a soma das idades do javali mais velho com a girafa mais nova, e o produto das idades do javali mais 
// novo com a girafa mais velha.

import java.util.Scanner;

public class atv24 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Qual a idade do primeiro javali?");
        int idade_java1 = in.nextInt();

        System.out.println("Qual a idade do segundo javali?");
        int idade_java2 = in.nextInt();

        System.out.println("Qual a idade da primeira girafa?");
        int idade_girafa1 = in.nextInt();

        System.out.println("Qual a idade da segunda girafa?");
        int idade_girafa2 = in.nextInt();

        if (idade_java1 > idade_java2){
            if (idade_girafa1 < idade_girafa2){
                int soma = (idade_java1 + idade_girafa1);
                int soma2 = (idade_java2 + idade_girafa2);
                System.out.println("Javali mais velho "+idade_java1+" + Girafa mais nova "+idade_girafa1+" = "+soma+"; E javali mais novo "+idade_java2+"  + girafa mais velha "+idade_girafa2+" = "+soma2+"");
            }
        }

        if (idade_java2 > idade_java1){
            if (idade_girafa2 < idade_girafa1){
                int soma = (idade_java2 + idade_girafa2);
                int soma2 = (idade_java1 + idade_girafa1);
                System.out.println("Javali mais velho "+idade_java2+" + Girafa mais nova "+idade_girafa2+" = "+soma+"; E javali mais novo "+idade_java1+"  + girafa mais velha "+idade_girafa1+" = "+soma2+"");
            }
        }

        if (idade_java1 > idade_java2){
            if (idade_girafa2 < idade_girafa1){
                int soma = (idade_java1 + idade_girafa2);
                int soma2 = (idade_java2 + idade_girafa1);
                System.out.println("Javali mais velho "+idade_java1+" + Girafa mais nova "+idade_girafa2+" = "+soma+"; E javali mais novo "+idade_java2+"  + girafa mais velha "+idade_girafa1+" = "+soma2+"");
            }
        }

        if (idade_java2 > idade_java1){
            if (idade_girafa1 < idade_girafa2){
                int soma = (idade_java2 + idade_girafa1);
                int soma2 = (idade_java1 + idade_girafa2);
                System.out.println("Javali mais velho "+idade_java2+" + Girafa mais nova "+idade_girafa1+" = "+soma+"; E javali mais novo "+idade_java1+"  + girafa mais velha "+idade_girafa2+" = "+soma2+"");
            }
        }
        else{
            System.out.println("Todas as somas são iguais");
        }

        in.close();
        
    }
}
