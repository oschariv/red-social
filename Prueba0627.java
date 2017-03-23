

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Prueba0627.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Prueba0627
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF1;
    private EntradaFoto entradaF2;
    private EntradaUnionAGrupo entradaU1;
    private EntradaUnionAGrupo entradaU2;

    /**
     * Default constructor for test class Prueba0627
     */
    public Prueba0627()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("oscar", "hola");
        entradaT2 = new EntradaTexto("borja", "lol");
        entradaF1 = new EntradaFoto("oscar", "http://asdf", "win");
        entradaF2 = new EntradaFoto("borja", "http://dfaseef", "snow");
        entradaU1 = new EntradaUnionAGrupo("borja", "ALIDAM");
        entradaU2 = new EntradaUnionAGrupo("oscar", "ALIDAM");
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaT2);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaF2);
        muro1.addEntrada(entradaU1);
        muro1.addEntrada(entradaU2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
