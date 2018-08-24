
package edu.ipn.cecyt9.customer;

public class Main {


    public static void main(String[] args) {
        
        String nombre="Nombre";
        float precio=000;
        int clave=111;
        String artista="artista";
        String compania="company";
        String genero="genero";
        String idioma="lenguaje";
        
        Discos disco1 = new Discos(clave, precio);
        Discos disco2 = new Discos(clave, nombre, artista);
        Discos disco3 = new Discos(nombre, artista, compania);
        Discos disco4 = new Discos(clave, precio, genero);
        Discos disco5 = new Discos(clave, nombre, artista, compania, genero, idioma, precio);
    }
    
}
