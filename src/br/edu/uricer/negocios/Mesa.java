package br.edu.uricer.negocios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private boolean ocupada;
    private List<Item> itens = new ArrayList<>();;
    private BigDecimal valorTotal;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public void totalizar(){
        
    }
    public void adicionarItem(Produto produto, BigDecimal quantidade){
        Item novoItem = new Item();
        novoItem.setProduto(produto);
        novoItem.setQtd(quantidade);
        novoItem.setValorUnitario(produto.getPreco());
        itens.add(novoItem);
    }
    public void ocupar(){
        ocupada = true;
    }
    public void desocupar(){
        ocupada = false;
    }
}
