package Model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private int numeroNota;
	private double valorTotal;
	private List<ItemPedido> itens;

	public Pedido() {
		this.itens = new ArrayList<>();
	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() {
		for(ItemPedido item : itens){
			double sub = item.getProduto().getValor() * item.getQuantidade();
			valorTotal += sub;
		}
		return valorTotal;
	}

	public void adicionaItem(ItemPedido item) {
		this.itens.add(item);
	}
	
	
	
	

}
