/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

/**
 *
 * @author HP
 */
public class CursoPOOJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Apresentando a instrução de saída.
        System.out.println("Ola Mundo 1");
        System.out.print("Ola Mundo 2");
        System.out.println("Ola Mundo 3");
        
        //Declaração de variáveis
        int idade;
        String nome;
        boolean humano;
        double peso;
        float altura;
        char letraPreferida;
        
        //Atribuição
        idade = 3;
        nome = "Chico Padre";
        humano = true;
        peso = 76.7;
        altura = 1.92f;
        letraPreferida = 'C';
        
        final double pi = 3.1415;
        
        idade = 9;
        idade = 12;
        System.out.println(idade);
        idade = 50;
        System.out.println(idade);
       
        //Manipulação com saida de dados
        /*System.out.print(nome);
        System.out.println(idade);*/
        System.out.println(nome+idade);
        System.out.println(nome+" "+idade);
        nome = "Paulo das Castanhas";
        System.out.println("O meu nome é "+nome);
        System.out.println("O meu nome é "+nome+", tenho "+idade+" anos de idade.");

        System.out.println(pi);
        
        /*
            Operações
                - Aritméticos: +,-,*,/,%
                - Relacionais: >,<,==,>=,<=,!=
                - Atribuição: =
                - Lógicos: &&,||,!
        */
        
        int num1 = 4;
        int num2 = 9;
        
        int resultado1 = num1+num2;
        int resultado2;
        
        
        System.out.println(4+9);        
        System.out.println(num1+9);
        resultado2 = num1+num2;
        System.out.println(resultado2);

        int n1 = 9;
        int n2 = 3;
        int resultN;
        resultN = n1*n2;
        System.out.println("O resultado sera: "+resultN);
        
        System.out.println(78%5);
        System.out.println(8%2);
        
            
    }
    
}
