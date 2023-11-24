/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author HP
 */
public class Metodos {
    public static void main(String[] args) {
        //String mensagem = funcSaudar();
        //System.out.println(mensagem.toUpperCase());
        //procSaudar();
        
        procNumero();
        
        if(funcNumero()>0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
        
        System.out.println(funcSomar(1900));
        procSomar(7);
               
        System.out.println(funcFahrenheit(32));
        
        
        //Teste de Sobrecarda de metodos
        System.out.println(funcSomar(5));
        System.out.println(funcSomar(4, 7));
        System.out.println(funcSomar(7, 5, 6));
        System.out.println(funcSomar(8, 5, "Biachel"));
    }
    
    /*
        FUNÇÕES - METODOS COM RETORNO
        static tipo-de-dados nome-da-funcao(lista-de-parametros){
        
            
            return 5;
        }
    
        PROCEDIMENTOS - MÉTODOS SEM RETORNO
        static void nome-do-procedimento(lista-de-parametros){
        
            sout(5)
        }
    */
    static String funcSaudar(){
        return "Bom dia por saudacao 1";
    }
    
    static void procSaudar(){
        System.out.println("Bom dia por saudacao 2");
    }
    
    static int funcNumero(){
        return -6;
    }
    
    static void procNumero(){
        System.out.println("6");
    }
    
    static int funcSomar(int a){
        a = a + 4;
        return a;
    }
    
    static void procSomar(int a){
        a = a + 4;
        System.out.println(a);
    }
    
    static double funcFahrenheit(double celcius){
        double fahrenheit = (9/5)*celcius + 32;
        return fahrenheit;
    }
    static void procFahrenheit(double celcius){
        double fahrenheit = (9/5)*celcius + 32;
        System.out.println(fahrenheit);
    }
    
    //Sobrecarga de Métodos
    static int funcSomar(int a,int b){
        return a + b;
    }
    
    static int funcSomar(int a,int b, int c){
        return a+b+c;
    }
    
    static int funcSomar(int a,int b, String c){
        System.out.println("O valor de c ->"+c);
        return a+b;
    }
    
    static void procSomar(int a,int b){
         System.out.println(a + b);
    }
    
    static void procSomar(int a,int b, int c){
        System.out.println(a+b+c);
    }
    
}
