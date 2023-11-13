/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Para {
    public static void main(String[] args){
        //Ciclo vocacionado a contagem.
        /*
        for(declaracao e atribuição;condicao;en/de-cremento){
        
        }
        */
        
        
        //Mostre a mensagem Ola Mundo 10 vezes
        /*for(int cont=0;cont<10;cont=cont+2){
            System.out.println("Ola Mundo "+cont); 
        }*/
        
        /*for(int cont=10;cont>0;cont=cont-1){
            System.out.println("Ola Mundo "+cont); 
        }*/
        
        //Ler um valor N e imprimir todos os valores inteiros e pares de 0 até N. Considere que o N será sempre maior que ZERO. 
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Digite algum valor: ");
        int valor = scan.nextInt();
        for(int cont = 0;cont<=valor;cont=cont+1){
            System.out.println(cont);
        }
        */
        //Ler um valor N e imprimir todos os valores inteiros e impares de 0  até N. Considere que o N será sempre maior que ZERO. 
        /*System.out.print("Digite algum valor: ");
        int valor1 = scan.nextInt();
        for(int cont = 1;cont<=valor1;cont=cont+2){
            System.out.println(cont);
        }
        
        for(int cont = 0; cont<=valor1; cont=cont+1){
            if(cont%2 != 0){
                System.out.println(cont);
            }
        }*/
        
        /*
        Escreva um programa que solicite ao usuário um número 
        inteiro positivo N e, em seguida, apresente
        todos os números pares de 2 até N. Use um loop "para" 
        para fazer isso.
        */
        
        /*
        contadora: cont = cont + 1
        acumuladora: 
        int soma = 0; soma = soma + cont
        */
        
        /*System.out.print("Digite algum valor: ");
        int valor2 = scan.nextInt();
        int soma1 = 0,soma2 = 0;
        System.out.println("Forma 1: ");
        for(int cont=2;cont<=valor2;cont=cont+2){
            soma1 = soma1 + cont;
            System.out.println("Total Forma 1: "+soma1);
        }
        
        
        System.out.println("Forma 2");
        for(int cont=2;cont<=valor2;cont=cont+1){
            if(cont%2==0){
                soma2 = soma2 + cont;
            }
        }
        System.out.println("Total Forma 2: "+soma2);
        */
        
        System.out.print("Digite o valor: ");
        int valor = scan.nextInt();
        for(int cont=1;cont<=10;cont++){
            System.out.println(valor+" x "+cont+" = "+(valor*cont));
        }
        
        
        
    }
}
