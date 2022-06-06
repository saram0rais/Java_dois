import java.util.Scanner;

//16 - As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
//Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o 
//valor total da compra.

public class atv16 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Quantas macas voce comprou?");
        int macas = in.nextInt();

        //Menos que uma dúzia
        double menos = 0.30 ;

        //Uma dúzia ou mais
        double mais = 0.25 ; 

        if(macas < 12){
            Double conta = macas * menos;
            System.out.println("O valor total da compra foi de: " + conta);
        }
        else {
            Double conta2 = macas * mais;
            System.out.println("O valor total da compra foi de: " + conta2);
        }
    }
}
