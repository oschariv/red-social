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
        titulo = titulo;
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
        String cadenaADevolver = null;
        
        cadenaADevolver = "Autor: " + getAutor() + ". \nTitulo: " + titulo + " \n" 
                    + urlImagen + " \n" + getCantidadMeGusta() + " Me Gusta.";
        
        long segundosQuehanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "\nTiempo transcurrido: ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos.";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";
        
        if (getComentarios().isEmpty()) {
            cadenaADevolver = cadenaADevolver + " - No contiene comentarios";
        }
        else {
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario + "\n";
            }
        }
        
        //TEMPORAL
        System.out.println(cadenaADevolver);
        
        return cadenaADevolver;
    }
    
}







