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
    private ArrayList<Entrada> entrada;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entrada = new ArrayList<>();
    }

    /**
     * 
     */
    public void addEntrada(Entrada entrada)
    {
        this.entrada.add(entrada);
    }

    /**
     * 
     */
    public String toSTring()
    {
        String cadenaADevolver = "";

        if (!entrada.isEmpty()) {
            for (Entrada entradaActual : entrada) {
                cadenaADevolver += entradaActual.toString() + "\n";
            }
        }
        System.out.println(cadenaADevolver);      
        return cadenaADevolver;
    }

    public void mostrar() {
        System.out.println(this);
    }

    public void verCantidadDatosPorEntrada(){
        String cadenaADevolver = "";

        if (!entrada.isEmpty()) {
            for (Entrada entradaActual : entrada) {
                cadenaADevolver += entradaActual.getCantidadDeDatosAsociadosALaEntrada()
                + "\n";
            }
        }
        System.out.println(cadenaADevolver);
    }

    public void mostrarDatosExclusivosEntradasFiltradas(String entradaABuscar , String usuarioABuscar) {
        String cadena = "";
        if (!entrada.isEmpty()) {
            for (Entrada entradaActual : entrada) {
                if (usuarioABuscar.equals(entradaActual.getAutor())){
                    if (entradaActual instanceof EntradaTexto){
                        cadena += ((EntradaTexto) entradaActual).mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaFoto){
                        cadena += ((EntradaFoto) entradaActual).mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaUnionAGrupo){
                        cadena += ((EntradaUnionAGrupo) entradaActual).mostrarDatosExclusivos();
                    }
                }
            }
        }
        System.out.println(cadena);
    }
}





