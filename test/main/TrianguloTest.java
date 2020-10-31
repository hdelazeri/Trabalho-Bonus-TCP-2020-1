package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void trianguloEscalenoValido() {
        Triangulo t = new Triangulo(3, 4, 5);
        assertTrue(t.ehValido());
        assertEquals(TipoTriangulo.ESCALENO, t.tipo());
    }

    @Test
    void trianguloIsocelesValidoAIgualB() {
        Triangulo t = new Triangulo(2, 2, 3);
        assertTrue(t.ehValido());
        assertEquals(TipoTriangulo.ISOCELES, t.tipo());
    }

    @Test
    void trianguloIsocelesValidoAIgualC() {
        Triangulo t = new Triangulo(2, 3, 2);
        assertTrue(t.ehValido());
        assertEquals(TipoTriangulo.ISOCELES, t.tipo());
    }

    @Test
    void trianguloIsocelesValidoBIgualC() {
        Triangulo t = new Triangulo(3, 2, 2);
        assertTrue(t.ehValido());
        assertEquals(TipoTriangulo.ISOCELES, t.tipo());
    }

    @Test
    void trianguloEquilateroValido() {
        Triangulo t = new Triangulo(2, 2, 2);
        assertTrue(t.ehValido());
        assertEquals(TipoTriangulo.EQUILATERO, t.tipo());
    }

    @Test
    void ladoAIgualAZero() {
        Triangulo t = new Triangulo(0, 4, 5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladoBIgualAZero() {
        Triangulo t = new Triangulo(3, 0, 5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladoCIgualAZero() {
        Triangulo t = new Triangulo(3, 4, 0);
        assertFalse(t.ehValido());
    }

    @Test
    void ladosAeBIguaisAZero() {
        Triangulo t = new Triangulo(0, 0, 5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladosAeCIguaisAZero() {
        Triangulo t = new Triangulo(0, 4, 0);
        assertFalse(t.ehValido());
    }

    @Test
    void ladosBeCIguaisAZero() {
        Triangulo t = new Triangulo(3, 0, 0);
        assertFalse(t.ehValido());
    }

    @Test
    void tresLadosIguaisAZero() {
        Triangulo t = new Triangulo(0, 0, 0);
        assertFalse(t.ehValido());
    }

    @Test
    void ladoANegativo() {
        Triangulo t = new Triangulo(-3, 4, 5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladoBNegativo() {
        Triangulo t = new Triangulo(3, -4, 5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladoCNegativo() {
        Triangulo t = new Triangulo(3, 4, -5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladosAeBNegativos() {
        Triangulo t = new Triangulo(-3, -4, 5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladosAeCNegativos() {
        Triangulo t = new Triangulo(-3, 4, -5);
        assertFalse(t.ehValido());
    }

    @Test
    void ladosBeCNegativos() {
        Triangulo t = new Triangulo(3, -4, -5);
        assertFalse(t.ehValido());
    }

    @Test
    void tresLadosNegativos() {
        Triangulo t = new Triangulo(-3, -4, -5);
        assertFalse(t.ehValido());
    }

    @Test
    void somaAeBIgualAC() {
        Triangulo t = new Triangulo(2, 2, 4);
        assertFalse(t.ehValido());
    }

    @Test
    void somaAeCIgualAB() {
        Triangulo t = new Triangulo(2, 4, 2);
        assertFalse(t.ehValido());
    }

    @Test
    void somaBeCIgualAA() {
        Triangulo t = new Triangulo(4, 2, 2);
        assertFalse(t.ehValido());
    }

    @Test
    void somaAeBMenorQueC() {
        Triangulo t = new Triangulo(1, 2, 4);
        assertFalse(t.ehValido());
    }

    @Test
    void somaAeCMenorQueB() {
        Triangulo t = new Triangulo(1, 4, 2);
        assertFalse(t.ehValido());
    }

    @Test
    void somaBeCMenorQueA() {
        Triangulo t = new Triangulo(4, 1, 2);
        assertFalse(t.ehValido());
    }
}