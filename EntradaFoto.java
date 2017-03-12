import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
        
        cadenaADevolver = "Autor: " + usuario + ". Titulo: " + titulo + " " 
                    + urlImagen + " " + cantidadMeGusta + " Me Gusta.";
        // Comprobamos si la diferencia de los localdatetime es mayor de 59 segundos.
        if (momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS) <= 59) {
            cadenaADevolver = cadenaADevolver + " Tiempo transcurrido: " + 
                    momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS)
                            + " segundos.";
        }
        // Si es mayor mostramos los minutos y los segundos.
        else {
            cadenaADevolver = cadenaADevolver + " Tiempo transcurrido: " + 
                momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.MINUTES)
                + " minutos, " + 
                (momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS) - 60) 
                + " segundos.";
        }
        
        if (comentarios.isEmpty()) {
            cadenaADevolver = cadenaADevolver + " - No contiene comentarios";
        }
        
        //TEMPORAL
        System.out.println(cadenaADevolver);
        
        return cadenaADevolver;
    }
    
}







