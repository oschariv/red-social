import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Write a description of class EntradaFoto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String urlImagen;
    private String titulo;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        this.usuario = autor;
        this.urlImagen = url;
        this.titulo = titulo;
        comentarios = new ArrayList<String>();
        momentoPublicacion = LocalDateTime.now();
    }

    /**
     * 
     */
    public void meGusta()
    {
        
    }
    
    /**
     * 
     */
    public void addComentario(String text)
    {
        
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
    public LocalDateTime getMomnetoPublicacion()
    {
        return momentoPublicacion;
    }
    
    /**
     * 
     */
    public String toString()
    {
        String cadenaADevolver = null;
        return cadenaADevolver;
    }
    
}







