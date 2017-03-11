import java.time.LocalDateTime;
import java.util.ArrayList;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto
{
    // instance variables - replace the example below with your own
    private String usuario;
    private String mensaje;
    private LocalDateTime momentoPublicacion;
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        this.usuario = autor;
        this.mensaje = texto;
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
    public String getMensaje()
    {
        return mensaje;
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
    public String toString()
    {
        String cadenaADevolver = null;        
        return cadenaADevolver;
    }
}