/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author HP
 */
public class Carro {
    String marca;
    String modelo;
    String matricula;
    int numeroPortas;
    boolean eDisportivo;
    
    
    void andar(){
        System.out.println("Andando");
    }
    
    void parar(){
        System.out.println("Parando");
    }
    
    void buzinar(){
        System.out.println("Buzinando");
    }
    
    void ligar(){
        System.out.println("Ligando");
    }
    
    void desligar(){
        System.out.println("Desligando");
    }
    
    
    Carro(){
        marca = "Lexus Novo";
        modelo = "NX300";
        matricula = "LD2245NA";
        numeroPortas = 5;
        eDisportivo = false;  
    }
    
    Carro(String marca){
        this.marca = marca;
        modelo = "NX300";
        matricula = "LD2245NA";
        numeroPortas = 5;
        eDisportivo = false;  
    }
    
    Carro(String marca,String modelo,String matricula, int numeroPortas, boolean eDisportivo){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.numeroPortas = numeroPortas;
        this.eDisportivo = eDisportivo;  
    }
    
    
    void mostrarTudo(){
        String disportivo;
        if(eDisportivo){
            disportivo = "Desportivo";
        }else{
            disportivo = "Não disportivo";
        }
        System.out.println(marca+" "+modelo+" "+matricula+" "+numeroPortas+" "+disportivo);
    }
}
