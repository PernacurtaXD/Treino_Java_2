package com.example.ig;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner teclado = new Scanner(System.in);
        int idade;
        String nome;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite seu nome:");
            nome = teclado.nextLine();

            System.out.println("Digite sua idade:");
            idade = Integer.parseInt(teclado.nextLine());

            if(idade > 0){
                System.out.println("Olá, " + nome + "! Sua idade é " + idade + " anos.");
            }
        }


        teclado.close();
        
    }
}
