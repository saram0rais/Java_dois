//17 - Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número "1234" sem aspas. 
//Devem ser impressas as seguintes mensagens: "ACESSO PERMITIDO" caso a senha seja válida. "ACESSO NEGADO" caso a senha seja inválida.

import java.util.Scanner;

public class atv17 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua senha.");
        int senha = in.nextInt();

        if(senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
    }
}