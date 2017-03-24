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
    private static final int DATOS_ASOCIADOS = 6;
    
    /**
     * Constructor for objects of class EntradaFoto
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
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
        String cadenaADevolver = super.toString();
        
        
        
        cadenaADevolver += ". \nTitulo: " + titulo + " \nImagen" 
                    + urlImagen ;
        
        System.out.println(cadenaADevolver);
        return cadenaADevolver;
    }
    
    
    public void mostrar(){
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return DATOS_ASOCIADOS;
    }
    
    public void mostrarDatosExclusivos() {
        System.out.println(urlImagen);
        System.out.println(titulo);
	}
	
	public String nombreClase(){
        return this.getClass().getSimpleName();
    }
}







