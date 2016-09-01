package br.edu.uricer.negocios;

import org.junit.Test;
import static org.junit.Assert.*;

public class MesaTest {

    public MesaTest() {
    }

    @Test
    public void deveIniciarComoDesocupada() {
        Mesa mesa = new Mesa(1);
        assertEquals(false, mesa.isOcupada());
    }

    @Test
    public void deveRetornarOcupadaAposOcupar() {
        Mesa mesa = new Mesa(1);
        mesa.ocupar();
        assertEquals(true, mesa.isOcupada());
    }
}
