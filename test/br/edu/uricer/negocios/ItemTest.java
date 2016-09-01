package br.edu.uricer.negocios;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ItemTest {
    
    public ItemTest() {
    }
    @Test
    public void testaItem(){
        Produto produto = new Produto();
        Item item = new Item();
        item.setProduto(produto);
        item.setQtd(new BigDecimal("2"));
        item.setValorUnitario(new BigDecimal("3.50"));
        
        item.totalizar();
        
        assertEquals(new BigDecimal("7.00"), item.getValorTotal());
    }
    
}
