/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author isaz
 */
public class Controlador implements ActionListener{
    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {
        this.view = view;
        this.model = model;
        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);
// cuando se invoca este constructor, se le dice que debe estar pendiente de listen a el btnMultiplicar CREO!        
    }
//  Pone un titulo a la ventana y la pone a arrancar en el centro de la pantalla
    public void iniciar(){
        view.setTitle("Segundo intento  de View-Mod-Cont de Calculadora");
        view.setLocationRelativeTo(null);
    }
//  Desde el controlador obtengo los valores de la vista y los pongo en el modelo e invoco el metodo de multiplicar 
//  y se procede a enviar a la vista el resultado de int a text  
//  Ahora bien, como es una calculadora con multiples botones la acciona a realizar tiene que consultar que boton se selecciono
//  la instruccion if (e.getSource() == view.btnSumar) consulta al evento e, de cual btn proviene 
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Float.parseFloat(view.txtNumeroUno.getText()));
        model.setNumeroDos(Float.parseFloat(view.txtNumeroDos.getText()));
        if (e.getSource() == view.btnMultiplicar){
            model.multiplicar(); 
            view.lblOperacion.setText(" X ");
            view.txtResultado.setText(String.valueOf(model.getResultado()));
        }
        if (e.getSource() == view.btnSumar){
            model.sumar(); 
            view.lblOperacion.setText(" + ");
            view.txtResultado.setText(String.valueOf(model.getResultado()));
        }
        if (e.getSource() == view.btnRestar){
            model.restar(); 
            view.lblOperacion.setText(" - ");
            view.txtResultado.setText(String.valueOf(model.getResultado()));
        }
        if (e.getSource() == view.btnDividir){
            view.lblOperacion.setText(" / ");
            if (model.getNumeroDos() != 0){
                model.dividir();
                view.txtResultado.setText(String.valueOf(model.getResultado()));
            } else {
                view.txtResultado.setText("Error.");
            }
        }
        
    }
    
    
    
    
}
