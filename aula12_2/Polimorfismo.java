/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12_2;

/**
 *
 * @author HP
 */
public class Polimorfismo {
    public static void main(String[] args) {
        Animais a = new Animais();
        a.alimentar();
        Cavalo c = new Cavalo();
        c.alimentar();
        Crocodilo cr = new Crocodilo();
        cr.alimentar();
    }
}
