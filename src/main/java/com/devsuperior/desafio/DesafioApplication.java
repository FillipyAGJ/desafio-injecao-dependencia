package com.devsuperior.desafio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;

@SpringBootApplication

public class DesafioApplication implements CommandLineRunner{

	@Autowired
	public OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Order order = new Order(1034, 150, 20);
		System.out.printf("Pedido código %d \n", order.getCode());
		System.out.printf("Valor total: R$ %.2f \n", orderService.total(order));
		
		Order order2 = new Order(2282, 800, 10);
		System.out.printf("Pedido código %d \n", order2.getCode());
		System.out.printf("Valor total: R$ %.2f \n", orderService.total(order2));
		
		Order order3 = new Order(1309, 95.90, 0);
		System.out.printf("Pedido código %d \n", order3.getCode());
		System.out.printf("Valor total: R$ %.2f \n", orderService.total(order3));
		
	}

}
