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
        
        cadenaADevolver = "Autor: " + usuario + ". \nMensaje: " + mensaje + " \n" +
                    cantidadMeGusta + " Me Gusta.";
                    
        long segundosQuehanPasadoDesdeCreacion = momentoPublicacion.until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "\nTiempo transcurrido: ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos.";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";
        
        if (comentarios.isEmpty()) {
            cadenaADevolver +=  "No contiene comentarios";
        }
        else {
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : comentarios) {
                cadenaADevolver += comentario + "\n";
            }
        }
        
        //TEMPORAL
        System.out.println(cadenaADevolver);
        return cadenaADevolver;
    }
}