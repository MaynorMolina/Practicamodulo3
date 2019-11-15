/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamodulo3;

/**
 *
 * @author Maynor Molina
 */
public class Practicamodulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        libros Libro = new libros ();
        Libro.setNombre("Ellos");
        Libro.setAutor("Cesar Fernandez");
        Libro.setCategoria("Terror");
        Libro.setIdioma("Español");
        Libro.setPaisorigen("España");
        Libro.setAño(2019);
        
        
        
        
        System.out.println("Nombre: " + Libro.getNombre() );
        System.out.println("Autor: " + Libro.getAutor() );
        System.out.println("Categoria: " + Libro.getCategoria() );
        System.out.println("Idioma: " + Libro.getIdioma() );
        System.out.println("Paisorigen: " + Libro.getpaisorigen() );
        System.out.println("Año: " + Libro.getAño() );

        
       
    }
    
}
