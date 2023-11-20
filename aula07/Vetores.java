/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Vetores {
    public static void main(String[] args) {
        String nome;
        
        String nomes[];
        nomes = new String[5];
        
        //nome = "Carlos";
        //System.out.println(nome);
        
        nomes[0] = "Carlos";
        nomes[1] = "João";
        nomes[2] = "Maria";
        nomes[3] = "Joana";
        nomes[4] = "Marta";
        
        System.out.println(nomes[4]);        
        System.out.println(nomes.length);
        
        //Algoritmo para o usuario digitar 5 idades
        int idades[] = new int[5];
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Apresente a idade: ");
        idades[0] = scan.nextInt();
        System.out.print("Apresente a idade: ");
        idades[1] = scan.nextInt();
        System.out.print("Apresente a idade: ");
        idades[2] = scan.nextInt();
        System.out.print("Apresente a idade: ");
        idades[3] = scan.nextInt();
        System.out.print("Apresente a idade: ");
        idades[4] = scan.nextInt();
        
        System.out.println(idades[0]+" - "+idades[1]+" - "+idades[2]+" - "+idades[3]+" - "+idades[4]);*/
        
        //Ciclo for para apresentar todas as posições de um vector.
        /*for(int cont = 0;cont<5;cont++){
            System.out.print("Apresente a idade: ");
            idades[cont] = scan.nextInt();
        }
        
        for(int cont = 0; cont<5; cont++){
            System.out.print(idades[cont]+" - ");
        }*/
        
        
        int numeros[] = new int[10];
        Random random = new Random();
        for (int cont = 0; cont < numeros.length; cont++) {
            numeros[cont] = random.nextInt(-50,50);
        }
        
        //Saber todos os valores do vetor
        for (int cont = 0; cont < numeros.length; cont++) {
            System.out.print(numeros[cont]+" - ");
        }
        
        //Saber os pares e impares
        for (int cont = 0; cont < numeros.length; cont++) {
            if(numeros[cont]%2==0){
                System.out.println(numeros[cont]+" :Par");
            }else{
                System.out.println(numeros[cont]+" :Impar");
            }
           
        }
        
        //Saber os positivos e negativos
        for (int cont = 0; cont < numeros.length; cont++) {
            if(numeros[cont]>0){
                System.out.println(numeros[cont]+ " :Positivo");
            }else{
                System.out.println(numeros[cont]+ " :Negativo");
            }
            
        }
        
        // -1000,-700,-3000,-805,-980
        
        //Maior valor
        int maior = numeros[0];
        for (int cont = 0; cont < numeros.length; cont++) {
            if(maior<numeros[cont]){
                maior = numeros[cont];
            }
        }
        System.out.println("Maior: "+maior);
        
        //Pegar o menor
        int menor = numeros[0];
        for (int cont = 0; cont < numeros.length; cont++) {
            if(menor>numeros[cont]){
                menor = numeros[cont];
            }   
        }
        System.out.println("Menor: "+menor); 
        
        //Procurar valor digitado pelo usuario no velor
        System.out.print("Digite o valor a procurar: ");
        int proc = scan.nextInt();
        boolean esta = false;
        for (int cont = 0; cont < numeros.length; cont++) {
            if(proc == numeros[cont]){
                esta = true;
            }
        }
        
        if(esta){
            System.out.println("O valor esta no vetor");
        }else{
            System.out.println("O valor nao esta no vetor");
        }
        
        //Numero de vezes
        int qde=0;
        for (int cont = 0; cont < numeros.length; cont++) {
            if(proc == numeros[cont]){
                qde++;
            }
        }
        System.out.println("O numero "+proc+" apareceu "+qde+" vezes");
    }
}
