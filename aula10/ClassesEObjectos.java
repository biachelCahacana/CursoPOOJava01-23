/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ClassesEObjectos {
    public static void main(String[] args) {
        
        Carro carro1 = new Carro();
        carro1.marca = "Ferrari";
        carro1.modelo = "Portofino";
        carro1.numeroPortas = 2;
        carro1.eDisportivo = true;
        carro1.matricula = "LD2245AN";
        
        carro1.ligar();
        carro1.andar();
        carro1.buzinar();
        carro1.parar();
        carro1.desligar();
        
        
        Carro carro2 = new Carro();
        carro2.marca = "Toyota";
        carro2.modelo = "Land Cruiser v12";
        carro2.matricula = "LA2674KN";
        carro2.numeroPortas = 5;
        carro2.eDisportivo = false;
        
        System.out.println("Carro1: "+carro1.marca);
        System.out.println(carro1.modelo);
        
        System.out.println(carro2.matricula);
        
        Carro carro3;
        carro3 = new Carro();
        
        System.out.println(carro3.marca);
        System.out.println(carro3.modelo);
        System.out.println(carro3.matricula);
    
        carro3.marca = "Mazda";
        /*System.out.println(carro3.marca);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o marca do carro ");    
        carro3.marca = scan.nextLine();
        System.out.println("Digite o modelo do carro ");
        carro3.modelo = scan.nextLine();
        System.out.println("Digite o numero de portas ");
        carro3.numeroPortas = scan.nextInt();*/
        
        System.out.println(carro3.marca);
        System.out.println(carro3.modelo);
        System.out.println(carro3.numeroPortas);
        
        String marca = "Porshe";
        Carro carro4 = new Carro(marca);
        carro4 = new Carro("Porshe");
        
        System.out.println(carro4.marca);
        
        
        Carro carro5 = new Carro("Infinit","NZ850RT","LD2244AN",5,false);
        System.out.println(carro5.marca);
        System.out.println(carro5.modelo);
        System.out.println(carro5.numeroPortas);
        
        carro5.mostrarTudo();
        
        Lampada l1 = new Lampada();
        Lamparina lp1 = new Lamparina();
        
        
        
    }
}
