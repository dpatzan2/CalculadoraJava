/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.diegopatzan.model;

/**
 *
 * @author Diego Fernando Patzán Marroquín
 * @date 21/04/2021
 * @time 08:30:53
 */
public abstract class Operaciones {
   private float numero1;
    private float numero2;
    private float resultado;
    private char operador;

    public Operaciones() {
    }
 
    public Operaciones(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    protected void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }
    
    public abstract float operar(float numero1,float numero2);
    
    @Override
    public String toString(){
        return "" + numero1 + " " + operador + " " + numero2 + " = " + " " + resultado; 
    }
}
