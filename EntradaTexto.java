import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends Entrada
{
    // instance variables - replace the example below with your own
    
    private String mensaje;
    

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
        
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
    public String toString()
    {
        String cadenaADevolver = null;
        
        cadenaADevolver = "Autor: " + getAutor() + ". \nMensaje: " + mensaje + " \n" +
                    getCantidadMeGusta() + " Me Gusta.";
                    
        long segundosQuehanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "\nTiempo transcurrido: ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos.";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";
        
        if (getComentarios().isEmpty()) {
            cadenaADevolver +=  "No contiene comentarios";
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