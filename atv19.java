//19 - Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. 
//Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

import java.util.Scanner;

public class atv19 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Quantos gols o Gremio marcou?");
        int gremio = in.nextInt();

        System.out.println("Quantos gols o Inter marcou?");
        int inter = in.nextInt();

        if(gremio > inter){
            System.out.println("GREMIO");
        }
        else if(inter > gremio){
            System.out.println("INTER");
        }
        else if(inter == gremio){
            System.out.println("EMPATE");
        }
    }
}
