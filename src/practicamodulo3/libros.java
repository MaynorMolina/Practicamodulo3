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
public class libros {
    private String Nombre;
    private String Autor;
    private String Categoria;
    private String Idioma;
    private String Paisorigen;
    private int Año;
    
    
    public String getNombre(){
        return Nombre;
    }
    
     public String getAutor(){
        return Autor;
    }
    
      public String getCategoria(){
        return Categoria;
    }
    
       public String getIdioma(){
        return Idioma;
    }
        public String getpaisorigen(){
        return Paisorigen;
    }
        public int getAño(){
        return Año;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public void setPaisorigen(String Paisorigen) {
        this.Paisorigen = Paisorigen;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

   
    
}
