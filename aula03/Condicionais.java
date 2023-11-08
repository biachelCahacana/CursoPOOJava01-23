/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03;

/**
 *
 * @author HP
 */
public class Condicionais {
    public static void main(String[] args){
        
        //Estrutura Condicional Simples
        int num = 1;
        System.out.println("num > 5: "+(num>5));
        if(num>5){
            //Bloco de codigo
            System.out.println("Sim e maior que 5.");
        }
        int idade = 19;
        if(idade>18){
            System.out.println("A pessoa e maior");
        }
        
        int num2 = 3;
        if(num2%2==0){
            System.out.println("O número é par.");
        }
        
       
        //Estrutura condicional composta
        num = 5;
        if(num>5){
            System.out.println("Maior que 5");
        }else{
            System.out.println("Nao e maior");
        }
        
        idade = 18;
        if(idade>=18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Nao e maior de idade");
        }
            
        int valor = 18;
        if(valor>=10 && valor<=15){
            System.out.println("Esta no intervalo");
        }else{
            System.out.println("Nao esta no intervalo");
        }
        
        
        //Estrutura condicional aninhada
        valor = 17;
        if(valor<10){
            System.out.println("Menor que 10 ");
        }else if(valor<15){
            System.out.println("Entre 10 e 15");
        }else if(valor<20){
            System.out.println("Entre 15 e 20");
        }else{
            System.out.println("Maior que 20");
        }
        
        
        
        
        /*
            
        tarefa
        
        0 - 12 = crianca
        13 - 17 = adolescente
        18 - 40 = adulto

        */
              
        
        
    }
}
