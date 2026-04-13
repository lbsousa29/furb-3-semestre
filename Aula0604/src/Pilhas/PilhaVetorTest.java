package Pilhas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PilhaVetorTest {

    @Test
    public void teste01() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void teste02() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        assertFalse(pilha.estaVazia());
    }

    @Test
    public void teste03() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(10);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.pop());
        assertEquals(20, pilha.pop());
        assertEquals(10, pilha.pop());
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void teste04() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(3);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertThrows(PilhaCheiaException.class, () -> {
            pilha.push(40);
        });
    }

    @Test
    public void teste05() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(3);

        assertThrows(PilhaVaziaException.class, () -> {
            pilha.pop();
        });
    }

    @Test
    public void teste06() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        assertEquals(30, pilha.peek());
        assertEquals(30, pilha.pop());
    }

    @Test
    public void teste07() {
        PilhaVetor<Integer> pilha = new PilhaVetor<>(5);
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        pilha.liberar();
        assertTrue(pilha.estaVazia());
    }

    @Test
    public void teste08() {
        PilhaVetor<Integer> p1 = new PilhaVetor<>(10);
        p1.push(10);
        p1.push(20);
        p1.push(30);

        PilhaVetor<Integer> p2 = new PilhaVetor<>(10);
        p2.push(40);
        p2.push(50);

        p1.concatenar(p2);

        assertEquals("50,40,30,20,10", p1.toString());
        assertEquals("50,40", p2.toString());
    }
}