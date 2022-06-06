//10. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores 
//que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". 
//Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int primeiro = in.nextInt();

        while (primeiro < 0 && primeiro > 10){
            System.out.println("Por favor informe numeros maiores que 0 e menores que 10.");
         }

        System.out.println("Informe o segundo numero");
        int segundo = in.nextInt();

        System.out.println("Informe o terceiro numero");
        int terceiro = in.nextInt();

        System.out.println("Informe o quarto numero");
        int quarto = in.nextInt();


        int media = primeiro * segundo * terceiro * quarto / 4;

        if(media > 5){
            System.out.println("Voce passou no teste.");
        }
        else{
            System.out.println("tente novamente.");
        }

    }
}
