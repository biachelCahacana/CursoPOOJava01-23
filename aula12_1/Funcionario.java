package aula12_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Funcionario extends Pessoa{
    private String nFuncionario;
    private String departamento;

    
    @Override
    public void mostrar(){
        
    }
    
    /**
     * @return the nFuncionario
     */
    public String getnFuncionario() {
        return nFuncionario;
    }

    /**
     * @param nFuncionario the nFuncionario to set
     */
    public void setnFuncionario(String nFuncionario) {
        this.nFuncionario = nFuncionario;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
