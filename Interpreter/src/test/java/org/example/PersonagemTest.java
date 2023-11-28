package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonagemTest {

    @Test
    void deveCalcularLvlUpComFormula(){
        Personagem pc = new Personagem();
        pc.setNivel(22.0);
        pc.setRecurso(1380.0);

        assertEquals(1426.0, pc.calcularLvlUp());
    }

}