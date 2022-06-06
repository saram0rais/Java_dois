//20 - Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
//Calcular e imprimir o seguinte: 
//Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro. 
//Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
//Se o número de lados for igual a 5 escrever PENTÁGONO. 

//Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 

//Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
//Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

import java.util.Scanner;


public class atv20 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a quantidade de lados");
        int lados = in.nextInt();

        System.out.println("Informe a medida dos lados em centimetros");
        int lados_cm = in.nextInt();

        //Condições
        if (lados == 3){
            int perimetro = lados_cm * 3 ;
            System.out.println("TRIANGULO, perímetro = " + perimetro);
        }

        if (lados == 4){
            int perimetro = lados_cm * 4 ;
            System.out.println("QUADRADO, perímetro = " + perimetro);
        }

        if (lados == 5){
            int perimetro = lados_cm * 5;
            System.out.println("PENTÁGONO, perímetro = " + perimetro);
        }

        if (lados < 3){
            System.out.println("NÃO É UM POLÍGONO.");
        }

        if (lados >5){
            System.out.println("POLÍGONO NÃO IDENTIFICADO.");
        }

    }
}
