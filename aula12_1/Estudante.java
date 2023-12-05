package aula12_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Estudante extends Pessoa{
    private String numEstudante;
    private String curso;

    @Override
    public void mostrar(){
        
    }
    
    /**
     * @return the numEstudante
     */
    public String getNumEstudante() {
        return numEstudante;
    }

    /**
     * @param numEstudante the numEstudante to set
     */
    public void setNumEstudante(String numEstudante) {
        this.numEstudante = numEstudante;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
