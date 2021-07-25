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
// cuando se invoca este constructor, se le dice que debe estar pendiente de listen a el btnMultiplicar CREO!        
    }
//  Pone un titulo a la ventana y la pone a arrancar en el centro de la pantalla
    public void iniciar(){
        view.setTitle("Primer intento exitoso de ModViewCont");
        view.setLocationRelativeTo(null);
    }
//  Desde el controlador obtengo los valores de la vista y los pongo en el modelo e invoco el metodo de multiplicar 
//  y se procede a enviar a la vista el resultado de int a text    
    public void actionPerformed(ActionEvent e){
        model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
        model.multiplicar();
        view.txtResultado.setText(String.valueOf(model.getResultado()));
    }
    
    
    
    
}
