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
    private float numeroUno ;
    private float numeroDos ;
    private float resultado ;

// Setter y Getters generados automaticamente por <click derecho> en la pantalla de edicion
// <insert code> <setter & Getter> selecciono y listo    
    public float getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(float numeroUno) {
        this.numeroUno = numeroUno;
    }

    public float getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(float numeroDos) {
        this.numeroDos = numeroDos;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
// aqui va la funcion de matematicas
    public float multiplicar() {
        this.resultado = this.numeroUno * this.numeroDos;
        return this.resultado;
    }
    public float sumar() {
        this.resultado = this.numeroUno + this.numeroDos;
        return this.resultado;
    }
    public float restar() {
        this.resultado = this.numeroUno - this.numeroDos;
        return this.resultado;
    }
    public float dividir() {
        this.resultado = this.numeroUno / this.numeroDos;
        return this.resultado;
    }
    public float modulo() { //necesita implementarse como la division
        this.resultado = this.numeroUno % this.numeroDos;
        return this.resultado;
    }
    public void primo() {   
        int cont = 2, divisores = 2;
        while (cont < this.numeroUno){
            if (this.numeroUno%2 != 0){
                cont ++ ;
            }else{
                divisores ++;
                cont++;
                break;
            }
        if (divisores>2){
            this.resultado = 0;         //es decir la respuesta es negativa
        }else{
            this.resultado = 1;

        }
        
        }
    }
}