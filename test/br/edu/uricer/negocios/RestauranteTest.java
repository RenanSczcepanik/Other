package br.edu.uricer.negocios;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestauranteTest {
    
    @Test
    public void listarMesasLivres(){
        Restaurante teste = new Restaurante();
        assertEquals(6, teste.listarMesasLivres().size());
    }
    @Test
    public void ocuparMesa(){
        Restaurante teste = new Restaurante();
        List<Mesa> livre = teste.listarMesasLivres();
        teste.ocuparMesa(livre.get(0));
        assertEquals(5, teste.listarMesasLivres().size());
    }
}
