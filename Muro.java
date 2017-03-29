import java.util.ArrayList;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;

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

    public void mostrarMuroEnNavegador(){
        // Obtenemos una referencia a una ruta donde estará el archivo
        Path rutaArchivo = Paths.get("Muro.html");

        // Abrimos el archivo, escribimos en él y lo cerramos. 
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<!DOCTYPE html>");
            archivo.write("<html>");
            archivo.write("<head>");
            archivo.write("<title>SocialBook</title>");
            archivo.write("</head>");
            archivo.write("<body>");
            archivo.write("<h1>Muro Social</h1>");
            for (Entrada entrada : entrada){
                if (entrada instanceof EntradaTexto) {
                    archivo.write("<p>" + ((EntradaTexto)entrada).toString() + "</p>");
                }
                else if (entrada instanceof EntradaFoto) {
                    archivo.write("<p>" + ((EntradaFoto)entrada).toString() + "</p>");
                }
                else if (entrada instanceof EntradaUnionAGrupo) {
                    archivo.write("<p>" +  ((EntradaUnionAGrupo)entrada).toString() + "</p>");
                } 
            }

            archivo.write("</body>");
            archivo.write("</html>");

            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
    }
}

