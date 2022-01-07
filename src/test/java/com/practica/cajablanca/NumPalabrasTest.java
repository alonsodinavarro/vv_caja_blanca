package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NumPalabrasTest {

    static final String path = "C:/Users/alons/Documents/ProyectosVV/ProyectoVV_whitebox/ProyectoVV_whitebox/vv_caja_blanca/src/cases/";

    @DisplayName("Test para camino 1-2-3-1")
    @Test
    public void numPalabrasCase1() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        e.leerFichero(path+"2palabras.txt");
        assertThrows(IllegalArgumentException.class, ()-> e.numPalabras(-1,0,"navidad"), "No ha saltado la excepción con parametros negativos");
    }

    @DisplayName("Test para camino 1-2-4-5-1")
    @Test
    public void numPalabrasCase2() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        assertThrows(IllegalArgumentException.class, ()-> e.numPalabras(0,1,"navidad"), "No ha saltado la excepción con texto vacío");

    }

    @DisplayName("Test para camino 1-2-4-6-7-21")
    @Test
    public void numPalabrasCase3() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        assertEquals(0, e.numPalabras(1,0,"navidad"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-21")
    @Test
    public void numPalabrasCase4() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        e.leerFichero(path+"palabras.txt");
        assertEquals(0, e.numPalabras(1,1,"navidad"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-18-8-21")
    @Test
    public void numPalabrasCase5() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        e.leerFichero(path+"vacio.txt");
        assertEquals(0, e.numPalabras(1,0,"navidad"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-12-16-11-18-8-21")
    @Test
    public void numPalabrasCase6() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        e.leerFichero(path+"palabras.txt");
        assertEquals(0, e.numPalabras(1,2,"hola"));
    }

    @DisplayName("Test para camino 1-2-4-6-7-8-9-10-11-12-13-14-16-11-18-8-21")
    @Test
    public void numPalabrasCase7() throws EmptyCollectionException, IllegalArgumentException {
        Editor e = new Editor();
        e.leerFichero(path+"palabras.txt");
        assertEquals(2, e.numPalabras(1,3,"navidad"));
    }

}
