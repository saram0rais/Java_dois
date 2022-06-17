// 21 - Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. Calcular a média do semestre 
// considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações. 
// Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame.

import java.util.Scanner;

public class atv21 {
    public static void main(String[] args){

        Double media = (double) 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Informe a nota da primeira avaliacao.");
        Double avaliacao1 = in.nextDouble();

        System.out.println("Informe a nota da segunda avaliacao.");
        Double avaliacao2 = in.nextDouble();

        System.out.println("Informe a nota da avaliacao optativa.");
        Double optativa = in.nextDouble();

        if (optativa > avaliacao1){
             media = (optativa + avaliacao2) / 2 ;
        }
        else if (optativa > avaliacao2){
             media = (optativa + avaliacao1) / 2;
        } 
        else {
            media = (avaliacao1 + avaliacao2) / 2;
        }

        if( media >= 6.0){
            System.out.println("APROVADO");
        } 
        else if( media < 3.0){
            System.out.println("REPROVADO");
        }
        else if( media >= 3.0 && media < 6.0){
            System.out.println("EM EXAME");
        }

        in.close();

    }
}
