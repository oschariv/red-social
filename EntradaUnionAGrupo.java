import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    // instance variables - replace the example below with your own
    private String unionGrupo;
    private static final int DATOS_ASOCIADOS = 4;
    
    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String autor, String unionGrupo)
    {
        super(autor);
        this.unionGrupo = unionGrupo;
    }

    public String toString()
    {
        String cadenaADevolver = super.toString();
        
        cadenaADevolver += getAutor() + "se ha unido al grupo " + unionGrupo + ". \n" +
                    getCantidadMeGusta() + " Me Gusta.";
                    
        return cadenaADevolver;
    }
    
    public void mostrar(){
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada(){
        return DATOS_ASOCIADOS;
    }
    
    public void mostrarDatosExclusivos() {
		System.out.println(unionGrupo);
	}
	
	public String nombreClase(){
        return this.getClass().getSimpleName();
    }
    
    /**
     * Metodo para imprimir datos para luego crear una pagina html.
     */
    public String toStringWeb(){
        String cadenaADevolver = super.toStringWeb();

        cadenaADevolver += "</header>" + "\n" +
        "<section>" + "\n" + "<hgroup>" + "\n" +
        "<h2>Se ha unido a : " + unionGrupo + "</h2>" + "\n" + "</hgroup>" + "\n" +
        "</section>";

        return cadenaADevolver;
    }
    
    
    
    
    
    
    
    
    
    
    
}
