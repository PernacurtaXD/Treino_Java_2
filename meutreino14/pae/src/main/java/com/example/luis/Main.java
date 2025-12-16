package com.example.luis;
// ForEach // Para cada


public class Main {
    public static void main(String[] args) {
        String nome = "Geek University";
        
        // Para cada um caractere da string nome, imprima o caractere
        for(char letra : nome.toCharArray()){
            System.out.println(letra);
        }
    }
}