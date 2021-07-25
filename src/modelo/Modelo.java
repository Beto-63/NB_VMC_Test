/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author isaz
 */
public class Modelo {
    private int numeroUno;
    private int numeroDos;
    private int resultado;

// Setter y Getters generados automaticamente por <click derecho> en la pantalla de edicion
// <insert code> <setter & Getter> selecciono y listo    
    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
// aqui va la funcion de matematicas
    public int multiplicar() {
        this.resultado = this.numeroUno * this.numeroDos;
        return this.resultado;
    }
}
