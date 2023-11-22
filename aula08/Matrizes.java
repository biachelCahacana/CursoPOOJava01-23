/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula08;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Matrizes {
    public static void main(String[] args){
        //Declaracao de Matrizes
        String nomes[][] = new String[3][3];
        
        int idades[][];
        idades = new int[3][3];
        
        //Atriibuição Individual de Matrizes
        /*
        
        nomes[0][0] = "Joao";
        nomes[1][0] = "Carla";
        nomes[2][2] = "Ana";
        
        //Leitura Individual de Matrizes
        System.out.println(nomes[2][2]);
        System.out.println(nomes[1][0]);
        System.out.println(nomes[0][1]);
        
        //Atribuição de valores pelo utilizador
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        //nomes[0][1] = scan.next();
        
        System.out.println("Nome digitado: "+nomes[0][1]);
        
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                System.out.println(lin+" "+col);
            }
        }
        
        //Algoritmo para pedir todos os valores
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                System.out.print("Insira o nome na linha "+lin+" e coluna "+col+": ");
                nomes[lin][col] = scan.next();
            }
        }
        
        //Apresentação de todos os valores da matriz
        for(int lin = 0; lin<3;lin++){
            for(int col=0;col<3;col++){
                System.out.println("nomes["+lin+"]["+col+"]: "+nomes[lin][col]);
            }
        }
        
        */
        Random random = new Random();
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
              idades[lin][col] =  random.nextInt(-100,100);
            }
        }
        
        System.out.print("Todas as idades: ");
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                System.out.print(idades[lin][col]+" ");
            }
        }
        
        System.out.print("\n\nTodas as idades positivas: ");
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                if(idades[lin][col]>0){
                    System.out.print(idades[lin][col]+" ");
                }
            }
        }
        
        System.out.print("\n\nTodas as idades negativas: ");
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                if(idades[lin][col]<0){
                    System.out.print(idades[lin][col]+" ");
                }
            }
        }
        
        System.out.print("\n\nTodas as idades pares: ");
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                if(idades[lin][col]%2==0){
                    System.out.print(idades[lin][col]+" ");
                }
            }
        }
        
        System.out.print("\n\nTodas as idades impares: ");
        for(int lin = 0;lin<3;lin++){
            for(int col = 0; col<3;col++){
                if(idades[lin][col]%2!=0){
                    System.out.print(idades[lin][col]+" ");
                }
            }
        }
        
        
        
        
    }
}
