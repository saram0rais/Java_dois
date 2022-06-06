//11 - Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
//Sabendo-se que o preço do combustível é de R$ 2,90, escreva um programa para ler: a marcação do odômetro (Km) no início do dia, 
//a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. 
//Sabendo que o carro desse taxista roda 14 kilômetros por litro de gasolina, crie um programa que calcule e escreva: a média do consumo 
//em Km/L e o lucro (líquido) do dia.

import java.util.Scanner;

public class atv11 {
    public static void main(String[] args){

        double preco = 2.90;

        Scanner in = new Scanner(System.in);
        System.out.println("Informe a marcação inicial do dia");
        double marcacao_inicial = in.nextDouble();

        System.out.println("Informe a marcação final do dia");
        double marcacao_final = in.nextDouble();

        System.out.println("Informe o número de combústil gasto");
        double numero_combustivel_gasto = in.nextDouble();

        System.out.println("Valor total recebido dos passageiros");
        double valor_recebido = in.nextDouble();

        //Cálculo
        double consumo = preco * numero_combustivel_gasto;
        double lucro = valor_recebido - consumo;

        System.out.println("A média de consumo em KM é de: " + consumo);
        System.out.println("O lucro do dia é de: " + lucro);
    }
}
