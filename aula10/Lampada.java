/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10;

/**
 *
 * @author HP
 */
public class Lampada {
    public String cor;
    protected String tamanho;
    protected double voltagem;
    private boolean eEncandescente;
    
    public void acender(){
        System.out.println("Acendi");
    }
    
    public void apagar(){
        System.out.println("Apaguei");
    }
    
    void substituir(){
        System.out.println("Fui substituida");
    }
    
    Lampada(){
        cor = "Azul";
        tamanho = "Grande";
    }
    
    Lampada(boolean novoEEncandescente){
        cor = "Branca";
        tamanho = "Medio";
        voltagem = 24;
        eEncandescente = novoEEncandescente;
    }

    Lampada(String cor, String tamanho, double voltagem, boolean eEncandescente) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.voltagem = voltagem;
        this.eEncandescente = eEncandescente;
    }
    
    
}
