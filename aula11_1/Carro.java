/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11_1;

/**
 *
 * @author HP
 */
public class Carro {
    private String matricula;
    private String modelo;
    private String cor;
    
    public void setMatricula(String matricula){
        this.matricula = matricula.toUpperCase();
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    protected void andar(){
        System.out.println("Andando");
    }
    
    protected void parar(){
        System.out.println("Parando");
    }
    
    protected void buzinar(){
        System.out.println("Buzinando");
    }
    
    protected void ligar(){
        System.out.println("Ligando");
    }
    
    protected void desligar(){
        System.out.println("Desligando");
    }
    
    protected void mostrarMatricula(){
        System.out.println(matricula);
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
}
