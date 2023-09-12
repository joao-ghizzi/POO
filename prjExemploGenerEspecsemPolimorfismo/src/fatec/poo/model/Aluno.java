/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;


public class Aluno extends Pessoa {
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscilar, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.regEscolar = regEscilar;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setRegEscolar(int regEscolar) {
        this.regEscolar = regEscolar;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    
    
}
