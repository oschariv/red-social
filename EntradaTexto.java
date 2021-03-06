import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends Comentario
{
    // instance variables - replace the example below with your own

    private String mensaje;
    private static final int DATOS_ASOCIADOS = 5;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        super(autor);
        mensaje = texto;
    }
    
    public EntradaTexto(String autor, String meGusta, String momentoPublicacion, String texto, String comentarios)
    {
        super(autor, momentoPublicacion, meGusta, comentarios);
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
        String cadenaADevolver = super.toString();

        cadenaADevolver +=". \nMensaje: " + mensaje + " \n";

        System.out.println(cadenaADevolver);
        return cadenaADevolver;
    }

    public void mostrarAutorYMensaje() {
        System.out.println("Autor: " + getAutor() + "\nMensaje: " + mensaje);
    }

    public void mostrar(){
        System.out.println(this);
    }

    public int getCantidadDeDatosAsociadosALaEntrada(){
        return DATOS_ASOCIADOS;
    }

    public void mostrarDatosExclusivos() {
        System.out.println(mensaje);
    }

    public String nombreClase(){
        return this.getClass().getSimpleName();
    }

    /**
     * Metodo para imprimir datos para luego crear una pagina html.
     */
    public String toStringWeb(){
        String cadenaADevolver = super.toStringWeb();

        cadenaADevolver += "<section>" + "\n" + "</hgroup>" + "\n" +
        "<h2>Ha publicada: " + mensaje + "</h2>" + "\n" + "</hgroup>" + "\n" +
        "</section>" + "\n";
        
        return cadenaADevolver;
    }

}
