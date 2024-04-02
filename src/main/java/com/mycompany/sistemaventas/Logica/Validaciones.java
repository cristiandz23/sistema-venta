
package com.mycompany.sistemaventas.Logica;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;


public class Validaciones {
    
    //SOLO INGRESAR TEXTO
    public void soloTexto(KeyEvent evt){
        //declaro una variable y le asigno un evento tipo char
        char car = evt.getKeyChar();
        if((car<'a'|| car>'z')&&(car<'A'|| car>'Z')&&(car!=(char)KeyEvent.VK_BACK_SPACE)&&car!=(char)KeyEvent.VK_SPACE){
            evt.consume();
        }
    }
    //SOLO INGRESAR NUMERO
    public void soloNumeros(KeyEvent evt){
        //declaro una variable y le asigno un evento tipo char
        char car = evt.getKeyChar();
        if((car<'0'||car>'9')&& (car!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
   //INGRESAR SOLO NUMEROS Y PERMITIR DECIMALES
    public void aceptarDecimales(KeyEvent evt, JTextField textField){
        //declaro una variable y le asigno un evento tipo char
        char car = evt.getKeyChar();
        if((car<'0'||car>'9')&&textField.getText().contains(".")&&(car!=(char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }else if((car < '0' || car > '9') && ( car != '.') && ( car != (char)KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
    }
    
}
