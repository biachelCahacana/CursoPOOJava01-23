/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Enquanto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*while(){
            
        }
        int num = 2;
        System.out.println("Usando While:");
        while(num!=2){
            System.out.print("Para parar clique 2: ");
            num = scan.nextInt();
        }
        
        System.out.println("Usando do:");
        do{
            System.out.print("Para parar clique 2: ");
            num = scan.nextInt();
        }while(num!=2);*/
        
        //Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor.
        /*System.out.print("Valor 1: ");
        int valor1 = scan.nextInt();
        
        int valor2=1;
        
        while(valor2==0){
            System.out.print("Valor 2: ");
            valor2 = scan.nextInt();
        }*/
        //Crie um programa que peça ao usuário um número inteiro positivo e verifique se ele é um número primo ou não. Um número primo é aquele que é divisível apenas por 1 e por ele mesmo. Use o loop "enquanto" para verificar isso.
        
        /*System.out.print("Valor: ");
        int valor = scan.nextInt();
        int cont = 1,div=0;
        
        while(cont<=valor){
            if(valor%cont==0){
                //System.out.print(cont+" " );
                div++; 
            }
            cont=cont+1;
        }
        if(div==2){
            System.out.println("É Primo");
        }else{
            System.out.println("Não é");
        }*/
        
        /*Ler um valor N e imprimir 
        todos os valores inteiros e 
        impares de 0  até N. 
        Considere que o N será sempre 
        maior que ZERO. */
        
        System.out.print("Valor: ");
        int valor = scan.nextInt();
        int cont = 0;
        while(cont<=valor){
           if(cont%2!=0){
               System.out.println(cont);
           } 
           cont++;
        }

    }
}
