import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
    private int cantidadMeGusta;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        usuario = autor;
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
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Autor: " + usuario + "\n";
        
        long segundosQuehanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Tiempo transcurrido: ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos y ";
        }
        cadenaADevolver += segundosResiduales + " segundos.\n";
        
        cadenaADevolver += getCantidadMeGusta() + " Me Gusta.\n";
        
        
        return cadenaADevolver;
    }
    
    public String getAutor() {
        return usuario;
    }
    
    public void mostrar(){
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return 0;
    }
    
     public String nombreClase(){
        return this.getClass().getSimpleName();
    }
}











