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
        
        cadenaADevolver += "Autor: " + usuario + "\n" + getStringMomentoPublicacion()
         + "\n" + getCantidadMeGusta() + " Me Gusta.\n";
        
        
        return cadenaADevolver;
    }
    
    public String getStringMomentoPublicacion(){
        String cadenaADevolver = "";
        
        long segundosQuehanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Tiempo transcurrido: ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos y ";
        }
        cadenaADevolver += segundosResiduales + " segundos.";
        
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
    
    public String toStringWeb(){
        String cadenaADevolver = "";
        
        cadenaADevolver += cadenaADevolver += "<header>" + "\n" +
        "<hgroup>" + "\n" +
        "<h1>" + usuario + "</h1>" + "\n" +
        "</hgroup>" + "\n" +
        "</header>" + "\n" +
        "<section>" + "\n" +
        "<p>" + "\n" +
        getCantidadMeGusta() + " Me Gusta. " + " " + getStringMomentoPublicacion() + "\n" +
        "</p>" + "\n" +
        "</section>" + "\n";
        
        return cadenaADevolver;
    }
    
    
    
    
    
    
    
}

