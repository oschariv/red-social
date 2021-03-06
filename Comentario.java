import java.util.ArrayList;
/**
 * Write a description of class Comentarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Comentario extends Entrada
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
    
    public Comentario(String autor, String momentoPublicacion, String meGusta, String comentarios) {
        super(autor, momentoPublicacion, meGusta);
        this.comentarios = new ArrayList<String>();
        if (!comentarios.equals("Sin comentarios")) {
            String[] divisionComentarios = comentarios.split("%");
            for (String comentario : divisionComentarios) {
                this.comentarios.add(comentario);
            }
        }
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
    
    public String toString() {
        String cadenaADevolver = super.toString();
        
        
        
        return cadenaADevolver;
    }
    
    public String toStringWeb(){
        String cadenaADevolver = super.toStringWeb();

        cadenaADevolver += "<footer>" + "\n" + "<p>" + "\n";
        if (getComentarios().isEmpty()) {
            cadenaADevolver = cadenaADevolver + "No contiene comentarios";
        }
        else {
            cadenaADevolver += "Comentarios:\n <br />";
            for (String comentario : getComentarios()) {
                cadenaADevolver += "&nbsp;&nbsp;&nbsp;&nbsp;- " + comentario + "<br />" + "\n";
            }
        }
        
        cadenaADevolver += "<br />" + "\n" + "</p>" + "\n" + "</footer>";

        return cadenaADevolver;
    }
    
    
    
    
}
