package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MayorLongitudTest {

    static final String path = "C:/Users/alons/Documents/ProyectosVV/ProyectoVV_whitebox/ProyectoVV_whitebox/vv_caja_blanca/src/cases/";

    @DisplayName("Test de camino 1-2-3-16")
    @Test
    public void MaxLongCase1() throws EmptyCollectionException {
        Editor e = new Editor();
        assertEquals(null,e.mayorLongitud());
    }
    @DisplayName("Test de camino 1-2-3-4-5-6-4-16")
    @Test
    public void MaxLongCase2() throws EmptyCollectionException {
        Editor e = new Editor();
        e.leerFichero(path+"vacio.txt");
        assertEquals(null,e.mayorLongitud());
    }
    @DisplayName("Test de camino 1-2-3-4-5-6-7-8-9-6-4-16")
    @Test
    public void MaxLongCase3() throws EmptyCollectionException {
        Editor e = new Editor();
        e.leerFichero(path+"palabra.txt");
        assertEquals("navidad",e.mayorLongitud());
    }
    @DisplayName("Test de camino 1-2-3-4-5-6-7-8-10-6-4-16")
    @Test
    public void MaxLongCase4() throws EmptyCollectionException {
        Editor e = new Editor();
        e.leerFichero(path+"palabras.txt");
        assertEquals("navidades",e.mayorLongitud());
    }
    @DisplayName("Test de camino 1-2-3-4-5-6-7-8-10-11-6-4-16")
    @Test
    public void MaxLongCase5() throws EmptyCollectionException  {
        Editor e = new Editor();
        e.leerFichero(path+"2palabras.txt");
        assertEquals("christmasss",e.mayorLongitud());
    }
}

