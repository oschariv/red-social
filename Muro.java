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

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        mensajes = new ArrayList<EntradaTexto>();
        fotos = new ArrayList<EntradaFoto>();
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
    public void toSTring()
    {
        if (!mensajes.isEmpty()) {
            for (EntradaTexto entradaTextoActual : mensajes) {
                entradaTextoActual.toString();
            }
        }
        
        if (!fotos.isEmpty()) {
            for (EntradaFoto entradaFotoActual : fotos) {
                entradaFotoActual.toString();
            }
        }
        
        
    }
}
