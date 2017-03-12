import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
    private int cantidadMeGusta;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        this.usuario = autor;
        this.mensaje = texto;
        comentarios = new ArrayList<String>();
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0;
    }

    /**
     * 
     */
    public void meGusta()
    {
        cantidadMeGusta++;
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
        
        cadenaADevolver = "Autor: " + usuario + ". Mensaje: " + mensaje + " " +
                    cantidadMeGusta + " Me Gusta.";
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