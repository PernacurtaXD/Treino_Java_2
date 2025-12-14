package com.example.yes;


/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App 
{
    public static void main( String[] args ){
        Scanner teclado = new Scanner(System.in);

        int idade; // Inicializa idade com um valor maior que 0 para entrar no loop.
        String nome;

        //Primeiro executa o bloco, depois faz a checagem
        do{
            System.out.println("Digite seu nome:");
            nome = teclado.nextLine();

            System.out.println("Digite sua idade:");
            //idade = teclado.nextInt(); Bug: nextInt() não consome o caractere de nova linha, 
            // então o próximo nextLine() vai pegar o caractere de nova linha e não a próxima linha de entrada.
            idade = Integer.parseInt(teclado.nextLine()); 

            if(idade > 0){
                System.out.println(nome + ", você tem " + idade + " anos.");
            }
        }while(idade > 0);  

        teclado.close();
    }
}
