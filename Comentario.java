import java.util.ArrayList;
/**
 * Write a description of class Comentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comentario extends Entrada
{
    // instance variables - replace the example below with your own
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class Comentarios
     */
    public Comentario(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }

    /**
     * 
     */
    public void addComentario(String text)
    {
        comentarios.add(text);
    }
    
    public ArrayList<String> getComentarios() {
        return comentarios;
    }
}