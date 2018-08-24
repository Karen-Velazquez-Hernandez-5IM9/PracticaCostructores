/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ipn.cecyt9.customer;

/**
 *
 * @author Alumno
 */
public abstract class DiscosAbs {
    
    public int saltarPista(boolean salto){
        int pista = 0;
        
        if (salto = true) {
            pista++;
        }
        
        return pista;
    }
    
    public String noPista(int num){
        String titulo="a";
        int noPista = num;
        switch(noPista){
            case 1:
                titulo="a";
                break;
            case 2:
                titulo="b";
                break;
            default:
                titulo="z";
        }
        return titulo;
    }
    
    public boolean detenerMusica(String indica){
        String opcion = indica;
        boolean detiene;
        if (opcion.equals("Detener")) {
            detiene = true;
        }
        else{
            detiene = false;
        }
        return detiene;
    }
    
    public abstract int regresaPista(boolean regresa);
    public abstract int reiniciaPista(boolean reinicia);
}
