package br.edu.uricer.negocios;

import java.math.BigDecimal;
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

    @Test
    public void deveTotalizarItensDaMesa() {
        Produto coca = new Produto();
        coca.setDescricao("Coca Cola");
        coca.setPreco(new BigDecimal("1.50"));

        Produto suco = new Produto();
        suco.setDescricao("Suco de laranja");
        suco.setPreco(new BigDecimal("1.0"));

        Mesa mesa = new Mesa(1);
        mesa.adicionarItem(coca, new BigDecimal("1"));
        mesa.adicionarItem(suco, new BigDecimal("2"));

        mesa.totalizar();

        assertEquals(new BigDecimal("3.50"), mesa.getValorTotal());
    }
}
