import java.util.Scanner;

//13 - Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a 
//seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas 
//informadas).

//14 - Acrescente ao exercício anterior a mensagem "Infelizmente, você foi reprovado!" caso a média calculada seja menor que 6.0.

public class atv13e14 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        double primeira = in.nextInt();

        System.out.println("Digite a segunda nota");
        double segunda = in.nextInt();

        System.out.println("Digite a terceira nota");
        double terceira = in.nextInt();

        System.out.println("Digite a quarta nota");
        double quarta = in.nextInt();

        double media = primeira * segunda *  terceira * quarta / 4 ;

        if( media >= 6.0){
            System.out.println("PARABENS! Voce foi aprovado!");
        }
        else{
            System.out.println("Infelizmente voce foi reprovado");
        }
    }
}
