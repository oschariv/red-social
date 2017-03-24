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

    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntrada , String autor) {
        // Recorremos la coleccion
        for (Entrada entrada : entrada){
            // Decicmos si los datos se imprimen o no.
            if (entrada.getClass().getSimpleName().equals(tipoEntrada) || tipoEntrada == null) {
                if (entrada.getAutor().equals(autor) || autor == null){
                    // Imprimimos los datos Exclusivos.
                    if (entrada instanceof EntradaTexto) {
                        ((EntradaTexto)entrada).mostrarDatosExclusivos();
                    }
                    else if (entrada instanceof EntradaFoto) {
                        ((EntradaFoto)entrada).mostrarDatosExclusivos();
                    }
                    else if (entrada instanceof EntradaUnionAGrupo) {
                        ((EntradaUnionAGrupo)entrada).mostrarDatosExclusivos();
                    } 
                }
            }
        }
    }
}


