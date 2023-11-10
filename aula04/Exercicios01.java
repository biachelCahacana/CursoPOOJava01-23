/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula04;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Exercicios01 {
    public static void main(String[] args){
        //int x = 10;
        //System.out.println(x);
        
        Scanner scan = new Scanner(System.in);
        
        /*double r = scan.nextDouble();
        double a = Math.PI*Math.pow(r, 2);*/
        
        /*
            Exercicio 1: Verificação de Ano Bissexto:
            Um ano é bissexto se ele for divisível 
            por 400 ou se ele for divisível por 4 
            e não por 100.
        */
        System.out.print("Ano: ");
        int ano = scan.nextInt();
        if(ano%400==0 || ano%4==0 && ano%100!=0){
            System.out.println("É bissexto.");
        }else{
            System.out.println("Não é bissexto.");
        }
        
        /*Exercício 2: Faça um Programa que peça as 4 
        notas e mostre a media e apresente a 
        situação do aluno*/
        System.out.print("nota 1: ");
        double n1 = scan.nextDouble();
        System.out.print("nota 2: ");
        double n2 = scan.nextDouble();
        System.out.print("nota 3: ");
        double n3 = scan.nextDouble();
        System.out.print("nota 4: ");
        double n4 = scan.nextDouble();
        double media = (n1+n2+n3+n4)/4;
        if(media>=10){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
        /*
        Exercicio 3 - Faça um Programa que peça 2 números inteiros 
        e um número real. Calcule e mostre:
	a. O produto do dobro do primeiro 
            com metade do segundo;
	b. A soma do triplo do primeiro com o terceiro;
	c. O terceiro elevado ao cubo;
        */
        System.out.print("Valor 1: ");
        int v1 = scan.nextInt();
        System.out.print("Valor 2: ");
        int v2 = scan.nextInt();
        System.out.print("Valor 3: ");
        double v3 = scan.nextDouble();
        double res1 = 2*v1*(v2/2);
        double res2 = 3*v1 + v3;
        double res3 = Math.pow(v3, 3);
        System.out.print("Res 1: "+res1);        
        System.out.print("Res 2: "+res2);
        System.out.print("Res 3: "+res3);
        
        /*
        Exercicio 3 - Tendo como dados de 
        entrada a altura e o genero de uma 
        pessoa construa um algoritmo 
        que calcule o seu peso ideal, utilizando 
        as seguintes formulas:
        
        Para homens: ((72.7 * altura) - 58)
        Para mulheres: ((62.1 * altura) - 44.7)
      
        */
        System.out.print("Altura: ");
        double alt = scan.nextDouble();
        System.out.print("Genero: M/F ");
        String gen = scan.next();
        double pesoIdeal=0;
        if(gen == "M"){
            pesoIdeal = ((72.7 * alt) - 58);
        }
        if(gen == "F"){
            pesoIdeal = ((62.1 * alt) - 44.7);
        }
        
        System.out.println("Peso ideal: "+pesoIdeal);
        
        
        
        
    }
}
