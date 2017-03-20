import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/**
 * Write a description of class EntradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends Comentario
{
    // instance variables - replace the example below with your own
    private String urlImagen;
    private String titulo;
    
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    /**
     * 
     */
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    /**
     * 
     */
    public String getTituloImagen()
    {
        return titulo;
    }
    
    /**
     * 
     */
    public String toString()
    {
        String cadenaADevolver = super.toString();
        
        
        
        cadenaADevolver += ". \nTitulo: " + titulo + " \nImagen" 
                    + urlImagen ;
        
        System.out.println(cadenaADevolver);
        return cadenaADevolver;
    }
    
    
    public void mostrar(){
        System.out.println(this);
    }
}







