/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

/**
 *
 * @author HP
 */
public class Operadores {
    public static void main(String[] args){
        //Operadores Relacionais
        System.out.println(1==1);
        System.out.println(3<1);
        boolean comp1;
        comp1 = 3<1;
        System.out.println(comp1);
        boolean comp2 = 4<8;
        System.out.println(comp2);
        int a = 4;
        int b = 8;
        comp2 = a<b;
        System.out.println(comp2);
        char nome1 = 'a';
        char nome2 = 'b';
        System.out.println(nome1<nome2);
        
        int idade = 14;
        boolean comp3 = idade >= 18;
        System.out.println("A pessoa e maior? "+comp3);
        
        int c = 7;
        boolean comp4 = c%2==0;
        System.out.println(c+" e par? "+comp4);
        
        double d = 4.0;
        boolean comp5 = d%2 != 0;
        System.out.println(d+" e impar? "+comp5);
        
        //Operadores Lógicos
        int x = 7;
        System.out.println(x>5 && x<10);
        System.out.println(x<5 || x>10);
    }
}
 