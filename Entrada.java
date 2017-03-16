import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private ArrayList<String> comentarios;
    private int cantidadMeGusta;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
        comentarios = new ArrayList<String>();
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    /**
     * 
     */
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    /**
     * 
     */
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }
    
    /**
     * 
     */
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
    /**
     * 
     */
    public String toString()
    {
        String cadenaADevolver = null;
        
        return cadenaADevolver;
    }
    
    public String getAutor() {
        return usuario;
    }
    
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}











