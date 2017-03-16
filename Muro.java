import java.util.ArrayList;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList<EntradaTexto> mensajes;
    private ArrayList<EntradaFoto> fotos;
    private ArrayList<EntradaUnionAGrupo> grupo;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        mensajes = new ArrayList<EntradaTexto>();
        fotos = new ArrayList<EntradaFoto>();
        grupo = new ArrayList<EntradaUnionAGrupo>();
    }

    /**
     * 
     */
    public void addEntradaTexto(EntradaTexto entradaTexto)
    {
        mensajes.add(entradaTexto);
    }

    /**
     * 
     */
    public void addEntradaFoto(EntradaFoto entradaFoto)
    {
        fotos.add(entradaFoto);
    }
    
    /**
     * 
     */
    public void addEntradaUnionAGrupo(EntradaUnionAGrupo entradaUnionAGrupo)
    {
        grupo.add(entradaUnionAGrupo);
    }

    /**
     * 
     */
    public String toSTring()
    {
        String cadenaADevolver = "";
        
        if (!mensajes.isEmpty()) {
            for (EntradaTexto entradaTextoActual : mensajes) {
                cadenaADevolver += entradaTextoActual.toString() + "\n";
            }
        }
        
        if (!fotos.isEmpty()) {
            for (EntradaFoto entradaFotoActual : fotos) {
                cadenaADevolver += entradaFotoActual.toString() + "\n";
            }
        }
        
        if (!grupo.isEmpty()) {
            for (EntradaUnionAGrupo entradaGrupoActual : grupo) {
                cadenaADevolver += entradaGrupoActual.toString() + "\n";
            }
        }
        
        return cadenaADevolver;
    }
    
    public void mostrar() {
        System.out.println(this);
    }
}
