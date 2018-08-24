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
public class Discos {
    private String nombre;
    private float precio;
    private int clave;
    private String artista;
    private String compania;
    private String genero;
    private String idioma;
    
    public Discos(int cla, float pre){
        this.clave=cla;
        this.precio=pre;
        
        System.out.println("Clave: "+cla+", Precio: "+pre);
    }
    
    public Discos(int cla, String nom, String art){
        this.clave=cla;
        this.nombre=nom;
        this.artista=art;
        
        System.out.println("El disco con clave: "+cla+" es: "+nom+",de "+art);
    }
    
    public Discos(String nom, String art, String comp){
        this.compania=comp;
        this.nombre=nom;
        this.artista=art;
        
        System.out.println("El disco: "+nom+", de "+art+" pertenece a la compañía "+comp);
    }
    
    public Discos(int cla, float pre, String gen){
        this.clave=cla;
        this.precio=pre;
        this.genero=gen;
        
        System.out.println("El disco con clave: "+cla+" cuesta $"+pre+" y pertenece al genero"+gen);
    }
    
    public Discos(int cla, String nom, String art, String comp, String gen, String idi, float pre){
        this.clave=cla;
        this.nombre=nom;
        this.artista=art;
        this.compania=comp;
        this.idioma=idi;
        this.genero=gen;
        this.precio=pre;
        
        System.out.println("Datos del disco con clave: "+cla);
        System.out.println("Titulo: "+nom);
        System.out.println("Artista: "+art);
        System.out.println("Compañia: "+comp);
        System.out.println("Genero: "+gen);
        System.out.println("Idioma: "+idi);
        System.out.println("Precio: $"+pre);
        
    }
    
}
