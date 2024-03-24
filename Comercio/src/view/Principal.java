package view;

import Model.ItemPedido;
import Model.Pedido;
import Model.Produto;

public class Principal {

	public static void main(String[] args) {
		Produto p1 = new Produto(001, 250.00, "Poster");
		Produto p2 = new Produto(002, 3000.00, "Ticket - FRONT VIEW");
		Produto p3 = new Produto(003, 15000.00, "Meet and greet with Lady Gaga");
		
		ItemPedido item1 = new ItemPedido(p1, 2);
		ItemPedido item2 = new ItemPedido(p2, 1);
		ItemPedido item3 = new ItemPedido(p3, 1);
		
		Pedido pedido = new Pedido();
		pedido.adicionaItem(item1);
		pedido.adicionaItem(item2);
		pedido.adicionaItem(item3);
		
		System.out.println(pedido.getValorTotal());

	}

}
