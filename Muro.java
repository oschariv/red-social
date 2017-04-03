import java.util.ArrayList;
// Imports para escribir ficheros y mostrar excepciones
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.io.IOException;

import java.util.Scanner;
import java.net.URL;

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
    private String user;
    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        entrada = new ArrayList<>();
        user = "";
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
        Path rutaArchivo = Paths.get("muro.html");

        // Abrimos el archivo, escribimos en él y lo cerramos. 
        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write("<!DOCTYPE html><html><head><title>SocialBook "+ this.user + "</title><link rel=\"stylesheet\" href=\"Recursos/estilomuro.css\"></head><body><div class=\"agrupar\"><nav class=\"menu\"><ul><li class=\"botonmenu\"><a href=\"muro.html\">Muro Social</a></li><li class=\"botonmenu\"><a href=\"https://www.google.es/\">Busqueda</a></li><li class=\"botonmenu\">Contactos</li><li class=\"botonmenu\">Mensajes</li><li class=\"botonmenu\"><a href=\"https://github.com/oschariv\">Mi Perfil</a></li></ul></nav><section class=\"seccion\"><h1 class=\"h1\">Seccion de noticias " + this.user + "</h1>");
            for (Entrada entrada : entrada){    
                archivo.write("<article class=\"articulo\">" + entrada.toStringWeb() + "</article>");
            }

            archivo.write("</section><footer class=\"pie\">Web creada por Oscar Charro Rivera <a href=\"https://github.com/oschariv\">(@Oschariv)</a></footer></div></body></html>");

            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }

        // Abrimos el archivo con el navegador

        try {
            Runtime.getRuntime().exec("C:/Program Files (x86)/Mozilla Firefox/firefox.exe"+" "+"Muro.html");
        }
        catch (IOException excepcion) {
            System.out.println(excepcion.toString());
        }

    }

    public void mostrarMuroEnNavegador(String user){
        try  
        {
            // URL para obtener datos de las entradas.
            URL url = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user="+user);
            // Escaner para obtner las lineas de la url
            Scanner sc = new Scanner(url.openStream());
            this.user = user;
            
            while (sc.hasNext()) {
                String lineaLeida = sc.nextLine();
                String[] lineaActual = lineaLeida.split(";");
                if (lineaActual[0].equals("EntradaTexto")){
                    EntradaTexto entradaTexto = new EntradaTexto(lineaActual[1], lineaActual[2], lineaActual[3], lineaActual[4], lineaActual[5]);
                    entrada.add(entradaTexto);
                }
                else if (lineaActual[0].equals("EntradaFoto")) {
                    EntradaFoto entradaFoto = new EntradaFoto(lineaActual[1], lineaActual[2], lineaActual[3], lineaActual[4], lineaActual[5], lineaActual[6]);
                    entrada.add(entradaFoto);
                }
                else if (lineaActual[0].equals("EntradaUnionAGrupo")) {
                    EntradaUnionAGrupo entradaUnionAGrupo = new EntradaUnionAGrupo(lineaActual[1], lineaActual[2], lineaActual[3], lineaActual[4]);
                    entrada.add(entradaUnionAGrupo);
                }
            }
            sc.close();

            this.mostrarMuroEnNavegador();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }

    }

}
