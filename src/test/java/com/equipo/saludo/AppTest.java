package com.equipo.saludo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testSaludo() {
        assertEquals("Hola, DevOps!", App.saludar("DevOps"));
    }
}