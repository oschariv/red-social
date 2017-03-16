import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    // instance variables - replace the example below with your own
    private String grupo;

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String autor, String grupo)
    {
        super(autor);
        this.grupo = grupo;
    }

    public String toString()
    {
        String cadenaADevolver = null;
        
        cadenaADevolver = getAutor() + "se ha unido al grupo " + grupo + ". \n" +
                    getCantidadMeGusta() + " Me Gusta.";
                    
        long segundosQuehanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "\nTiempo transcurrido: ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos.";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";
        
        //TEMPORAL
        System.out.println(cadenaADevolver);
        return cadenaADevolver;
    }
}
