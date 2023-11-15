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
public class Faca_Enquanto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*int a = 1;
        do{
            System.out.println("Mostrou"); 
        }while(a!=8);*/
        
        //Calculo da área: a = l*l
        /*int lado,area;
        do {            
            System.out.print("Apresente o valor do lado:"); 
            lado = scan.nextInt();
        } while (lado<=70);
        area = lado*lado;
        System.out.println("A área será de: "+area);
        */
        //Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor. 
        System.out.print("Valor 1: ");
        int valor1 = scan.nextInt();
        int valor2;
        do{
           System.out.print("Valor 2: ");
           valor2 = scan.nextInt(); 
        }while(valor2==0);
        System.out.println("O resultado: "+(valor1/(double)valor2));
        
        
        
    }
}
