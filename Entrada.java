import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
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
    
    public Entrada(String autor, String stringMomentoPublicacion, String meGusta)
    {
        usuario = autor;
        
        // Obtenemos fecha y hora de un String
        String[] fechaYHora = stringMomentoPublicacion.split("-");
        // Dividimos los campos Fecha y Hora obtenidos.
        String[] campoFecha = fechaYHora[0].split("/");
        String[] campoHora = fechaYHora[1].split(":");
        // Transformamos a enteros todo.
        int dia = Integer.parseInt(campoFecha[0]);
        int mes = Integer.parseInt(campoFecha[1]);
        int ano = Integer.parseInt(campoFecha[2]);
        
        int hora = Integer.parseInt(campoHora[0]);
        int minuto = Integer.parseInt(campoHora[1]);
        // Creamos un momentoPublicacion con formato LocalDateTime.
        momentoPublicacion= LocalDateTime.of(ano, mes, dia, hora, minuto);
        
        cantidadMeGusta = Integer.parseInt(meGusta);
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

    protected String getStringMomentoPublicacion(){
        String cadenaADevolver = "";

        long segundosQuehanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQuehanPasadoDesdeCreacion / 60;
        long horasQueHanPasadoDesdeCreacion = minutosQueHanPasadoDesdeCreacion / 60;
        long diasQueHanPasadoDesdeCreacion = horasQueHanPasadoDesdeCreacion / 24;
        long segundosResiduales = segundosQuehanPasadoDesdeCreacion % 60;

        cadenaADevolver += "Tiempo transcurrido: Hace ";

        if (diasQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += diasQueHanPasadoDesdeCreacion + " dias.";
        }else{
            if (horasQueHanPasadoDesdeCreacion > 0) {
                cadenaADevolver += horasQueHanPasadoDesdeCreacion + " horas.";
            }
            else{
                if (minutosQueHanPasadoDesdeCreacion > 0) {
                    cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos y ";
                }
                cadenaADevolver += segundosResiduales + " segundos.";
            }
        }

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
