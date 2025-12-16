package com.example.loir;

public class Main {
    public static void main(String[] args) {
        int contador = 0;

        for(int i = 1; i < 5; i++){
            if(i % 3 == 0){
                System.out.println(i);
                contador += 1;
            }
        }
    }
}