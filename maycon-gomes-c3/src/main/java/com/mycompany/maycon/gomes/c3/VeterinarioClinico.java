/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maycon.gomes.c3;

/**
 *
 * @author mmaia
 */
public class VeterinarioClinico {
    protected String nome;
    protected Integer codigo;
    protected Integer qtdConsulta;
    protected Double valorConsulta;

    
    public VeterinarioClinico(String nome, Integer codigo, Integer qtdConsulta, Double valorConsulta){
        this.nome = nome;
        this.codigo = codigo;
        this.qtdConsulta = qtdConsulta;
        this.valorConsulta = valorConsulta;
        
    }
    

    
   public double calculaSalario(){
    return this.qtdConsulta *  + this.valorConsulta ;
    
   
   }

    public String getNome() {
        return nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getQtdConsulta() {
        return qtdConsulta;
    }

    public Double getValorConsulta() {
        return valorConsulta;
    }

    @Override
    public String toString() {
        return "VeterinarioClinico{" + "nome=" + nome + ","
                + " codigo=" + codigo + ", qtdConsulta=" + qtdConsulta + ", valorConsulta=" +
                valorConsulta +  calculaSalario() +'}';
    }
   
    
}


