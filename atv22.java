// 22. A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em 
// até 15 vezes sem juros. Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

import java.util.Scanner;

public class atv22 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Em quantas parcelas voce deseja pagar o capacete?");
        Double parcelas = in.nextDouble();

        Double avista = 18.230 ;
        Double x2 = 9.115 ;
        Double x3 = 6.076 ;
        Double x4 = 4.557 ;
        Double x5 = 3.646 ;
        Double x6 = 3.038 ;
        Double x7 = 2.604 ;
        Double x8 = 2.278 ;
        Double x9 = 2.025;
        Double x10 = 1.832;
        Double x11 = 1.657;
        Double x12 = 1.519;
        Double x13 = 1.402;
        Double x14 = 1.302;
        Double x15 = 1.215;

        Double todas = 0.0;
        System.out.println(avista);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);
        System.out.println(x6);
        System.out.println(x7);
        System.out.println(x8);
        System.out.println(x9);
        System.out.println(x10);
        System.out.println(x11);
        System.out.println(x12);
        System.out.println(x13);
        System.out.println(x14);
        System.out.println(x15);

        if(parcelas == 1){
            System.out.println("Sua parcela é de: " + avista + todas);
        }
        else if(parcelas == 2){
            System.out.println("Sua parcela é de: " + x2 + todas);
        }
        else if(parcelas == 3){
            System.out.println("Sua parcela é de: " + x3 + todas);
        }
        else if(parcelas == 4){
            System.out.println("Sua parcela é de: " + x4 + todas);
        }
        else if(parcelas == 5){
            System.out.println("Sua parcela é de: " + x5 + todas);
        }
        else if(parcelas == 6){
            System.out.println("Sua parcela é de: " + x6 + todas);
        }
        else if(parcelas == 7){
            System.out.println("Sua parcela é de: " + x7 + todas);
        }
        else if(parcelas == 8){
            System.out.println("Sua parcela é de: " + x8 + todas);
        }
        else if(parcelas == 9){
            System.out.println("Sua parcela é de: " + x9 + todas);
        }
        else if(parcelas == 10){
            System.out.println("Sua parcela é de: " + x10 + todas);
        }
        else if(parcelas == 11){
            System.out.println("Sua parcela é de: " + x11 + todas);
        }
        else if(parcelas == 12){
            System.out.println("Sua parcela é de: " + x12 + todas);
        }
        else if(parcelas == 13){
            System.out.println("Sua parcela é de: " + x13 + todas);
        }
        else if(parcelas == 14){
            System.out.println("Sua parcela é de: " + x14 + todas);
        }
        else if(parcelas == 15){
            System.out.println("Sua parcela é de: " + x15 + todas);
        }

        in.close();
    }
}
