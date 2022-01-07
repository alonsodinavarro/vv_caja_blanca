package com.practica.cajablanca;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SustituirPalabrasTest {

    static final String path = "C:/Users/alons/Documents/ProyectosVV/ProyectoVV_whitebox/ProyectoVV_whitebox/vv_caja_blanca/src/cases/";


    @DisplayName("Editor lee fichero vacio")
    @Test
    public void SustPalabraCase1() throws EmptyCollectionException,IllegalArgumentException{
        Editor e = new Editor();
        e.leerFichero(path+"vacio.txt");
        e.sustituirPalabra("navidad","christmas");
        assertEquals(0, e.size());
    }

    @DisplayName("Cambia una palabra")
    @Test
    public void SustPalabraCase2() throws EmptyCollectionException,IllegalArgumentException{
        Editor e = new Editor();
        e.leerFichero(path+"palabra.txt");
        e.sustituirPalabra("navidad","christmas");
        assertEquals("[christmas]", e.getLinea(1).toString());
    }
    @DisplayName("No existe la palabra que se quiere cambiar")
    @Test
    public void SustPalabraCase3() throws EmptyCollectionException,IllegalArgumentException{
        Editor e = new Editor();
        e.leerFichero(path+"palabra.txt");
        e.sustituirPalabra("pascua","christmas");
        assertEquals("[navidad]", e.getLinea(1).toString());
    }
    @DisplayName("Cambiar mas de una palabra")
    @Test
    public void SustPalabraCase4() throws EmptyCollectionException,IllegalArgumentException{
        Editor e = new Editor();
        e.leerFichero(path+"3palabra.txt");
        e.sustituirPalabra("navidad","christmas");
        assertEquals("[christmas, christmas, christmas]",e.getLinea(1).toString());

    }



}
