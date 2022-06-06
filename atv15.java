import java.util.Scanner;

//15 - Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este 
//ano (não é necessário considerar o mês em que ela nasceu).

public class atv15 {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Precisamos saber se voce pode votar na eleicao este ano ou nao. Por favor digite seu ano de nascimento");
        int ano = in.nextInt();

        if(ano <= 2006){
            System.out.println("Voce pode votar.");
        }
        else{
            System.out.println("Voce nao pode votar.");
        }
    }
}
