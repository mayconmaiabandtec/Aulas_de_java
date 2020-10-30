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
public class VeterinarioCirurgiao extends VeterinarioClinico{
    private Integer qtdCirurgia ;
    private Double valorCirurgia;

    public VeterinarioCirurgiao(String nome, Double valorConsulta, Integer codigo, Integer qtdConsulta) {
        super(nome, codigo, qtdConsulta, valorConsulta);
        this.qtdCirurgia = qtdCirurgia;
        this.valorCirurgia = valorCirurgia;
        
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + (qtdCirurgia * valorCirurgia); 
}

    @Override
    public String toString() {
        return "VeterinarioCirurgiao{" + "qtdCirurgia=" + qtdCirurgia + ", valorCirurgia=" + valorCirurgia + calculaSalario()+'}';
    }
}
